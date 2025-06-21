class Staticone
{
static int e=120;
static int f=5;
int g=30;
int h=3;
static void add()
{
System.out.println("One Static Method:"+(e+f));
}
static void sub()
{
System.out.println("Two Static Method:"+(e-f));
}
void mul()
{
System.out.println("One Instance Method:"+(g*h));
}
void div()
{
System.out.println("Two Instance Method:"+(g/h));
}
public static void main(String[] args)
{
Staticone e=new  Staticone();
Staticone.add();
Staticone.sub();
e.mul();
e.div();
}
}



/*D:\Java2025\Statics>java Staticone
One Static Method:125
Two Static Method:115
One Instance Method:90
Two Instance Method:10
*/