package com.lcw.web.download;

import com.lcw.web.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Create by chuanwen.li on 2019/6/13
 */
@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取请求参数，文件名称
        String filename = request.getParameter("filename");


        //使用字节输入流加载文件进内存
        //获取Servlet对象
        ServletContext context = this.getServletContext();

        //获取文件真实路径
        String realPath = context.getRealPath("/img/" + filename);

        //创建输入流
        FileInputStream fis = new FileInputStream(realPath);


        //设置响应头类型

        String mimeType = context.getMimeType(filename);

        response.setHeader("content-type", mimeType);

        //设置响应头打开方式:content-disposition
        //解决中文文件名问题
        //获取浏览器类型
        String agent = request.getHeader("user-agent");

        //得到编码之后的文件名
        filename = DownLoadUtils.getFileName(agent, filename);


        response.setHeader("content-disposition", "attachment;filename=" + filename);

        //创建输出流
        ServletOutputStream ops = response.getOutputStream();


        //将输入流中的数据写出到输出流
        byte[] bytes = new byte[1024 * 8];
        int len = 0;

        while ((len = fis.read(bytes)) != -1) {

            ops.write(bytes, 0, len);

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
