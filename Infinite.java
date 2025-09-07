//Write an in infinite loop using do while condition.
import java.util.*;
class Infinite{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num: ");
		int a = sc.nextInt();
		do{
			System.out.print("Current value of a: "+a);
			a++;
		}while(true);
	}
}
