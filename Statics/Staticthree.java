//Static variable in static methods//
public class Staticthree
{
int x=10;
int y=5;
void add() 
{
System.out.println("Static variable in instance methods");
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println(x+y);
}
public static void main(String[] args)
{
 Staticthree s=new Staticthree();
s.add();
}
}


/*Output:D:\Java2025\Statics>java Staticthree
Static variable in instance methods
x=10
y=5
15*/
