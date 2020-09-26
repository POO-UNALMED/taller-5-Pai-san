package gestion;
import java.util.ArrayList;
import zooAnimales.*;


public class Zoologico {
	String nombre,ubicacion;
	ArrayList<Object> zonas;
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
