package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	String nombre;
	public Zoologico zoo;
	ArrayList<Object> animales;
public Zona(String nom,Zoologico zoo,Animal animales){	
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
