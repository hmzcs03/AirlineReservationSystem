package airlinereservationsystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class AirPort {
    Scanner in =new Scanner(System.in);
    private String name="Alshboul";
    private String Location="Amman-Jordan";
    private String Creationdate="5/10/2024";
    ArrayList<Travelers>arrTravel=new ArrayList<>();
    public AirPort() {
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return Location;
    }
    public String getCreationdate() {
        return Creationdate;
    }
    public ArrayList<Travelers> getArrTravel() {
        return arrTravel;
    }
    public  void printOverview(){
            System.out.println("Welcome to the company "+getName()+" We will give you an overview of the system :-");
            System.out.println("Our company is still at the beginning owns a few types of Planes......");
            System.out.println("some the Types from Planes :");
            int number=1;
            //Here we printed all the elements inside the Enum...
            for (TypesofPlane TOP : TypesofPlane.values()) {
                System.out.println(number+"-"+TOP+" "+TOP.getString());
                number++;
            }   
     }
    public void EnterTraveler(Travelers traveler){
          arrTravel.add(traveler);
    }
    public void logInSystem() throws FileNotFoundException{
         Travelers ST=new Travelers();
         System.out.println("Welcome to the company "+getName()+"For flights");
         System.out.println("please Enter your name:-");
         ST.enterName(in.next());        
         System.out.println("please Enetr passportNumber:-");
         String enterpass=in.next();
         ST.enterpassportNumber(enterpass);
         if(accepted(enterpass)){
            EnterTraveler(ST);
            System.out.println("Accepterd");
            //this we used File Handling (FileWriter)...................
            File file =new File("NamePass.txt");        
            PrintWriter pw=new PrintWriter(file);
            for (Travelers travel : arrTravel) {
                 pw.println("Name: "+travel.getName()+", PassportNumber: "+travel.getPassportNumber());
            }
            pw.flush();
            pw.close();
         }
         else{
             System.out.println("Not Accepted");
         }
         
    }
    public void printPassinger() throws FileNotFoundException{
        File file=new File("NamePass.txt");
        Scanner in =new Scanner(file);
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
     }
    //check if length password equals (10)
    public boolean accepted(String string){
        if(string.length()==10)
            return true;
        else 
            return false;
    }
        
    @Override
    public String toString() {
        return "AirPort{" + "name=" + name + ", Location=" + Location + ", Creationdate=" + Creationdate + '}';
    }  
}