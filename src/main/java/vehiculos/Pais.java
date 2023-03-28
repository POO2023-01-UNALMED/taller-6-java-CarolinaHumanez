package vehiculos;
import java.util.ArrayList;

public class Pais {
	String nombre;

	// Constructor
	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public static Pais paisMasVendedor() {

		//Convertir listas paises a array
		String arrayPaises[] = new String[Vehiculo.listaPaises.size()];

		for (int i = 0; i < Vehiculo.listaPaises.size(); i++)
			arrayPaises[i] = Vehiculo.listaPaises.get(i).getNombre();


		ArrayList cantidades = new ArrayList<>();
		ArrayList nombres = new ArrayList<>();
		ArrayList datos = new ArrayList<>();

		for (String palabra : arrayPaises) {

			int contador = 0;
			if (!datos.contains(palabra)) {
				for (String demas : arrayPaises) {
					if (demas.equals(palabra)) {
						contador++;
					}
				}

				nombres.add(palabra);
				cantidades.add(contador);
			}
		}

		// Conversion  cantidades de Lista a array
		int[] arrayCantidades = new int[cantidades.size()];
		for (int i = 0; i < cantidades.size(); i++)
			arrayCantidades[i] = (int) cantidades.get(i);


		// Recorrer arreglo y ver si no es así
		int indiceDelMayor = 0;
		for (int x = 1; x < arrayCantidades.length; x++) {
			if (arrayCantidades[x] > arrayCantidades[indiceDelMayor]) {
				indiceDelMayor = x;
			}
		}
		// Ahora podemos obtener el mayor usando la posición
		int mayor = arrayCantidades[indiceDelMayor];
		int indice = indiceDelMayor;
		//System.out.println(Vehiculo.listaPaises.get(indice).getNombre());
		return(Vehiculo.listaPaises.get(indice));

	}
}
