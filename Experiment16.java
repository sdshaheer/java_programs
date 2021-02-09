/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment16;

class Control{
    Boolean isproduce=false;
    int count=0;
    public synchronized void produce(){
        if(isproduce)
            try{wait();}catch(Exception e){}
        count++;
        System.out.println("produced "+count);
        isproduce=true;
        notify();
        
    }
    public synchronized void consume(){
        if(!isproduce)
            try{wait();}catch(Exception e){}
        System.out.println("consumed "+count);
        isproduce=false;
        notify();
    }
}
class Producer implements Runnable{
    Control c;
    public Producer(Control c) {
        this.c=c;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            c.produce();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Consumer implements Runnable{
    Control c;
    public Consumer(Control c){
        this.c=c;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            c.consume();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
public class Experiment16{

	public static void main(String[] args) {
		// TODO Auto-generated method
            Control c=new Control();
            Thread t1=new Thread(new Producer(c));
            Thread t2=new Thread(new Consumer(c));
            t1.start();
            t2.start();
	}

}

