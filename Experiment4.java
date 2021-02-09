package experiment4;
import java.io.*;
import java.util.*;
class Book{
    String bookName;
    String isbn;
    String author;
    String publisher;
    public Book(){
     this.bookName="java programming";
     this.author="Harshe bhogle";
     this.publisher="olympia";
     this.isbn="978-81-940554-3-3";
        
    }
    public String getbookName(){
        return this.bookName;
    }
    public String getauthor(){
        return this.author;
    }
    public String getpublisher(){
        return this.publisher;
    }
    public String getisbn(){
        return this.isbn;
    }
    
    public void setbookName(String bookname){
        this.bookName=bookname;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    public void setisbn(String isbn){
        this.isbn=isbn;
    }
    
    public String getBookInfo(){
        String a=author+" is author of the book "+getbookName()+" and "+getpublisher()+" is the publisher with ISBN "+getisbn();
        return a;
        
    }
}

public class Experiment4{
    public static void main(String args[]){
        Book bk[]=new Book[30];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<30;i++){
            bk[i]=new Book();
            System.out.println("Enter book "+(i+1)+" details");
            System.out.println("Enter book name");
            String a=sc.next();
            bk[i].setbookName(a);
            System.out.println("Enter book author name");
            String b=sc.next();
            bk[i].setauthor(b);
            System.out.println("Enter book publisher");
            String c=sc.next();
            bk[i].setpublisher(c);
            System.out.println("Enter book ISBN number");
            String d=sc.next();
            bk[i].setisbn(d);
           
        }
        for(int i=0;i<30;i++){
            System.out.println(bk[i].getBookInfo());
        }
    }
}





