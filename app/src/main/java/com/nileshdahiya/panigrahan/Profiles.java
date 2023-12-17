package com.nileshdahiya.panigrahan;

public class Profiles {

    private String name,father,gfather,location,dob,gotra,rashi,sibcount,job,edu,height,weight,scol,hobby,about;

    public Profiles() {
        //blank for firestore
    }

    public Profiles(String name, String father, String gfather, String location, String dob, String gotra, String rashi, String sibcount, String job, String edu, String height, String weight, String scol, String hobby, String about) {
        this.name = name;
        this.father = father;
        this.gfather = gfather;
        this.location = location;
        this.dob = dob;
        this.gotra = gotra;
        this.rashi = rashi;
        this.sibcount = sibcount;
        this.job = job;
        this.edu = edu;
        this.height = height;
        this.weight = weight;
        this.scol = scol;
        this.hobby = hobby;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getGfather() {
        return gfather;
    }

    public void setGfather(String gfather) {
        this.gfather = gfather;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGotra() {
        return gotra;
    }

    public void setGotra(String gotra) {
        this.gotra = gotra;
    }

    public String getRashi() {
        return rashi;
    }

    public void setRashi(String rashi) {
        this.rashi = rashi;
    }

    public String getSibcount() {
        return sibcount;
    }

    public void setSibcount(String sibcount) {
        this.sibcount = sibcount;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getScol() {
        return scol;
    }

    public void setScol(String scol) {
        this.scol = scol;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
