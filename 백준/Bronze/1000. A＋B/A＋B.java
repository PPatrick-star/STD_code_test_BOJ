import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int firstNum = Integer.parseInt(stringTokenizer.nextToken());
        int secondNum = Integer.parseInt(stringTokenizer.nextToken());
		
		System.out.println(firstNum + secondNum);
	}

}