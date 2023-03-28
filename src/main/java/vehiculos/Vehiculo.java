package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int CantidadVehiculos;
	static  List<Pais> listaPaises = new ArrayList<>(); 

	// Construcctor
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos+=1;

		//Agrega el pais del nuevo vehiculo a una lista
		Vehiculo.listaPaises.add(fabricante.getPais());

		//Incrementar la cantidad e creador por fabrica
		for (int x = 0; x < Fabricante.arrayFabricas.size(); x++) {
			if (this.fabricante==Fabricante.arrayFabricas.get(x)){
				Fabricante.arrayCantidades.set(x,Fabricante.arrayCantidades.get(x)+1);
				
			}

		}System.out.println(Fabricante.arrayCantidades);
	}

	//metodo vehiculosPorTipo
	public static String vehiculosPorTipo(){
		int a=Automovil.getCantidadAutos();
		int b=Camioneta.getCantidadCamionetas();
		int c=Camion.getCantidadCamiones();
		
		return("Automoviles: "+a+"\n"+"Camionetas: "+b+"\n"+"Camiones: "+c+"\n");
		}

	// get y set placa
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String newPlaca) {
		this.placa = newPlaca;
	}

	// get y set puertas
	public int getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int newPuertas) {
		this.puertas = newPuertas;
	}

	// get y set velocidadMaxima
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	public void setVelocidadMaxima(int newVelocidad) {
		this.velocidadMaxima = newVelocidad;
	}

	// get y set nombre
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	// get y set precio
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// get y set peso
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// get y set traccion
	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	// get y set fabricante
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	// get y set CantidadVehiculos
	public int getCantidadVehiculos() {
		return CantidadVehiculos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}

}
