import java.io.*;
import java.util.*;
class nat
{
public static void main(String args[])
{
int m,n,sum=0;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
while(m>0)
{
n=m%10;
sum=sum+n;
m=m/10;
}
System.out.print(sum);
}
}
