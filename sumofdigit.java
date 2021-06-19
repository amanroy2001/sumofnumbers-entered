package codewithaman;
import java.util.Scanner;
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 System.out.println("enter any number b/w o to 1000");
 int a = sc.nextInt();
 int sum=0;
 while( a != 0) {
	 
	 sum=sum +(a%10);
	 a=a/10;
 }
	 
System.out.println("sum of digits are "+sum);
}
}