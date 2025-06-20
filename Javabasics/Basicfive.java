//Local variable & global variable//


public class Basicfive
{
 int n=30;
 public static void main(String[] args)
 {
  int g=3;
  Basicfive x=new Basicfive();
  System.out.println("Local variable:"+g);
  System.out.println("Globalvariable:"+x.n);
 }
}


/*D:\Java2025\Javabasics>javac Basicfive.java

D:\Java2025\Javabasics>java Basicfive
Local variable:3
Globalvariable:30*/
