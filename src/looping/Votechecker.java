package looping;
import java.util.Scanner;
public class Votechecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("The person's age is"+age+ "and can vote");
		}else {
			System.out.println("The person's age is"+age+ " cannote vote");
		}

	}

}