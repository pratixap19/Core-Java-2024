package StringProgramsP;
//reverse word
public class ReverseWords {

	public static void main(String[] args) {
			String s= "Atul Yadav";
			String sr[] = s.split(" ");
			//sr[0]= "Atul";
			//sr[1]= "Yadav";
			int n=sr.length;
			System.out.println("Length of array is: " + n);
			for(int i=n-1; i>=0;i-- )//1,
			{
			    System.out.print(sr[i]+ " ");
			}
	}
}


