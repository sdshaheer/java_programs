/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment5;


import java.util.Scanner;
public class Experiment5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter a word");
        word = input.nextLine();
        if(Binarysearch(word))
        System.out.println("found");
        else
        System.out.println("not found");
    }
    public static boolean Binarysearch(String word){
        String[] dictionary = {"apple","boolean","country","effective","function","goodnight","icecream","joker","lemon"};
        int lb = 0,ub=dictionary.length-1;
        int mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(dictionary[mid].compareTo(word)==0)
                return true;
            else if(dictionary[mid].compareTo(word)>0)
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        return false;
    }
}



