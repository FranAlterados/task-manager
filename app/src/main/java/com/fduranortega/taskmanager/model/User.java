package com.fduranortega.taskmanager.model;

import com.fduranortega.taskmanager.model.enums.Role;
import com.fduranortega.taskmanager.model.enums.Skill;

import java.util.List;

/**
 * Created by YitaN on 02/07/2017.
 */
public class User {
    private Integer id;
    private String alias;
    private String password;
    private String name;
    private String surname;
    private List<Skill> skillList;
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
