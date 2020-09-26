package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	ArrayList<Object> listado;
	Mamifero objeto;
	static int caballos,leones;
	int patas;
	boolean pelaje;
public Mamifero(int edad,String nombre,String habitat,String genero,boolean pelaje,int patas) {
		super(edad, nombre, habitat, genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
}
public static int cantidadMamiferos() {
	return caballos+leones;
}
public void crearCaballo(int edad,String nom,String gen) {
	Mamifero objeto = new Mamifero(edad,nom,"pradera",gen,true,4);
	caballos++;
	
}
public void crearLeon(int edad,String nom,String gen) {
	Mamifero objeto = new Mamifero(edad,nom,"selva",gen,true,4);
	leones++;
	
}
}

