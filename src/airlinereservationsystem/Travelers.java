package airlinereservationsystem;
public class Travelers {
    private String name;
    private String passportNumber;
    
    public Travelers(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }   
    public Travelers() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public void enterName(String name){
        setName(name);
    }
    public void enterpassportNumber(String number){        
        setPassportNumber(number);
    }
    @Override
    public String toString() {
        return "Travelers{" + "name=" + name + ", passportNumber=" + passportNumber + '}';
    }  
}
