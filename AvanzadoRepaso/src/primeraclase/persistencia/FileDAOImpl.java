package primeraclase.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import primeraclase.modelo.Employee;

public class FileDAOImpl implements EmployeeDAO {

	File empleados = new File("empleados.txt");
	
//	@Override //Escribimosen un archivo
//	public void guardar(Employee employee) {
//		try(Writer output = new BufferedWriter(new FileWriter(empleados.getName(), true));){
//			output.write(employee.toString()+"\n");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}

	@Override
	public List<Employee> recuperar() {
		
		return null;
	}

	@Override
	public List<String> recuperarEmpleados() {
		List<String> empleadosString = new ArrayList<>();
		try(FileInputStream fos = new FileInputStream(empleados);
			BufferedReader bw = new BufferedReader(new InputStreamReader(fos));){
			bw.lines().forEach(emp -> empleadosString.add(emp));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empleadosString;
	}

	@Override//a Jackson
	public void guardar(Employee employee) {
		ObjectMapper mapper = new ObjectMapper();
		//Convert object to JSON string and save into file directly 
		try {
			mapper.writeValue(new File("empleados.json"), employee);
			//Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(employee);
			System.out.println(jsonInString);
			
			//Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
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

	

}
