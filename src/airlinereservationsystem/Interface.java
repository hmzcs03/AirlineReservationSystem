package airlinereservationsystem;

import java.io.FileNotFoundException;
import java.util.Scanner;
//this class to talk Users................................
public class Interface {
    static Scanner in=new Scanner(System.in);
    public static  void intro(){
        AirPort ap=new AirPort(); 
        System.out.println("Welcome, dear, to the company "+ap.getName()+" For flights that Which is located in"+ap.getLocation()+"Which created in "+ap.getCreationdate()); 
        System.out.println("What do you want to do *choose Number* ?");
        System.out.println("1- System Overview :");
        System.out.println("2- Login To System : ");
        System.out.println("3- Print All Passenger : ");
    } 
    public static void elseProg() throws FileNotFoundException{  
        AirPort A=new AirPort();
        int enternumber;
        do{
        intro();
        enternumber=in.nextInt();          
        if(enternumber==1){         
            A.printOverview();
        }
        else if(enternumber==2){
            A.logInSystem();
        }   
        else if(enternumber==3){
            A.printPassinger();
        }
        
        else{
            System.out.println("plz enter one the number At the top........*");      
        }
    }while(enternumber!=0);
    }  
}