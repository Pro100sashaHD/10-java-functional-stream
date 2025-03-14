package com.example.task05;

public class Salary implements Mail<Integer>{
    private String from;
    private String to;
    private Integer content;

    Salary(String from, String to, int content){
        this.from = from;
        this.to = to;
        this.content = content;
    }
    public String getFrom(){
        return from;
    }
    public String getTo(){
        return to;
    }
    public Integer getContent(){
        return content;
    }
}
