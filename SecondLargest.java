package week1.day2;

import java.util.Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int data[]={3,2,11,4,6,7};
	
	Arrays.sort(data);
	int length=data.length;
	System.out.println("second largest number is " +data[(length-2)]);
}
}
