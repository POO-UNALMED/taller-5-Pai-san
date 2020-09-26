package zooAnimales;
import gestion.*;

public class Animal {
	public static int totalAnimales;
	private int edad;
	private String nombre,habitat,genero;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	Zona zona;
public Animal(int edad,String nombre,String habitat,String genero) {
	this.edad=edad;
	this.nombre=nombre;
	this.habitat=habitat;
	this.genero=genero;
	totalAnimales++;
}
public void movimiento() {
	System.out.println("desplazarse");
}
public void totalPorTipo() {
	System.out.println(Mamifero.cantidadMamiferos());
	System.out.println(Ave.cantidadAves());
	System.out.println(Reptil.cantidadReptiles());
	System.out.println(Pez.cantidadPeces());
	System.out.println(Anfibio.cantidadAnfibios());
}
public String ToString() {
	if(zona.zoo!=null) {
		return "Mi nombre es"+ nombre +"n/tengo una edad de"+ edad +"n/habito en"+habitat+"n/mi geneto es"+genero+"n/la zona en la que me ubico es"+zona+"n/en el zoo"+ zona.zoo;	
	}
	else {
		return "Mi nombre es"+ nombre +"n/tengo una edad de"+ edad +"n/habito en"+habitat+"n/mi geneto es"+genero;
	}
	
}
}
