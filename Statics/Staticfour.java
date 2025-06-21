 //Instance method in static methods//

public class Staticfour
{
    int x=10;
    int y=2;
    void add() 
    {
        System.out.println(x+y);
    }
    static void getInstance()
    {
        System.out.println("Instance method in static method");
        Staticfour s=new Staticfour();
        s.add();
    }
    public static void main(String[] args)
    {
       getInstance();
    }
}


*/D:\Java2025\Statics>javac Staticfour.java

D:\Java2025\Statics>java Staticfour
Instance method in static method
12*/