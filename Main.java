import java.io.*;
import java.util.Scanner;

public class Main 
{
	public static void main(String []args)
	{
		int a=0;
		while(a<1)
		{
			a=1;
			printIntro();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the path of the file.(Should look something like this \" C:\\Users\\User\\Desktop\\txtfile.txt \")");
			ReadFile RF=new ReadFile(sc.nextLine());
			SortFinalOutput SFO=new SortFinalOutput(RF);
			User[] users=null;
			try
			{
				users=new User[SFO.getArrOfStrings().length];
				for(User k:fillUser(SFO, users))
				{
					System.out.println(k.getNumber()+" "+k.getName()+" "+k.getSurname()+" "+k.getYearOfBirth());
				}
			}
			catch(IOException i)
			{
				a=0;
				System.out.println("Enter another path or look for errors in the curent one.\n Press Enter to try again.");
				sc.nextLine();
			}
		}
		
	}
	public static User[] fillUser(SortFinalOutput SFO, User[] user) throws IOException
	{
		
		for(int i=0;i<SFO.getArrOfStrings().length;i++)
		{
			String[] temp=SFO.getArrOfStrings()[i].split(" ");
			for(int j=0;j<4;j++)
			{
				user[i]=new User(temp[0], temp[1], temp[2], temp[3]);
			}
		}
		
		return user;
	}
	public static void printIntro()
	{
		System.out.println("This program takes a string that is a path to a .txt file.");
		System.out.println("In that file there must be a string with this pattern  \" number*name*surname*yearofbirth*numberN*nameN*....... \"");
		System.out.println("Should look like something like this  \"1*Denis*Pavlov*1996*3*name3*surname3*yob3*2*name2*surname2*yob2*  \"");
		System.out.println("After you enter the path of the file and press enter, the program fills an arry of Users that are sorted and have\nthe information from each sequence of the string in the file.");
		System.out.println("In the end, the program prints the information of each user created(sorted out).\n\n");
	}
}
