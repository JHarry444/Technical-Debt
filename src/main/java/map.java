import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;

public class map {
	HashMap<Long, movie> dictionary = new HashMap<Long, movie>();
	
	public map() 
	{
		
	}
	
	public movie get(Long a) 
	{
		return dictionary.get(a);
	}
	public void delete(movie a) {
		dictionary.remove(a);
		}
	public void amend(Long a, movie b) {
		dictionary.put(a, b);
	}
	
	public void create(movie a){
		long num1 = 0;
		dictionary.put(num1, a);
	}
	 
	

	public String transfrom1(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}

	public <T> T transfrom2(String jsonString, Class<T> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(jsonString, clazz);
	}
	
	public static String jaxbObjectToXML(movie m, File f) throws JAXBException {
		String a = null;
		JAXBContext jaxbContext = JAXBContext.newInstance(movie.class);
		Marshaller m1 = jaxbContext.createMarshaller();
		// This is using a marshaller to make things beautiful
		m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		m1.marshal(m1, f);
		m1.marshal(m1, System.out);
		a = m1.toString();
		
		return a;
	}
	
	public void connect() 
	{
		System.out.println("Lets connect to DB");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			return;
		}

		Connection connection = null;

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/mkyongcom","root", "password");

		} catch (SQLException e) {
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	  }
	}
	
	

