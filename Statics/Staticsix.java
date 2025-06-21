//Static and Instance variables in main method//
public class Staticsix
{
static int x=50;
static int y=5;
int a=10;
int b=2;
public static void main(String[] args)
{
System.out.println("Static Variable:"+x);
System.out.println("Static Variable:"+y);
Staticsix s=new Staticsix();
System.out.println("Instance variable:"+s.a);
System.out.println("Instance variable:"+s.b);
}
}


*/D:\Java2025\Statics>javac Staticsix.java

D:\Java2025\Statics>java Staticsix
Static Variable:50
Static Variable:5
Instance variable:10
Instance variable:2*/