package maan1;
class Result1
{
public static void main (String args[])
{
int marks=56;
if(marks>=85)
{
System.out.println("excellent");
}
else if(marks>=70 && marks<=85)
{
System.out.println("very good");
}
else if(marks>=50 && marks<=70)
{
System.out.println("good");
}
else if(marks>=40 && marks<50)
{
System.out.println("average");
}
else if(marks<40)
{
System.out.println("fail");
}
}
}