public class Driver{
    private String first_name;
    private String last_name;
    private String email;
    private int age;
    private Boolean license;
    private int phoneNumber;
    private Vehicle[] VehicleList;
    Driver(){
        return;
    }
    public String GetName(){
        return first_name + last_name;
    }
    public String[] GetDetails(){
        String[] result ={first_name, last_name,
                             email, Integer.toString(age), 
                            Boolean.toString(license),
                            Integer.toString(phoneNumber)};
        return result;
        }

    public int getID(String username, String password){
        //This would be done via the db 
        //Fake ID given
        return 1;

    }
    public void addVehicle(Vehicle v){
        VehicleList.add(v);
    }
    public void ShowVehicles(){
        for (int i = 0; i < VehicleList.length; i++ ){

            System.out.println("Car " + i + ". :"+ VehicleList[i].GetReg());
        }
        
    }

}