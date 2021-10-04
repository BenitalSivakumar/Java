package day1pro;

public class fibnoPro {
	public static void main(String[] args) {
		int range=8,firstnum=0,secnum=1;
	
		{
	System.out.println(firstnum);
	
	for (int i = 1; i <= range; ++i) 
	{
		System.out.println(firstnum);	
		int sum=firstnum+secnum;
		firstnum=secnum;
		secnum=sum;
	}
		
	
		}
}}


