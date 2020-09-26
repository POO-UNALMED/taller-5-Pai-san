package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	ArrayList<Object> listado;
	static int ranas,salamandras;
	private String colorPiel;
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	boolean venenoso;
	Anfibio objeto;
public Anfibio() {
	
}
public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat, genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
}
public static int cantidadAnfibios() {
	return ranas+salamandras;
}
public static String movimiento( ) {
	String m="saltar";
	return m;
}
public void crearRana(int edad,String nom,String gen) {
	Anfibio objeto = new Anfibio(nom,edad,"selva",gen,"rojo",true);
	ranas++;
	
}
public void crearSalamandra(int edad,String nom,String gen) {
	Anfibio objeto = new Anfibio(nom,edad,"selva",gen,"rojo",true);
	salamandras++;
	
}
public boolean isVenenoso() {
	return venenoso;
}
}

