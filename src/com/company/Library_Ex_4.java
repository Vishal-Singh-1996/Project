package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }
     void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
//            String b=this.books[i];
        if(this.books[i].equals(book)){
            System.out.println("The book has been issued!");
            this.books[i]=null;
            return;
        }
//            System.out.println("*"+book);
        }
        System.out.println("This book does not available");

    }
     void returnBook(String book){
        this.books[no_of_books]=book;
//         System.out.println("Successfully Return");
        addBook(book);

    }
    void showAvailableBook(){
        System.out.println("Available books are");
        for(String book:this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+book);
        }

    }
     void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"has been added!");


    }
}
public class Library_Ex_4 {
    public static void main(String[] args) {
        Library centralLibrary=new Library();
        centralLibrary.addBook("Think and grow book");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("C++");
//        centralLibrary.returnBook("Python");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("Python");
        centralLibrary.showAvailableBook();


    }
}
