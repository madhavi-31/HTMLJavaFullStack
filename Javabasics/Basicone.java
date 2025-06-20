//Create a class,object,method and its signature//

public class Basicone
{ 
 public int add(int a,int b)
 {
  return  a+b;
 }
 public static void main(String[] args)
 {
  Basicone a=new Basicone();
  System.out.println(a.add(150,50));
 }
}


/*D:\Java2025\Javabasics>javac Basicone.java

D:\Java2025\Javabasics>java Basicone
200*/