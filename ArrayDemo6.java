package array;

public class ArrayDemo6 {//binary search(it is suitable for large set of number)
	                      //binary search value should be sort( either ascending order or descending order)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar= {5,10,15,18,21};
int min=0;int max=ar.length-1;
int mid= max+min/2;
int key=18;

while(true)
{
if(key==ar[mid])
{
	System.out.println("yes its is preset at"+mid);
	break;
	
}
 
else if(key<ar[mid])
{
	max=mid-1;
	
}
else if(key>ar[mid])
{
	min=mid+1;
}

System.out.println("yes its is preset at"+mid);
break;


	}

}
}