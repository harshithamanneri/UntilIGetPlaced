package UntilIGetPlaced.GoAhead;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(temp==rev){
            System.out.println("Palindrome  number");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    
}
