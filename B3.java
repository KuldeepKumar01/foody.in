class B3
{
public static void main(String[] args)
{
System.out.println("Airthematic Exception");
int a=10,b=0,c;
try
{
c=a/b;
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("cannot divide by zero");
}
}
