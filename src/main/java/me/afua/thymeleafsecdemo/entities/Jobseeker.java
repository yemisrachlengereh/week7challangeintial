package me.afua.thymeleafsecdemo.entities;

import org.hibernate.validator.constraints.NotEmpty;

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
@NotEmpty
private String duty;

@NotEmpty
private String fullname;



    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }



    public String getFieldofstudy() {
        return fieldofstudy;

    }

    public void setFieldofstudy(String fieldofstudy) {
        this.fieldofstudy = fieldofstudy;
    }

    public String getLevelofstudy() {
        return levelofstudy;
    }

    public void setLevelofstudy(String levelofstudy) {
        this.levelofstudy = levelofstudy;
    }

    @NotEmpty

private String levelofstudy;



    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @NotEmpty
    private String fieldofstudy;

    @NotEmpty
    private String fieldofskill;

    @NotEmpty
    private String levelofskill;




         @NotNull
         private String email;




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

    public String getFieldofskill() {
        return fieldofskill;
    }

    public void setFieldofskill(String fieldofskill) {
        this.fieldofskill = fieldofskill;
    }

    public String getLevelofskill() {
        return levelofskill;
    }

    public void setLevelofskill(String levelofskill) {
        this.levelofskill = levelofskill;
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
