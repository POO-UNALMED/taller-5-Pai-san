package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	ArrayList<Object> listado;
	static int halcones,aguilas;
	private String colorPlumas;
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	Ave objeto;
public Ave() {
}
public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
}
public static int cantidadAves() {
	return halcones+aguilas;
}
public static String movimiento( ) {
	String m="volar";
	return m;
}
public void crearHalcon(int edad,String nom,String gen) {
	Ave objeto = new Ave(nom,edad,"montañas",gen,"cafe glorioso");
	halcones++;
	
}
public void crearAguila(int edad,String nom,String gen) {
	Ave objeto = new Ave(nom,edad,"montañas",gen,"blanco y amarillo");
	aguilas++;
	
}
}

