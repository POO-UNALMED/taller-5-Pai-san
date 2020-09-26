package zooAnimales;
import java.util.*;
public class Pez extends Animal{
	ArrayList<Object> listado;
	static int salmones,bacalaos;
	int cantidadAletas;
	String colorEscamas;
	Pez objeto;
public Pez(int edad,String nombre,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(edad, nombre, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
}
public static int cantidadPeces() {
	return salmones+bacalaos;
}
public void movimiento( ) {
	System.out.println("nadar");
}
public void crearSalmon(int edad,String nom,String gen) {
	Pez objeto = new Pez(edad,nom,"oceano",gen,"rojo",6);
	salmones++;
	
}
public void crearBacalao(int edad,String nom,String gen) {
	Pez objeto = new Pez(edad,nom,"oceano",gen,"gris",6);
	bacalaos++;
}
}
