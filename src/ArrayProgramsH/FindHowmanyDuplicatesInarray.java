package ArrayProgramsH;
//followed SDET - Pavan 2024 new series
public class FindHowmanyDuplicatesInarray {

	public static void main(String[] args) {
		int a[] = {100,200,300,400,100,200,100};
		int num=100;
		int count=0;
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}
		System.out.println(count);

	}

}
