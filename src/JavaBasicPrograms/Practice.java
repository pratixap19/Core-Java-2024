package JavaBasicPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {
//Arrays methods are sort(), Equals(), copyOf(), fill(), biarySearch()
	public static void main(String[] args) {
		int[] arr = {23,67,83,90,6};
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
		}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest number is" + largest);
		System.out.println("smallest number is" + smallest);
		
}
}

