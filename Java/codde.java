import java.util.Scanner ;

public class AddDollar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        //String dollarNumber = "";
        //char ch = 24;
        while(number!=0){
        int remainder = number%10;
        //dollarNumber = remainder + ch ;
        System.out.print(remainder+"$");
        number=number/10;
        }
        sc.close() ;
    }
}
