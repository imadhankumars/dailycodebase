import java.io.*;
import java.util.*;
class MaxChar
{
public static void main(String args[])
{
int c,;
char t=0;
int a[]=new int [20];
int k=0;
Scanner sc=new Scanner(system.in):
String s=sc.nextLine();
char s1[]=s.toCharArray();
Arrays.sort(s1);
for(int i=0;i<=s1.length;i++)
{c=0;
if(s1[i]!=t)
{
for(int j=i+1;j<=s1.length;j++)
{
if(s1[i]==s1[i] )
{ t=s1[i];
c++;
}}
}
a[k++]=c;
}
Arrays.sort(a);
System.out.print(" "+a[a.length]);
}}

