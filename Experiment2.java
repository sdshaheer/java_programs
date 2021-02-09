/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment2;
import java.io.*;
import java.util.*;
class ElectrictyBill{
    private int consumerNo;
    String consumerName;
    int previousMonth;
    int currentMonth;
    int connection;
    public ElectrictyBill(int num){
        consumerNo=num;
    }
    
    double domesticElectrictyBill(int units,int connection){
        if(connection==1){
            if(units<=100)
                return units;
            else if(units<=200)
                return (100+(units-100)*2.50);
            else if(units<=500)
                return (100+100*2.50+(units-200)*4);
            else 
                return (100+100*2.50+300*4+(units-500)*6);
        }  
        else{
            if(units<=100)
                return units*2;
            else if(units<=200)
                return (100*2+(units-100)*4.50);
            else if(units<=500)
                return (100*2+100*4.50+(units-200)*6);
            else 
                return (100*2+100*4.50+300*6+(units-500)*7);
        }
        
    }
    
}
public class Experiment2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your consumer no:");
        int number=sc.nextInt();
        sc.nextLine();
        ElectrictyBill eb=new ElectrictyBill(number);
        System.out.println("Enter your consumer name:");
        eb.consumerName=sc.nextLine();
        System.out.println("Enter your previous month reading:");
        eb.previousMonth=sc.nextInt();
        System.out.println("Enter your current month reading:");
        eb.currentMonth=sc.nextInt();
        System.out.println("Enter your connection type:");
        System.out.println("1.domestic\n2.commercial");
        eb.connection=sc.nextInt();
        System.out.println("Your Amount to be paid in current month="+eb.domesticElectrictyBill((eb.currentMonth-eb.previousMonth),eb.connection));
        
    }
}






