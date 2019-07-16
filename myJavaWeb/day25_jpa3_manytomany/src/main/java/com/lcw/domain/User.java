package com.lcw.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by chuanwen.li on 2019/4/29
 */

@Entity
@Table(name = "sys_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_age")
    private Integer userAge;
    /**
     * 配置用户到角色的多对多关系
     * 配置多对多的映射关系
     * 1.声明表关系的配置
     *
     * @ManyToMany(targetEntity = Role.class)  //多对多
     * targetEntity：代表对方的实体类字节码
     * 2.配置中间表（包含两个外键）
     * @JoinTable name : 中间表的名称
     * joinColumns：配置当前对象在中间表的外键
     * @JoinColumn的数组 name：外键名
     * referencedColumnName：参照的主表的主键名
     * inverseJoinColumns：配置对方对象在中间表的外键
     */

    @ManyToMany(targetEntity = Role.class, cascade = CascadeType.ALL)
    @JoinTable(name = "sys_user_role",
            joinColumns = {@JoinColumn(name = "fk_user", referencedColumnName = "user_id")}
            , inverseJoinColumns = {@JoinColumn(name = "fk_role", referencedColumnName = "role_id")}
    )
    private Set<Role> set = new HashSet<Role>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Set<Role> getSet() {
        return set;
    }

    public void setSet(Set<Role> set) {
        this.set = set;
    }
}
