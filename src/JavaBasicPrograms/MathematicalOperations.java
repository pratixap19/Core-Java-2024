package JavaBasicPrograms;
//followed QAFox
public class MathematicalOperations {

	public static void main(String[] args) {
		System.out.println(-6+4*2);//mutiplication has highest priority over addition
		
		System.out.println((2+3)*4);//circular brackets have higiest priority over mutiplication operator
		
		System.out.println(9+6-3*4/2%5);//multiplication, division, modular, addition and substraction
	
		System.out.println(7+(3*5)*(4/2)+(5%3)-1);//priority is given in the order of () , * , /, %, + , _
		//7+15*2+2-1
		//7+30+2-1
		//39-1
		//output is 38
	}

}
