import java.util.regex.*;

public class PathValidator 
{
	private Pattern patt;
	private Matcher match;
	private static final String PATH_PATTERN="^[A-Z]:\\\\\\\\?([^\\\\.$\\\"<>]+\\\\)+[^\\\\.$\\\"<>]+.txt$";
	
	public PathValidator()
	{
		patt=Pattern.compile(PATH_PATTERN);
	}
	
	public boolean validatePath(String str)
	{
		match=patt.matcher(str);
		return match.matches();
	}
}
