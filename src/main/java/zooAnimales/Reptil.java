package zooAnimales;
import java.util.*;

public class Reptil extends Animal{
	ArrayList<Object> listado;
	static int iguanas,serpientes;
	private int largoCola;
	private String colorEscamas;
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	Reptil objeto;
public Reptil() {
}
public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
	super(nombre,edad,habitat, genero);
	this.colorEscamas=colorEscamas;
	this.largoCola=largoCola;	
	listado.add(this);
}
public static int cantidadReptiles() {
	return iguanas+serpientes;
}
public static String movimiento( ) {
	String m="reptar";
	return m;
}
public void crearIguana(String nom,int edad,String gen) {
    Reptil objeto = new Reptil(nom,edad,"humedal",gen,"verde",3);
	iguanas++;
	
}
public void crearSerpiente(String nom,int edad,String gen ) {
	Reptil objeto = new Reptil(nom,edad,"jungla",gen,"blanco",1);
	serpientes++;
	
}
}
	


