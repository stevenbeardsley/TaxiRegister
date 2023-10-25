import java.util.Scanner;

public class TaxiRegister {
    public Driver driver;
    public  void main(String[] args){
        //Ask to login
        Boolean login = true ;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to the Taxi Register!");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a passsword");
        String password  = scanner.nextLine();
        //Check Username and password
        if (login){//WIll be updated to check db
            driver = new Driver();
            int id = driver.getID(username, password);
            DisplayDriverMenu();

        }
    }   

    public void DisplayDriverMenu(){
        System.out.println("DRIVER OPTIONS");
        System.out.println("1. Add Vehicle");
        System.out.println("2. Edit Vehicle");
        System.out.println("View vehicle");
        Scanner scanner  = new Scanner (System.in);
        String choice = scanner.nextLine();
        if (choice =="1"){
            Vehicle vehicle = new Vehicle();
            vehicle.AddDetails();
        }
        if (choice =="2"){
            driver.ShowCars();
            String username = scanner.nextLine();
        }
    }   

        public void Login(){
            ;
        }

        public void Register(){
            return;
        }
        public void AddVehicle(){
            ;
        }


}
