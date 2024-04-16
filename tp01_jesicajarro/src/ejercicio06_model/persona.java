package ejercicio06_model;

import java.time.LocalDate;

public class persona {
private int dni;
private String nombre;
private LocalDate Fecha_nac;
private String provincia;
public persona() {
	// TODO Auto-generated constructor stub
}
public persona(int dni, String nombre, LocalDate fecha_nac, String provincia) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	Fecha_nac = fecha_nac;
	this.provincia = provincia;
}
public persona(int dni, String nombre, LocalDate fecha_nac) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	Fecha_nac = fecha_nac;
	this.provincia = "Jujuy";
	
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFecha_nac() {
	return Fecha_nac;
}
public void setFecha_nac(LocalDate fecha_nac) {
	Fecha_nac = fecha_nac;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public int calcularedad() {
	int edad=0;
	return edad;
}
public boolean verificaredad() {
	boolean band=true;
	return band;
}
}

