//Static method in instance methods//
public class Staticfive
{
    static int x=10;
    static int y=2;
    void add() 
    {
        System.out.println(x+y);
    }
    static void getInstance()
    {
        System.out.println("Static method in instance methods");
        Staticfive s=new Staticfive();
        s.add();
    }
    public static void main(String[] args)
    {
       getInstance();
    }
}



/*D:\Java2025\Statics>javac Staticfive.java

D:\Java2025\Statics>java Staticfive
Static method in instance methods
12*/