import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        String conn, cno, cname;
        String pmr, cmr;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter consumer number: ");
        cno = sc.next();
        System.out.println("Enter consumer name: ");
        cname= sc.next();
        System.out.println("Enter prev meter reading: ");
        pmr= sc.next();
        System.out.println("Enter curr meter reading: ");
        cmr = sc.next();
        System.out.println("Enter connection type (D/C): ");
        conn= sc.next();
        System.out.println("Enter Consumption Unit (KWH)");
        double units = sc.nextDouble();
        double amount;

        if(conn.equals("D"))

        if(units<=100){
            System.out.println("Total Bil: " + (amount=units*1) );
        }
        else if(units<=200)
            {System.out.println("Total Bill: " + (amount=units*2.5));}
        else if (units<=500)
           {System.out.println("Total Bill: " + (amount=units*4));}
        else
        {System.out.println("Total Bill: " + (amount=units*6));}
        
        if(conn.equals("C"))

        if(units<=100){
            System.out.println("Total Bill: " + (amount=units*2));
        }
        else if(units<=200)
            {System.out.println("Total Bill: " + (amount=units*4));}
        else if (units<=500)
           {System.out.println("Total Bill: " + (amount=units*6));}
        else
        {System.out.println("Total Bill: " + (amount=units*7));}
    }
}
