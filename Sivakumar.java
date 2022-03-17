public class Sivakumar implements Actor
{
static String address="Coimbatore";
int age=65;
String Carname="Audi Car";
public Sivakumar(int age,String Carname)
{
this.age=age;
this.Carname=Carname;
System.out.println("Sivakumar Details");
}
public static void main(String[] args)
{
Sivakumar as=new Sivakumar(65,"Audi Car");
Actor ac=new Sivakumar(65,"Audi Car");
System.out.println(Sivakumar.address);
ac.act();
ac.dance();
ac.sing();
as.act();
as.dance();
as.sing();
as.speaking();

}

public void speaking()
{
System.out.println("Speak");
}


public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("Dancing");
}
public void sing()
{
System.out.println("Singing");
}
}