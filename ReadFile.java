import java.io.*;

public class ReadFile 
{
	private String path;
	
	public ReadFile()
	{
		this.path="";
	}
	
	public ReadFile(String path)
	{
		this.path=path;
	}
	
	public String readFile() throws IOException
	{
		FileInputStream FIS=null;
		InputStreamReader ISR=null;
		BufferedReader BR=null;
		PathValidator pv=new PathValidator();
		String readenFile=null;
		try
		{
			if(pv.validatePath(this.path))
			{
				FIS=new FileInputStream(this.path);
				ISR=new InputStreamReader(FIS);
				BR=new BufferedReader(ISR);
				readenFile=BR.readLine();
			
			}
			else
			{
				System.out.println("Invalid input!");
			}
		} 
		catch(IOException n)
		{
			System.out.println("Invalid input!");
		}
		finally
		{
			if(BR!=null)
			{
				BR.close();
			}
			if(ISR!=null)
			{
				ISR.close();
			}
			if(FIS!=null)
			{
				FIS.close();
			}
		}
		return readenFile;
	}
}
