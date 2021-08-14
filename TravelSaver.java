import java.util.Scanner;
public class TravelSaver{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Investment in the company : ");
        int invest = sc.nextInt();
        System.out.print("Enter the share price of the company : ");
        int share = sc.nextInt();
        double increase = invest*74.3;
        System.out.println("Investment amount after increase the intrest rate : "+increase);
        double per = increase/(10);
        System.out.println("The tax to be paid on the total shares at 10% : "+per);
        double profit = increase - per;
        System.out.println("Total profit in INR is : "+profit);
        System.out.println("The Total profit coverted in doller : "+(profit/74.3));

    }

}