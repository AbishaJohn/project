public class Samsung extends FactoryDemo
{
static int price=5000;
public static void main(String[] args)
{
Samsung sam=new Samsung();
sam.browse();
System.out.println("Price"+sam.price);
}
public  void verifyFingerPrint()
{
System.out.println("fingerPrint");
}
public void providePattern()
{
System.out.println("Pattern");
}
public void sendMessage()
{
System.out.println("Sending message");
}
public void receiveCall()
{
System.out.println("Received call");
}
public int call(int second)
{
System.out.println("call");
return second;
}


}
