package com.example.demo.entity;

import java.util.Date;

public class Post {
    private Integer id;

    private String icon;

    private String title;

    private String phone;

    private String phonetype;

    private Date time;

    private Integer studentnumber;

    private Integer clicknumber;

    public Post(Integer id, String icon, String title, String phone, String phonetype, Date time, Integer studentnumber, Integer clicknumber) {
        this.id = id;
        this.icon = icon;
        this.title = title;
        this.phone = phone;
        this.phonetype = phonetype;
        this.time = time;
        this.studentnumber = studentnumber;
        this.clicknumber = clicknumber;
    }

    public Post() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype == null ? null : phonetype.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(Integer studentnumber) {
        this.studentnumber = studentnumber;
    }

    public Integer getClicknumber() {
        return clicknumber;
    }

    public void setClicknumber(Integer clicknumber) {
        this.clicknumber = clicknumber;
    }
}