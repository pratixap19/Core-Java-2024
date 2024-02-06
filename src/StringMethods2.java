
public class StringMethods2 {

	public static void main(String[] args) {
		
		String s = "Hello Java";
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//System.out.println(s.replace('a', 'e'));
		//System.out.println(s.replace("Java", "Python"));
		System.out.println(s.indexOf('J'));
		System.out.println(s.substring(1));
		System.out.println(s.isEmpty());
		String st = "Welcome";
		System.out.println(st.substring(3, 7));
		String a = "Do you know";
		System.out.println(a.substring(3, 6));
		System.out.println(a.contains("know"));
		String p = "  Well ";
		System.out.println(p.trim());
		System.out.println(a.startsWith("know"));
		//System.out.println(st.startsWith(p, 0));
		System.out.println(s.endsWith("Java"));
		System.out.println(st.equals(a));
		String st1 = "WELCOME";
		System.out.println(st.equalsIgnoreCase(st1));
		System.out.println(st.equalsIgnoreCase("WELCOME"));
		String st2 = " Home";
		System.out.println(st.concat(st2));
		
		

	}

}
