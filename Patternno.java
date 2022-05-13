package patternnumber;

public class Patternno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patternno pn=new Patternno();
//pn.numberpattern();
//pn.numberpattern5();
//pn.numberdisplay1to5();
//pn.printrow();
//pn.printcol();
//pn.rowprint();
//pn.colprint();
//pn.star();
//pn.star2();
//pn.star3();
//pn.printvalue();
//pn.printnumbers();
//pn.numbersmultiply();
//pn.printvaluenew();
//pn.printcolvalue();
pn.printcolvalue5();

	}

	private void printcolvalue5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=5;col>=row;col--)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void printcolvalue() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void printvaluenew() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void numbersmultiply() {
		// TODO Auto-generated method stub
		int no=1;int no2=1;
		for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(no*no2);
			no++;
		}no2++;
		System.out.println();
		}
	}

	private void printnumbers() {
		// TODO Auto-generated method stub
		int no=1;
		for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(no+"    ");
			no++;
			
		}
		System.out.println();
		}
	}

	private void printvalue() {
		for(int row=5;row>=1;row--)
		{
		// TODO Auto-generated method stub
		for(int col=1;col<row;col++)
		{
			System.out.print(6-row);
		}
		System.out.println();
		}
	}

	private void star3() {
		for(int row=5;row>=1;row--)
		{
		// TODO Auto-generated method stub
		for(int col=5;col>=row;col--)
		{
			System.out.print(row+" ");
		}
		System.out.println();
		}
	}

	private void star2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(row+" ");
		}
		System.out.println();
	}
	}

	private void star() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void colprint() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=5;col>=1;col--)
		{
			System.out.print(col);
		}
		System.out.println();
	}
	}

	private void rowprint() {
		// TODO Auto-generated method stub

		for(int row=1;row<=3;row++)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(col);
		}
		System.out.println();
		}
	}

	private void printcol() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(row);
		}
		System.out.println();
		}
	}

	private void printrow() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=5;col>=1;col--)
		{
			System.out.print(row);
		}
		System.out.println();
	}
	}

	private void numberdisplay1to5() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=5;col++)
		{
			System.out.print(col);
		}
		System.out.println();
		}
	}

	private void numberpattern5() {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;no++)
		{
			System.out.print(no+ " ");
		}
	}

	private void numberpattern() {
		// TODO Auto-generated method stub
		for(int no=1;no<=5;no++)
		{
		System.out.print(1+" "  );
		}
		System.out.println();
	}

}
