package maan1;
class Swap
{
public static void main(String args[])
{
System.out.println("before swapping");
int x=10,y=5,temp;
System.out.println("values of x and y:" +x +y);
temp=x;
x=y;
y=temp;
System.out.println("after swapping");
System.out.println("values of x and y:" +x +y);
}
}