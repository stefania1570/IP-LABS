// Facut de Constantinescu Stefania si Dulhac Alexandru
class Passenger
{
    Passenger(){
        name="anon";
        firstName="anon";
    }
    Passenger(String n, String fN){
        name=n;
        firstName=fN;
    }
    String name;
    String firstName;
    void setName(String n)
    {
        name=n;
    }
    void setFirstName(String n)
    {
        firstName=n;
    }
    String getFirstName()
    {
        return firstName;
    }
    String getName()
    {
        return name;
    }
}
abstract class Car{
    String driver;
    Passenger[] passengerList=new Passenger[4];
    String type;
    Car(){
        type="undefined";
        driver="none";
    }
    Car(String driver, String type, Passenger[] passengerList)
    {
        this.driver = driver;
        this.passengerList[0] = passengerList[0];
        this.passengerList[1] = passengerList[1];
        this.passengerList[2] = passengerList[2];
        this.passengerList[3] = passengerList[3];
    }
    void setDriver(String driver)
    {
        this.driver = driver;
    }

    void setPassengerList(Passenger[] passengerList){
        this.passengerList[0] = passengerList[0];
        this.passengerList[1] = passengerList[1];
        this.passengerList[2] = passengerList[2];
        this.passengerList[3] = passengerList[3];
    }
    String getDriver()
    {return driver;}
    String getType()
    {return type;}
    Passenger[] getPassengerList()
    {return passengerList;}
    void showAll()
    {
        System.out.println(driver);
        System.out.println(type);
        for(int i = 0 ; i< 4; i++)
            System.out.println(passengerList[i]);
    }

}
class Diesel extends Car{
    Diesel(String driver, String type, Passenger[] passengerList)
    {
        this.driver = driver;
        this.type = "Diesel";
        this.passengerList[0] = passengerList[0];
        this.passengerList[1] = passengerList[1];
        this.passengerList[2] = passengerList[2];
        this.passengerList[3] = passengerList[3];
    }
    Diesel(){
        type="Diesel";
        driver="none";
    }

    public Diesel(String soferu, Passenger[] pl1) {
    }
}
class Electric extends Car{
    Electric(String driver, Passenger[] passengerList)
    {
        this.driver = driver;
        this.type = "Electric";
        this.passengerList[0] = passengerList[0];
        this.passengerList[1] = passengerList[1];
        this.passengerList[2] = passengerList[2];
        this.passengerList[3] = passengerList[3];
    }
    Electric(){
        type="Electric";
        driver="none";
    }
}
public class Main {
    public static void main(String[] args) {

        Passenger p1 = new Passenger("Solid","Snake");
        Passenger p2 = new Passenger("Isac","Newton");
        Passenger p3 = new Passenger("Gary","Kasparov");
        Passenger p4 = new Passenger("Constantinescu","Stefania");
        Passenger[] pl1 = new Passenger[4];
        pl1[0] = p1;
        pl1[1] = p2;
        pl1[2] = p3;
        pl1[3] = p4;
        Diesel masina1 = new Diesel("Soferu", pl1);
        Diesel masina2 = new Diesel("marian",pl1);
        Electric masina3 = new Electric("SOlid", pl1);
        Electric masina4 = new Electric("NUSH", pl1);
        masina1.showAll();
        masina2.showAll();
        masina3.showAll();
        masina4.showAll();
    }
}