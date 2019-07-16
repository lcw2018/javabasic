package com.lcw.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lcw.domain.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Create by chuanwen.li on 2019/5/27
 */
public class JacksonTest {


    //Java对象转换成json字符串
    @Test
    public void test1() throws IOException {


        //        1.创建person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(27);
        person.setGender("男");

        //        2.创建jackson的核心对象

        ObjectMapper objectMapper = new ObjectMapper();
//3.转换
        /*

            转换方法：
                writeValue(参数1，obj):
                    参数1：
                        File：将obj对象转换为JSON字符串，并保存到指定的文件中
                        Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
                        OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
                writeValueAsString(obj):将对象转为json字符串

         */
        String json = objectMapper.writeValueAsString(person);
        //{"name":"张三","age":27,"gender":"男","birthday":null}
        //{"name":"张三","age":27,"gender":"男"}
        System.out.println(json);


        //writeValue，将数据写到d://a.txt文件中


        objectMapper.writeValue(new File("d://a.txt"), person);

        //writeValue.将数据关联到Writer中
        objectMapper.writeValue(new FileWriter("d://b.txt"), person);

    }


    @Test
    public void test2() throws JsonProcessingException {


        Person person = new Person();

        person.setName("李四");

        person.setAge(25);

        person.setGender("男");

        person.setBirthday(new Date());


        ObjectMapper objectMapper = new ObjectMapper();


        String json = objectMapper.writeValueAsString(person);
        //{"name":"李四","age":25,"gender":"男","birthday":1558950205648}
//        {"name":"李四","age":25,"gender":"男","birthday":"2019-05-27"}
        System.out.println(json);


    }


    @Test
    public void test3() throws JsonProcessingException {

//        1.创建对象

        Person p = new Person();
        p.setName("张三");
        p.setAge(28);
        p.setGender("男");
        p.setBirthday(new Date());


        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(28);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("张三");
        p2.setAge(28);
        p2.setGender("男");
        p2.setBirthday(new Date());


//2.创建list集合
        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        people.add(p1);
        people.add(p2);


//        3.转换


        ObjectMapper mapper = new ObjectMapper();


        String json = mapper.writeValueAsString(people);
//[{},{},{}]
//[{"name":"张三","age":28,"gender":"男","birthday":"2019-05-27"},{"name":"张三","age":28,"gender":"男","birthday":"2019-05-27"},{"name":"张三","age":28,"gender":"男","birthday":"2019-05-27"}]
        System.out.println(json);


    }


    @Test
    public void test4() throws JsonProcessingException {


//        1.创建集合

        HashMap<String, Object> map = new HashMap<>();

        map.put("name", "张三");
        map.put("age", 28);
        map.put("gender", "男");
        map.put("birthday", new Date());

        //2,.转换


        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(map);

        System.out.println(json);
        //{"birthday":1558951453398,"gender":"男","name":"张三","age":28}


    }

    //将json字符串转换为对象
    @Test
    public void test5() throws IOException {

        String json = "{\"name\":\"李四\",\"age\":25,\"gender\":\"男\",\"birthday\":\"2019-05-27\"}";

        ObjectMapper mapper = new ObjectMapper();


        Person person = mapper.readValue(json, Person.class);

        System.out.println(person);

         //Person{name='李四', age=25, gender='男', birthday=Mon May 27 08:00:00 CST 2019}
    }


}
