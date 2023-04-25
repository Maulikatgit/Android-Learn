package com.example.mini_project;

public class Modelclass {

    private String quetion;
    private String Oa;
    private String Ob;
    private String Oc;
    private String Od;
    private String ans;

    Modelclass(){

    }

    public Modelclass(String quetion, String oa, String ob, String oc, String od, String ans) {
        this.quetion = quetion;
        this.Oa = oa;
        this.Ob = ob;
        this.Oc = oc;
        this.Od = od;
        this.ans = ans;
    }

    public String getQuetion() {
        return quetion;
    }

    public void setQuetion(String quetion) {
        this.quetion = quetion;
    }

    public String getOa() {
        return Oa;
    }

    public void setOa(String oa) {
        Oa = oa;
    }

    public String getOb() {
        return Ob;
    }

    public void setOb(String ob) {
        Ob = ob;
    }

    public String getOc() {
        return Oc;
    }

    public void setOc(String oc) {
        Oc = oc;
    }

    public String getOd() {
        return Od;
    }

    public void setOd(String od) {
        Od = od;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}

