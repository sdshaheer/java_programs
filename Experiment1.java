/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;
import java.io.*;
import java.util.Scanner;
class Invoice{
        //Define instance variables here
        private String partNumber;
        private String description;
        private int quantity;
        private double price;
        //Define parameterized constructor here
        public Invoice(String partNumber,String description,int quantity,double price){
            setpartNumber(partNumber);
            setdescription(description);
            setquantity(quantity);
            setprice(price);
        }
       // Setters
       public void setpartNumber(String partnumber){
           this.partNumber=partnumber;
       }
       public void setdescription(String description){
           this.description=description;
       }
       public void setquantity(int quantity){
           this.quantity=(quantity>0?quantity:0);
       }
       public void setprice(double price){
           this.price=(price>0.0?price:0.0);
       }

       // Getters
       public String getpartNumber(){
           return partNumber;
       }
       public String getdescription(){
           return description;
       }
       public int getquantity(){
           return quantity;
       }
       public double getprice(){
           return price;
       }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                invoiceAmount=quantity*price;
                return invoiceAmount;
       }
}
public class Experiment1{
         public static void main(String []args){
                   Invoice myInvoice;
                   //Write your code here
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter part number");
                   String a=sc.next();
                   System.out.println("Enter your description");
                   String b=sc.next();
                   System.out.println("Enter quantity");
                   int c=sc.nextInt();
                   System.out.println("Enter price");
                   double d=sc.nextInt();
                   myInvoice=new Invoice(a,b,c,d);
                   System.out.println("partNumber="+myInvoice.getpartNumber());
                   System.out.println("description="+myInvoice.getdescription());
                   System.out.println("quantity="+myInvoice.getquantity());
                   System.out.println("price="+myInvoice.getprice());
                   System.out.println("InvoiceAmount="+myInvoice.getInvoiceAmount());
                   
         }
}







