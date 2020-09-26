package gestion;
import java.util.ArrayList;
import zooAnimales.*;


public class Zoologico {
	private String nombre,ubicacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	ArrayList<Object> zonas;
	public Zoologico() {
		
	}
public Zoologico(String nom,String ubi) {
	this.nombre=nom;
	this.ubicacion=ubi;

}
public void agregarZonas(String nom) {
	zonas.add(this);
}
public int cantidadTotalAnimales() {
	return Animal.totalAnimales;	
}
	

	

}
