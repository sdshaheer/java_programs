/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.script.*;
/**
 *
 * @author syed shaheer
 */
class MYFrame extends JFrame implements ActionListener{
    JTextField text;
    String arr[]={"1","2","3","+","4","5","6","-","7","8","9","/","C","0","=","*"};
    JButton btn[]=new JButton[16];
    Container c;
    int x=1,y=1,k=1;
    String str="";
    public MYFrame(){
        c=this.getContentPane();
        setLayout(null);
        text=new JTextField();
        text.setBounds(50,20,200,30);
        c.add(text);
        for (int i = 0; i < arr.length; i++) {
            btn[i]=new JButton(arr[i]);
            if(i%4==0 && i!=0){
                k=1;
                y+=50;
            }
            btn[i].setBounds(50+k,100+y,50,50);
            btn[i].addActionListener(this);
            c.add(btn[i]);
            k+=50;
        }
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("hi");
        if(e.getSource()==btn[12]){
            text.setText("");
            str="";
        }
        else if(e.getSource()==btn[14]){
            try{
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result = engine.eval(text.getText());
            text.setText(String.valueOf(result));
            }
            catch(Exception ae){    
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(e.getSource()==btn[i]){
                    str+=btn[i].getText();
                    text.setText(str);
                    break;
                }
            }
        }
        System.out.println(str);
    }
    
}
public class Calculator {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MYFrame obj=new MYFrame();
        obj.setSize(500,700);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
