/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author LENOVO.SXO10
 */
public class book {
    String name ;
    String ISBN;
    String Author_name;
    String publisher;

    public book() {
        name="NULL";
        ISBN="NULL";
        Author_name="NULL";
        publisher="NULL";
    }

    public book(String name, String ISBN, String Author_name, String publisher) {
        this.name = name;
        this.ISBN = ISBN;
        this.Author_name = Author_name;
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor_name(String Author_name) {
        this.Author_name = Author_name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public void getbookinfo(){
    System.out.println("Name :"+name);
    System.out.println("ISBN :"+ISBN);
    System.out.println("Author_name :"+Author_name);
    System.out.println("publisher :"+Author_name);
    }
    
}
