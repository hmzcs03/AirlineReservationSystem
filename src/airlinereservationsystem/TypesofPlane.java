package airlinereservationsystem;
public enum TypesofPlane{
    //The capacity we set is default.....
    AIRBUS(" Capasity is :0-250 passenger"),
    BOEING(" Capasity is :0-200 passenger"),
    AIRBUS20(" Capasity is :0-320 passenger"),
    BOEING70(" Capasity is :0-260 passenger");
    private String string;
    TypesofPlane(String sta){
        this.string=sta;
    } 
    TypesofPlane(){}
    public String getString() {
        return string;
    }
    public void setString(String string){        
        this.string = string;        
    }  
}
