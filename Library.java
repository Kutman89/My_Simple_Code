package OOP;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    //добавление книг
    public void addBook(Book book){
        books.add(book);
        System.out.println("Кника: " + book.getTitle() + " Добавлена");
    }
    public void LibraryInfo(){
        if(books.isEmpty()){
            System.out.println("Библиотека пустая");
        }else{
            System.out.println("Список книг");
            for(Book book : books){
                book.BookInfo();
            }
        }
    }

}
