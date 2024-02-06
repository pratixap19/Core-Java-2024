package OOPsConceptsPart1;

public class MainMethodOverloading {

	void main(int i) {
		System.out.println("Value of i is:" + i);
	}

	void main(int i, int j) {
		System.out.println("Value of i is " + i + " and value of j is " + j);
	}

	void main(double k) {
		System.out.println("Value of k is :" + k);
	}

	public static void main(String[] args) {
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main(2);
		obj.main(2, 4);
		obj.main(4.5);
	}

}
