package OOP;
//Библиотека
//Создайте класс Book (название, автор, год) и класс
// Library для хранения списка книг. Реализуйте метод добавления книги.
public class Book {
    private String title;
    private String author;
    private int year;
    public Book(String name, String author, int year){
        this.title = name;
        this.author = author;
        this.year = year;
    }
    public void BookInfo(){
        System.out.println("Title :" + title + " Author: "+author+" year: "+year);
    }
    // Сеттеры
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setYear(int year) {this.year = year;}
    // Геттеры
    public String getTitle() {return title;}
    public int getYear() {return year;}
    public String getAuthor() {return author;}
}
