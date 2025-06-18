/* Pattern 1
public class Pattern1
{
public static void main (String[]  args)
{
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print("*");
}
System.out.println( );
}
}
}
*******
*******
*******
*******
*******
*******
*******
*/


/*1Pattern2
public class Pattern1
{
public static void main (String[]  args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" ");
}
System.out.println( );
}
}
}
11111
22222
33333
44444
55555
*/


/*Pattern 3
public class Pattern1
{
public static void main (String[]  args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println( );
}
}
}
12345
12345
12345
12345
12345
*/


/*Pattern4

public class Pattern1
{
public static void main (String[]  args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n +" ");
n++;
}
System.out.println( );
}
}
}*/


/*Pattern5

public class Pattern1
{
public static void main (String[]  args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(n +" ");
n++;
if (n==10)
{
n=1;
}
}
System.out.println( );
}
}
}
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/


/*Pattern6
public class Pattern1
{
public static void main (String[]  args)
{
int n=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<10;j++)
{
if(n%2!=0)
{
System.out.print(n +" ");
}
n++;
}
System.out.println( );
}
}
}
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
*/


/*Pattern7
public class Pattern1
{
public static void main (String[]  args)
{
int n=1;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=5;j++)
{
if(j%2==0)
{
System.out.print("1");
}
else
{
System.out.print("0");
}
}
System.out.println( );
}
}
}
10101
10101
10101
10101
10101
*/


/*Pattern8
public class Pattern1
{
public static void main (String[]  args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j<=5 - i )
{
System.out.print(" ");
}
else
{
System.out.print("* " );
}
}
System.out.println( );
}
}
}*/


/*Pattern9
public class Pattern1
{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}*/


//pattern 10//
public class Pattern1
{
public static void main(String[]args){
String str="INDIA";
for(int i=1;i<=str.length();i++){
System.out.println(str.substring(0,i));
}
}
}
