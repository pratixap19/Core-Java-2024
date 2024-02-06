package JavaBasicConcepts;

public class DataTypes {

	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 30;
//		int sum = num1+num2;
//		System.out.println("Value of num1 before assignment = " + num1);
//		num1=num2;//assignment is happened from right to left
//		System.out.println("Value of num1 after assignment = " + num1);
		
		
		//Type casting means converting one data type to another
		//-Implicit casting(widening)automatic type conversion from smaller size data type to 
		//higher type data type. It happens automatically.It doesn't create an issue.
		//byte->short->int->long
		
		//-Explicit casting(narrowing)- Assign value of data type from higher size to smaller type which is called explicit 
		//casting
		
		//example of implicit casting
		int x=10;
		double y=x;
		System.out.println("Print value of y is = " + y);
		
		//example of xplicit casting
        //converting higher data type double to int which is lower data type so have to type cating.
		double abc = 10.5;
		int xyz = (int) abc;
		
		System.out.println("Value of xyz is = " + xyz);
}

}
