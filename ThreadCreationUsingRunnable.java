import java.io.*;
import java.util.*;
class Main implements Runnable{
    public void run(){
        System.out.println("Thread was created and it is running");
    }
    public static void main(String args[])
    {
        Main tc2=new Main();
        Thread t=new Thread(tc2);
        t.start();
    }
}
