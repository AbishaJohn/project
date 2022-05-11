package While;

public class ProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProgramDemo pd=new ProgramDemo();
//pd.printno();              // 1 2 3 4 5
//pd.printone();          //  1  1  1   1  1
//pd.Square();           // 1 4 9 16 25
//pd.cube();           // 1 8 27 64 125
//pd.even();       // 2 4 6 8 10
//pd.odd();        // 1 3 5 7 9
//pd.additionofno(); //15
//pd.multiplyofthreeandfive();//15
//pd.operartor();//3 5 6 9 10 12 15 18 20
//pd.multiply();// 2 6 12 20 30
//pd.multiplyvalue(); //10 18 24 28 30
//pd.multiplyoftwo(); //1 2 4 7 11 16
pd.squareroot();
	}

	private void squareroot() {
		// TODO Auto-generated method stub
		int no=37;
		int i=2;
		while(i<=no/2)
		{
			if(no/i==i)
			{
				System.out.println("i is the square root");
				break;
			}
				else
				{
					System.out.println("i is not a square root");
				}
			}i++;
			}
		
	

	private void multiplyoftwo() {
		// TODO Auto-generated method stub
		int i=1;
		int j=0;
		while(i<=16)
		{
			System.out.println(i=i+j);
			
			j++;
		}
		
		}
	

	private void multiplyvalue() {
		// TODO Auto-generated method stub
		int i=1;
		int j=10;
		while(i<=j)
		{
		
			System.out.println(i*j);
			i++;
			j--;
		}
	}

	private void multiply() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5)
		{
			System.out.println(no*(no+1));
			no++;
		}
	}

	private void operartor() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=20)
		{
			if((no%3==0)  ||  (no%5==0))
			{
				System.out.println(no);
			}
			no++;
		}
	}

	private void multiplyofthreeandfive() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=20)
		{
			if((no%3==0) && (no%5==0))
			{
				System.out.println(no);
			}
			no++;
		}
		
	}

	private void additionofno() {
		// TODO Auto-generated method stub
		int count=1;
		int total=0;

		while(count<=5)
		{
			
			total=total+count;
			count++;
		}
		System.out.println(total);
	}

	private void odd() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10)
		{
			if(no%2!=0)
			{
				System.out.println(no);
				
			}
			no++;
		}
	}

	private void even() {
		// TODO Auto-generated method stub
		int no=2;
		while(no<=10)
		{
			if(no%2==0)
			{
				System.out.println(no);
				
				
			}
			no++;
		}
	}

	private void cube() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10)
		{
			System.out.println( no*no*no );
			no++;
		}
	}

	private void Square() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=10)
		{
			System.out.println(no*no);
			no++;
		}
	}

	private void printone() {
		// TODO Auto-generated method stub
		int no=1;while(no<=10) {
			System.out.print( "  1   ");
			no++;
		}
	}

	private void printno() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5)
		{
			System.out.println(no);
			no++;
		}
	}

}
