import java.util.*; //IMPORTING ALL CLASSES FROM UTILITY PACKAGE
public class Armstrong
{ // 153 sum of cube of digits = number itself
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // SCANNER OBJECT
        System.out.println("Enter a number");
        int n = sc.nextInt(); //USER INPUT NUMBER

        int temp, digit, sum=0;
        for(temp=n;temp!=0;temp/=10)
        {
            digit = temp %10;
            sum = sum+ (digit*digit*digit); // SUM OF CUBE OF DIGITS
        }
        if (sum==n) // CONDITION FOR ARMSTRONG
            System.out.println(sum+" is Armstrong");
        else
            System.out.println(n+" is not Armstrong");
    }
}