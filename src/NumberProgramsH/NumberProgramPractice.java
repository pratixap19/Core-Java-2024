package NumberProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class NumberProgramPractice {

	public static void main(String[] args) {
		int i,j,s;
		for(i=2;i<=50;i++) {
			s=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					s=1;
					break;
				}
			}
			if(s==0) {
				System.out.println(i);
			}
		}
	
	}
}