//Instance variable in static methods//

public class Statictwo
{
int x=5;
int y=5;
static void add() 
{
Statictwo s=new Statictwo();
System.out.println("Instance variable in static methods");
System.out.println("x="+s.x);
System.out.println("y="+s.y);
System.out.println(s.x+s.y);
}
public static void main(String[] args)
{
add();
}
}

/*D:\Java2025\Statics>java Statictwo
Instance variable in static methods
x=5
y=5
10
*/
