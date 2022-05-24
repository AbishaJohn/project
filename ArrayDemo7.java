package array;

public class ArrayDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {5,10,15,180,21};
		int min=0;int max=ar.length-1;
		int mid=min+max/2;
		int key=180;
		if(min>max)
		{
			System.out.println("not found");
		}
		
		while(min<=max)
		{
			
		if(key==ar[mid])
		{
			System.out.println("key is presrny at"+mid);
		}
		else if(key<ar[mid])
		{
			max=mid-1;
		
		}
		else if(key>ar[mid])
		{
			min=mid+1;
		
		}
		}
		
	
	}}



