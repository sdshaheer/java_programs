/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment13;
import java.util.*;

public class Experiment13 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int a=sc.nextInt();
            System.out.println("Enter a number");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Dividing "+a+" & "+b+" we get "+c);
        }
        catch(ArithmeticException e){
            System.out.println("cant divide witn zero");
        }
        catch(InputMismatchException e){
            System.out.println("dont enter a string");
        }
    }
    
}
