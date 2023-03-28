package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> arrayFabricas = new ArrayList<Fabricante>();
	static ArrayList<Integer> arrayCantidades = new ArrayList<Integer>();

	//Constructor
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.arrayFabricas.add(this);
		Fabricante.arrayCantidades.add(0);
	}

	// get y set nombre
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String newNombre) {
		this.nombre=newNombre;
	}
	
	//get y set pais
	public Pais getPais(){
		return this.pais;
	}
	public void setPais(Pais newPais) {
		this.pais=newPais;
	}
	
	//Metodo fabricaMayorVentas
	static Fabricante fabricaMayorVentas() {
		int mayor=Collections.max(arrayCantidades);		
		for (int x = 0; x < Fabricante.arrayCantidades.size(); x++) {
			if (arrayCantidades.get(x)==mayor) {
				Fabricante maxFabricante=arrayFabricas.get(x);
				return maxFabricante;
			}
			
		}
		return null;
		
	}

}
