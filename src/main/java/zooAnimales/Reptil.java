package zooAnimales;
import java.util.*;

public class Reptil extends Animal{
	ArrayList<Object> listado;
	static int iguanas,serpientes;
	int largoCola;
	String colorEscamas;
	Reptil objeto;
public Reptil(int edad,String nombre,String habitat,String genero,String colorEscamas,int largoCola) {
	super(edad, nombre, habitat, genero);
	this.colorEscamas=colorEscamas;
	this.largoCola=largoCola;	
	listado.add(this);
}
public static int cantidadReptiles() {
	return iguanas+serpientes;
}
public void movimiento( ) {
	System.out.println("reptar");
}
public void crearIguana(int edad,String nom,String gen) {
    Reptil objeto = new Reptil(edad,nom,"humedal",gen,"verde",3);
	iguanas++;
	
}
public void crearSerpiente(int edad,String nom,String gen ) {
	Reptil objeto = new Reptil(edad,nom,"jungla",gen,"blanco",1);
	serpientes++;
	
}
}
	


