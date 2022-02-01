package library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryImpl {
	
		ArrayList<Book> bookList=new ArrayList<Book>();
		ArrayList<Student> stuList=new ArrayList<Student>();
		int[] arr=new int[5];
		public void addbooks()
		{
		Book b1=new Book();
		System.out.println("Enter the name of the book");
		Scanner s1=new Scanner(System.in);
		String name=s1.nextLine();
		b1.setBookName(name);
		System.out.println("Enter book id");
		int id=s1.nextInt();
		b1.setBookId(id);
		System.out.println("enter author");
		String author=s1.next();
		b1.setAuthor(author);
		System.out.println("enter no of copies");
		int copies=s1.nextInt();
		b1.setNoOfCopies(copies);
		bookList.add(b1);
		}
		public void addstudent()
		{
		Student s1=new Student();
		System.out.println("Enter the name ");
		Scanner sc1=new Scanner(System.in);
		String name=sc1.nextLine();
		s1.setSname(name);
		System.out.println("Enter student id");
		int id=sc1.nextInt();
		s1.setSid(id);
		System.out.println("enter no of copies");
		int copies1=sc1.nextInt();
		s1.setNoc(copies1);
		stuList.add(s1);
		}
		public void issuebooks()
		{
		System.out.println("Enter book id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		for(Book b:bookList)
		{
		if(b.getBookId()==id)
		{
		if(b.getNoOfCopies()== 0)
		System.out.println("Book not available");
		else
		checkStud(b);
		}
		}
		}
		public void checkStud(Book obj)
		{
		System.out.println("Enter student id");
		Scanner sc=new Scanner(System.in);
		int sid=sc.nextInt();
		for(Student stud:stuList)
		{
		if(stud.getSid()==sid)
		{
		if(stud.getNoc()<5)
		{
		System.out.println("Book Issued");
		stud.setNoc(stud.getNoc()+1);
		obj.setNoOfCopies(obj.getNoOfCopies()-1);
		}
		else
		System.out.println("Only 5 books can be issued");
		}
		}
		}
		public void returnbooks()
		{
		System.out.println("Enter book id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		for(Book b:bookList)
		{
		if(b.getBookId()==id)
		{
		b.setNoOfCopies(b.getNoOfCopies()+1);
		callStud();
		}
		}
		}
		public void callStud()
		{
		System.out.println("Enter student id");
		Scanner sc=new Scanner(System.in);
		int sid=sc.nextInt();
		for(Student stud:stuList)
		{
		if(stud.getSid()==sid)
		{
		System.out.println("Book Returned");
		stud.setNoc(stud.getNoc()-1);
		}
		else
		System.out.println("Invalid user");
		}
		}
		public void searchbooks()
		{
		System.out.println("Enter the name of the book");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		for(Book b:bookList)
		{
		if(b.getBookName().equalsIgnoreCase(name))
		{
		System.out.println("The details are:"+b.getBookName()+" "+b.getAuthor()+" "+b.getNoOfCopies());
		}
		}
		}
		
		
}
