package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	ArrayList<Object> listado;
	static int ranas,salamandras;
	String colorPiel;
	boolean venenoso;
	Anfibio objeto;
public Anfibio(int edad,String nombre,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(edad, nombre, habitat, genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
}
public static int cantidadAnfibios() {
	return ranas+salamandras;
}
public void movimiento( ) {
	System.out.println("saltar");
}
public void crearRana(int edad,String nom,String gen) {
	Anfibio objeto = new Anfibio(edad,nom,"selva",gen,"rojo",true);
	ranas++;
	
}
public void crearSalamandra(int edad,String nom,String gen) {
	Anfibio objeto = new Anfibio(edad,nom,"selva",gen,"rojo",true);
	salamandras++;
	
}
}

