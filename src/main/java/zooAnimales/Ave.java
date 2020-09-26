package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	ArrayList<Object> listado;
	static int halcones,aguilas;
	String colorPlumas;
	Ave objeto;
public Ave(int edad,String nombre,String habitat,String genero,String colorPlumas) {
		super(edad, nombre, habitat, genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
}
public static int cantidadAves() {
	return halcones+aguilas;
}
public void movimiento( ) {
	System.out.println("volar");
	
}
public void crearHalcon(int edad,String nom,String gen) {
	Ave objeto = new Ave(edad,nom,"montañas",gen,"cafe glorioso");
	halcones++;
	
}
public void crearAguila(int edad,String nom,String gen) {
	Ave objeto = new Ave(edad,nom,"montañas",gen,"blanco y amarillo");
	aguilas++;
	
}
}

