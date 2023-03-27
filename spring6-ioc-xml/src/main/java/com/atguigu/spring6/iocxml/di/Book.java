package com.atguigu.spring6.iocxml.di;

/**
 * @Author: dev_guo
 * @Date: 2023/3/22 14:52
 */
public class Book {
    private String bname;
    private String author;
    private String other;
    public Book() {
        System.out.println("WU参构造执行。。。。");
    }

    public Book(String bname, String author) {
        System.out.println("有参构造执行。。。。");
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("dev");
        System.out.println(book);
        Book dev = new Book("C++", "DEV");
        System.out.println(dev.toString());
    }
}
