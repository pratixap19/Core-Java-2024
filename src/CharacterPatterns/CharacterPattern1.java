package CharacterPatterns;
//followed CS Corner Sunita Rai
/*
A 
B B 
C C C 
D D D D 
E E E E E */
public class CharacterPattern1 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}

	}

}
