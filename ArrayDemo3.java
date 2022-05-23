package array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {15,13,14,12,10};
int temp=0;
for(int j=1;j<arr.length;j++)
for(int i=0;i<arr.length-j;i++) {

	if(arr[i]>arr[i+1])
	{
	temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
	}
}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	int len=arr.length;
	System.out.println("maximum number is"+arr[len-1]);
	}
}

	
	

	

	
	
	

