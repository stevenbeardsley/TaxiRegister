import java.util.Scanner;

public class Vehicle {
    String manufacturer;
    Boolean MOT;
    String reg;
    public Vehicle(){
        ;
    }
    public void AddDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a reg plate: ");
        setReg(scanner.nextLine());

    }
    public String GetReg(){
        return reg;
    }
    public void setReg(String regNum){
        reg = regNum;
        return;
    }
}
