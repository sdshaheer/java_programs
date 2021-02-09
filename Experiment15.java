/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment15;
import java.util.*;
class MyThread extends Thread{
    Random rand;
    public MyThread(){
        rand=new Random();
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
        int num=rand.nextInt(100);
        System.out.println("Random number is "+num);
        if(num%2==0){
            Square s=new Square(num);
            s.run();
        }
        else{
            Cube c=new Cube(num);
            c.run();
        }
        try{
            sleep(1000);
        }
        catch(Exception e){
            System.out.println("error occured");
        }
        }
    }
}
class Square extends Thread{
    private static int num;
    public Square(int a){
        this.num=a;
    }
    public void run(){
        System.out.println("Square is "+num*num);
    }
}
class Cube extends Thread{
    private static int num;
    public Cube(int a){
        this.num=a;
    }
    public void run(){
        System.out.println("Cube of number is "+num*num*num);
    }
}
public class Experiment15 {

    public static void main(String[] args) {
        // TODO code application logic here
        MyThread t=new MyThread();
        t.start();
    }
    
}
