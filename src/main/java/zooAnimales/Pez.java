package zooAnimales;
import java.util.*;
public class Pez extends Animal{
	ArrayList<Object> listado;
	static int salmones,bacalaos;
	private int cantidadAletas;
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	private String colorEscamas;
	Pez objeto;
public Pez() {
}
public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
}
public static int cantidadPeces() {
	return salmones+bacalaos;
}
public static String movimiento( ) {
	String m="nadar";
	return m;
}
public void crearSalmon(String nom,int edad,String gen) {
	Pez objeto = new Pez(nom,edad,"oceano",gen,"rojo",6);
	salmones++;
	
}
public void crearBacalao(String nom,int edad,String gen) {
	Pez objeto = new Pez(nom,edad,"oceano",gen,"gris",6);
	bacalaos++;
}
}
