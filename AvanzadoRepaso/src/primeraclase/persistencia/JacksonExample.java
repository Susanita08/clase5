package primeraclase.persistencia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import primeraclase.modelo.Employee;


public class JacksonExample {
	
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		//For testing
		Employee empleado = new Employee();
		
		
			//Convert object to JSON string and save into file directly 
			try {
				mapper.writeValue(new File("empleados.json"), empleado);
				//Convert object to JSON string
				String jsonInString = mapper.writeValueAsString(empleado);
				System.out.println(jsonInString);
				
				//Convert object to JSON string and pretty print
				jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(empleado);
				System.out.println(jsonInString);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		

	}

	/*private static Employee createDummyUser(){

		Employee empleado = new Employee();
		empleado.setName("mkyong");
		empleado.setAge(33);

		List<String> msg = new ArrayList<>();
		msg.add("hello jackson 1");
		msg.add("hello jackson 2");
		msg.add("hello jackson 3");
		
		return empleado;
		
	}*/
}