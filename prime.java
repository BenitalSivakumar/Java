package day1pro;

public class prime {
public static void main(String[] args) {
	int a=13;
	int num;
	boolean flag=false;
	for (int i = 2; i <=a/2 ; i++) {
		num=a%i;
		if(num != 0)
		{
			flag=true;
			break;
	}
	}
if(flag)
	System.out.println("Prime");
else
	System.out.println("Not Prime");
}
}
