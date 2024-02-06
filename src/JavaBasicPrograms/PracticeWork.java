package JavaBasicPrograms;
//print total number of the even numbers
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
	
public class PracticeWork {
	
	public static void main(String[] args) throws UnknownHostException {
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=num) {
			 total=total+1;
		}
			 i++;
		System.out.println(total);
		
		
		
	}
}

