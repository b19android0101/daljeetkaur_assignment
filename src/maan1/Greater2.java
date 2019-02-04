package maan1;
import java.util.Scanner;
class Greater2
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);

int a,b,c,d;
System.out.println("enter three numbers");
a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();
d =((a>b && a>c)?a:((b>a && b>c)?b:c));
System.out.println("greater no is"+d);
}
}