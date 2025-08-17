package com.wlg.laomashuchengjihe;

public class Book {
    //属性
    //书籍编号：
    private int bNo;
    //书籍名称：
    private String bName;
    //书籍作者：
    private String bAuthor;

    public int getBNo() {
        return bNo;
    }

    public void setBNo(int bNo) {
        this.bNo = bNo;
    }

    public String getBName() {
        return bName;
    }

    public void setBName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book(int bno, String bname, String bAuthor) {
        this.bNo = bno;
        this.bName = bname;
        this.bAuthor = bAuthor;
    }

    public Book() {
    }
}
