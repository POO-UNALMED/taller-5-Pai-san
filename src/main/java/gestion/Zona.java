package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico zoo;
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	ArrayList<Object> animales;
public Zona() {
	
}
public Zona(String nom,Zoologico zoo){	
	this.nombre=nom;
	this.zoo=zoo;

}
public void AgregarAnimales() {
	animales.add(this);
	
}
public int cantidadAnimales() {
	return animales.size();
	
}
}
