package JavaBasicConcepts;

public class StringMethods {

	public static void main(String[] args) {
		String abc = "Java learning";
		abc = abc.toUpperCase();
		System.out.println("Printing value of variable = " + abc);//JAVA LEARNING
		
		abc = abc.toLowerCase();
		System.out.println("Printing value of variable = " + abc);//java learning
		
		abc = abc.substring(5, 13);
		System.out.println("Printing value of variable = " + abc);//learning
		
		System.out.println("Length of String is = " + abc.length());
		
		String str01="  Wow i am learning Java ";
		System.out.println("Printing initial value:" + str01);
		
		//trim()
		System.out.println("Printing value after triming = " +str01.trim());
		
		//concat()
		String str02 = "I am enjoying coding";
		System.out.println("Printing with concat() = " +  str02.concat(str01));
		
		//replace()
		String str03 = "I love coding";
		System.out.println("Printing with replace() = " + str03.replace("love", "am passionate about"));
		
		//equals()
		String str04 = "Java ia an awesome";
		String str05 = " Java ia an awesome  ";
		System.out.println("Printing after equals() = " + str04.trim().equals(str05.trim()));
		
		//contains()
		System.out.println("Printing after using contains() = " + str04.contains("awesome"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
