package primeraclase.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO{
	private int legajo;
	private String ubicacion;
	private Integer reportTo;
	private String name;
	private Integer[] reportees;
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Integer getReportTo() {
		return reportTo;
	}
	public void setReportTo(Integer reportTo) {
		this.reportTo = reportTo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer[] getReportees() {
		return reportees;
	}
	public void setReportees(Integer[] reportees) {
		this.reportees = reportees;
	}
	
	

	
	
//	@Override
//	public String toString() {
//		return String.format("legajo=%s, ubicacion=%s, reportTo=%s, name=%s, reportees=%d", legajo,
//				ubicacion, reportTo!=null?reportTo.getName():"", name, reportees.size());
//	}


	
}
