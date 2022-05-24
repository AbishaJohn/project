package array;

public class ArrayDemo5 { // liner search(suitable for small set of numbers)//less efficiency

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks= {90,45,65,78,100};
int key=45;
for(int i=0;i<marks.length;i++)
{
	if(key==marks[i])
	{
		System.out.println("ys,key is present at"+i);
		break;
	}
}
	}

}
