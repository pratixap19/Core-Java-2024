package Methods;

public class JavaMethodsWithReturnValue {
	
	public static String helloUser(String name) {
		System.out.println(" Welcome " + name);
		System.out.println(" Hey  "+name+", Thank you for watching Java videos"); 
		return name;
		
	}

	public static void main(String[] args) {
		String user = "Alex";
		helloUser(user);
		
		String abc = helloUser(user);
		System.out.println("Printing return value for the calling method = " + abc);
	}

}
