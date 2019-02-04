package maan1;
import java.util.Scanner;
class Grade1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks");

int marks=sc.nextInt();
int m=marks/10;

switch(m)
{
case 10:
case 9:
case 8:
System.out.println("excellent");
break;

case 7:
System.out.println("very good");
break;

case 6:
case 5:
System.out.println("good");
break;

case 4:
System.out.println("average");
break;
default:
System.out.println("fail");
}
}
}