public class TamilNadu extends SouthIndia
{
static String capital="Chennai";

public static void main(String[] args)
{
SouthIndia si=new TamilNadu();
System.out.println(TamilNadu.capital);
System.out.println(si.capital);
si.cultivate();
si.livingStyle();
si.dress();
si.eat();
si.speakLanguage();
}
public void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}

public void livingStyle()
{
System.out.println("Above Average development");
}
public void dress()
{
System.out.println("dress");
}
public void eat()
{
System.out.println("eating");
}
public void speakLanguage()
{
System.out.println("Speaking");
}


}