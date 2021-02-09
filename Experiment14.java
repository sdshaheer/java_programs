/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment14;

import java.util.*;
class Prime extends Thread{
    public Merge1 m1;
    public Prime(Merge1 m1){
        this.m1=m1;
    }
    public void run(){
        for (int i = 2; i < 20; i++) {
            int count=0;
            for (int j =1 ; j < 20; j++) {
                if(i%j==0)
                    count++;
            }
            if(count==2){
                m1.add(i);
            }
        }
    }
}
class Fibnocci extends Thread{
    public Merge2 m2;
    public Fibnocci(Merge2 m2){
        this.m2=m2;
    }
    public void run(){
        for (int i = 0; i < 20; i++) {
            int b=check(i);
            m2.add(b);
        }
    }
    public int check(int n){
        if(n<=1)
            return n;
        else
            return check(n-1)+check(n-2);
    }
}
class Merge1{
    public static Set<Integer> s1=new LinkedHashSet<>();
    public void add(int a){
        s1.add(a);
        System.out.println("prime "+s1);
    }
}
class Merge2{
    public static HashSet<Integer> s2=new LinkedHashSet<>();
    public void add(int a){
        s2.add(a);
        System.out.println("fibnocci "+s2);
    }
}
public class Experiment14 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Merge1 m1=new Merge1();
        //Merge2 m2=new Merge2();
        Prime p=new Prime(new Merge1());
        Fibnocci f=new Fibnocci(new Merge2());
        p.start();
        f.start();
        try{  
          f.join();  
        }
        catch(Exception e){
            System.out.println(e);
        }
        Merge1.s1.retainAll(Merge2.s2);
        System.out.println("common are "+Merge1.s1);
    }
    
}
