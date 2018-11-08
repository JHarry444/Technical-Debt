
public class business_stuff {
	
	map MyMap;
	
	public business_stuff() 
	{
		MyMap = new map();
	}
	
	public String logic1() 
	{
		if(MyMap.get(0L).Genre.equals("Horror") && MyMap.get(0L).Genre.equals("JAWS")) 
		{
			return "This film is 5 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Fantasy") && MyMap.get(0L).Genre.equals("Harry Potter")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Action") && MyMap.get(0L).Genre.equals("Terminator")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Fantasy") && MyMap.get(0L).Genre.equals("Harry Potter")) 
		{
			return "This film is 3 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Comedy") && MyMap.get(0L).Genre.equals("Ancorman")) 
		{
			return "This film is 2 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Romantic") && MyMap.get(0L).Genre.equals("Any romantic films")) 
		{
			return "This film is 1 out of 5";
		}
		return null;
	}
	
	public String logic2() 
	{
		if(MyMap.get(1L).Genre.equals("Horror") && MyMap.get(1L).Genre.equals("JAWS")) 
		{
			return "This film is 5 out of 5";
		}
		else if(MyMap.get(0L).Genre.equals("Fantasy") && MyMap.get(0L).Genre.equals("Harry Potter")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(1L).Genre.equals("Action") && MyMap.get(1L).Genre.equals("Terminator")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(1L).Genre.equals("Fantasy") && MyMap.get(1L).Genre.equals("Harry Potter")) 
		{
			return "This film is 3 out of 5";
		}
		else if(MyMap.get(1L).Genre.equals("Comedy") && MyMap.get(1L).Genre.equals("Ancorman")) 
		{
			return "This film is 2 out of 5";
		}
		else if(MyMap.get(1L).Genre.equals("Romantic") && MyMap.get(1L).Genre.equals("Any romantic films")) 
		{
			return "This film is 1 out of 5";
		}
		return null;
	}
	
	public String logic3() 
	{
		if(MyMap.get(3L).Genre.equals("Horror") && MyMap.get(3L).Genre.equals("JAWS")) 
		{
			return "This film is 5 out of 5";
		}
		else if(MyMap.get(3L).Genre.equals("Fantasy") && MyMap.get(3L).Genre.equals("Harry Potter")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(3L).Genre.equals("Action") && MyMap.get(3L).Genre.equals("Terminator")) 
		{
			return "This film is 4 out of 5";
		}
		else if(MyMap.get(3L).Genre.equals("Fantasy") && MyMap.get(3L).Genre.equals("Harry Potter")) 
		{
			return "This film is 3 out of 5";
		}
		else if(MyMap.get(3L).Genre.equals("Comedy") && MyMap.get(3L).Genre.equals("Ancorman")) 
		{
			return "This film is 2 out of 5";
		}
		else if(MyMap.get(3L).Genre.equals("Romantic") && MyMap.get(3L).Genre.equals("Any romantic films")) 
		{
			return "This film is 1 out of 5";
		}
		return null;
	}
}
