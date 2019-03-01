import java.io.*;
import java.util.*;
class Vow
{
public static void main(String[] args)
{
int c=0;
Scanner sc = new Scanner(System.in);
String s=sc.nextLine();
String s1=s.toLowercase();
for(int i=0;i<s1.length()-1;i++)
{
if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
{
c++;
}
}
System.out.print(" "+c);
}}
