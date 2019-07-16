package com.lcw.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by chuanwen.li on 2019/4/29
 */

@Entity
@Table(name = "sys_role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;


    @ManyToMany(mappedBy = "set")
    private Set<User> set = new HashSet<User>();

    public Set<User> getSet() {
        return set;
    }

    public void setSet(Set<User> set) {
        this.set = set;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
