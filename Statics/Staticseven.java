//Static method & Instance method in main method//

public class Staticseven
{
    void getInstance() 
    {
        System.out.println("Instance method call in main method");
    }
    static void getStatic()
    {
       System.out.println("Static method call in main method");
    }
    public static void main(String[] args)
    {
        getStatic();
        Staticseven x=new Staticseven();
        x.getInstance();
    }
}


D:\Java2025\Statics>javac Staticseven.java

D:\Java2025\Statics>java Staticseven
Static method call in main method
Instance method call in main method