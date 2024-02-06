package CharacterPatterns;
//followed CS Corner Sunita Rai
/*
A 
B C 
D E F 
G H I J 
K L M N O */
public class CharacterPattern2 {
	
	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
		}
	}
	
}

