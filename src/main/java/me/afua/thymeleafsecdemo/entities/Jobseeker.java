package me.afua.thymeleafsecdemo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Jobseeker {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
@NotNull
private String duty;

@NotNull
private String field_of_skill;

@NotNull
private String level_of_skill;

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getField_of_skill() {
        return field_of_skill;
    }

    public void setField_of_skill(String field_of_skill) {
        this.field_of_skill = field_of_skill;
    }

    public String getLevel_of_skill() {
        return level_of_skill;
    }

    public void setLevel_of_skill(String level_of_skill) {
        this.level_of_skill = level_of_skill;
    }

    @NotNull
        private String full_name;

         @NotNull
         private String email;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @NotNull
         private String level_of_education;

         @NotNull
         private String field_of_study;

         @NotNull
         private String wherestudy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel_of_education() {
        return level_of_education;
    }

    public void setLevel_of_education(String level_of_education) {
        this.level_of_education = level_of_education;
    }

    public String getField_of_study() {
        return field_of_study;
    }

    public void setField_of_study(String field_of_study) {
        this.field_of_study = field_of_study;
    }

    public String getWherestudy() {
        return wherestudy;
    }

    public void setWherestudy(String wherestudy) {
        this.wherestudy = wherestudy;
    }

    public String getWhenstudy() {
        return whenstudy;
    }

    public void setWhenstudy(String whenstudy) {
        this.whenstudy = whenstudy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWherework() {
        return wherework;
    }

    public void setWherework(String wherework) {
        this.wherework = wherework;
    }

    public String getWhenwork() {
        return whenwork;
    }

    public void setWhenwork(String whenwork) {
        this.whenwork = whenwork;
    }

    @NotNull

         private String whenstudy;

         @NotNull
        private String position;


         @NotNull
        private String wherework;


         @NotNull
        private String whenwork;

    }
