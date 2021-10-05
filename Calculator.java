package day1pro;

public class Calculator {
	
	int num1,num2,num3;
	
public void add(int num1,int num2)
{
num3=num1+num2;
System.out.println("Result of adding is " +num3);
}
public void sub(int num1,int num2)
{
	num3=num2-num1;
	System.out.println("Result pf subtraction is " +num3);
}
public void mul(int num1,int num2)
{
	num3=num1*num3;
	System.out.println("result of multiplication is "+num3);
}
public void divide(int num1,int num2)
{
	num3=num1%num2;
	System.out.println("Result of division is "+num3);
}

}
