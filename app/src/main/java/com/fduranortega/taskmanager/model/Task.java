package com.fduranortega.taskmanager.model;

import com.fduranortega.taskmanager.model.enums.Skill;

import java.util.Date;

/**
 * Created by YitaN on 02/07/2017.
 */
public class Task {
    private Integer idUser;
    private String description;
    private Integer duration;
    private Skill skill;
    private Date date;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
