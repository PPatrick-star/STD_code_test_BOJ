import java.util.Scanner;

public class Main {
    
    public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int score[] = new int[count];

		for(int i = 0; i < count ; i ++) {
				score[i] = sc.nextInt();
		}
		
		long maxScore = 0;
		long sumScore = 0;
		
		for(int i = 0; i < count ; i ++) {
			if (score[i] > maxScore) {
				maxScore = score[i];
			}
			sumScore = sumScore + score[i];
		}
		System.out.println(sumScore*100.0/maxScore/count);
	}
}