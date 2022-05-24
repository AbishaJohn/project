package array;

public class  ArrayDemo4 //selection sort
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {13,16,11,20};
		int temp=0;
		for(int i=0;i<ar.length;i++)
			for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j])
			{
				temp=ar[j];
				ar[j]=ar[i];
						ar[i]=temp;
						
			}
			}
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]+"");
		}

	}
}
