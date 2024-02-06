package Programs_practice;

public class RemoveMultipleWhitespaces {

	public static void main(String[] args) {
		String s = "Java program to get rid of multiple spaces from a string";
		s= s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
