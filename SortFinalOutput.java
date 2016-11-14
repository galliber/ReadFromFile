import java.io.*;

public class SortFinalOutput 
{
	private ReadFile RF=new ReadFile();
	public SortFinalOutput(ReadFile RF)
	{
		this.RF=RF;
	}
	
	public String[] getArrOfStrings() throws IOException 
	{
		if(RF.readFile()==null)
		{
			throw new IOException();
		}
		else
		{
			String[] arrOfStrings=null;
			String[] finalArr=null;
			String strFromFile=null;
			try
			{
				strFromFile=RF.readFile();
				arrOfStrings=strFromFile.split("\\*");
				finalArr=new String[arrOfStrings.length/4];
				int a=0;
				for(int i=0;i<finalArr.length;i++)
				{
					finalArr[i]=arrOfStrings[a]+" "+arrOfStrings[a+1]+" "+arrOfStrings[a+2]+" "+arrOfStrings[a+3]+" ";
					a=a+4;
				}
			
			}
			catch(IOException i)
			{
				System.out.println("Invalid path was enterred!");
			}
		
			return sortStrings(finalArr);
		}
	}
	
	public String[] sortStrings(String[] strArr)
	{
		boolean tester=true;
		while(tester)
		{
			tester=false;
			for(int i=0;i<strArr.length-1;i++)
			{
				if(strArr[i].charAt(0)>strArr[i+1].charAt(0))
				{
					String temp=null;
					temp=strArr[i];
					strArr[i]=strArr[i+1];
					strArr[i+1]=temp;
					tester=true;
				}
			}
		}
		return strArr;
	}
}
