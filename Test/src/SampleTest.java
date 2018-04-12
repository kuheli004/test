import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SampleTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String str[]=br.readLine().split(" ");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			int c=a+b;
			System.out.println(c);
			
		}

	}

}
