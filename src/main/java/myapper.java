import java.io.File;

import javax.xml.bind.JAXBException;

public class myapper {
	
	public static void main(String[] args) 
	{
		business_stuff stuff = new business_stuff();
		
		stuff.MyMap.create(new movie("a", "b", "c"));
		stuff.MyMap.create(new movie("d", "e", "f"));
		stuff.MyMap.create(new movie("g", "h", "i"));
		
		System.out.println(stuff.logic1());
		System.out.println(stuff.logic2());
		System.out.println(stuff.logic3());
		stuff.MyMap.transfrom1(new movie("a", "b", "c"));
		stuff.MyMap.transfrom2("avc", movie.class);
		try {
			stuff.MyMap.jaxbObjectToXML(new movie("a", "b", "c"), new File("abc"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stuff.MyMap.connect();
	}
	
	
}
