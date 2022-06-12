import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    
    public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberCount = sc.nextInt();
		
		String numberString = sc.next();
		char[] number = numberString.toCharArray();
		
		int sum = 0;

		for (int i = 0; i < number.length; i++) {
			sum += number[i] -'0';
		}
	
		System.out.print(sum);
	}
}