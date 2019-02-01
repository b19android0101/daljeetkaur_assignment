package maan1;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={10,20,30,40,50};
int key=50,flag=0;
System.out.println("enter search key="+key);
for(int i=0;i<5;i++)
{
	if(key==a[i])
	{
		flag=1;
		break;
	}
}
if (flag==1)
{
	System.out.println("key is found");
}
else
{
	System.out.println("key is not found");
	
}
	

	}

}
