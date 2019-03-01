import java.io.*;
import java.util.*;
class Dist
{
public static void main(String args[])
{
String s1,s2;
int c=0;
Scanner sc=new Scanner(System.in);
s1=sc.nextLine();
s2=sc.nextLine();
if(s1.length()!=s2.length())
System.out.print("They both do not have equal lengths !!");
for(int i=0;i<s1.length()-1;i++)
{
for(int j=0;j<s2.length()-1;j++)
{
if(s1.charAt(i)!=s2.charAt(j))
{
c++;
}}}
System.out.print(" "+c);
}}
