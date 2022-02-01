package library;

import java.util.Scanner;

public class Library
{
public static void main(String args[])
{
LibraryImpl l1= new LibraryImpl();
int ch=0;
do
{
System.out.println("Library management System");
System.out.println("1.Add Books");
System.out.println("2.Add Student");
System.out.println("3.issue books");
System.out.println("4.return books");
System.out.println("5.search book");
System.out.println("Enter ur choice");
Scanner s=new Scanner(System.in);
ch=s.nextInt();
switch(ch)
{
case 1:
l1.addbooks();
break;
case 2:
l1.addstudent();
break;
case 3:
l1.issuebooks();
break;
case 4:
l1.returnbooks();
break;
case 5:
l1.searchbooks();
break;
default:
System.out.println("wrong choice");
}
}while((ch>0) && (ch<8));
}
}