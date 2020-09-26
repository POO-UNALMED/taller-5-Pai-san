package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	ArrayList<Object> listado;
	Mamifero objeto;
	static int caballos,leones;
	private int patas;
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	private boolean pelaje;
	public boolean isPelaje() {
		return pelaje;
	}
public Mamifero() {
}
public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat, genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
}
public static int cantidadMamiferos() {
	return caballos+leones;
}
public void crearCaballo(String nom,int edad,String gen) {
	Mamifero objeto = new Mamifero(nom,edad,"pradera",gen,true,4);
	caballos++;
	
}
public void crearLeon(String nom,int edad,String gen) {
	Mamifero objeto = new Mamifero(nom,edad,"selva",gen,true,4);
	leones++;
}
}

