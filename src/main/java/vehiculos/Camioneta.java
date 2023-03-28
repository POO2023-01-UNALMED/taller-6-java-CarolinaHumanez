package vehiculos;

public class Camioneta extends Vehiculo{
Boolean volco;
static int cantidadCamionetas;

//Constructor
public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco) {
    super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
    this.volco = volco;
    Camioneta.cantidadCamionetas+=1;
}

//get y set volco
public Boolean isVolco() {
    return volco;
}
public void setVolco(Boolean volco) {
    this.volco = volco;
}

//get y set cantidadCamionetas
public static int getCantidadCamionetas() {
    return cantidadCamionetas;
}
public static void setCantidadCamionetas(int cantidadCamionetas) {
    Camioneta.cantidadCamionetas = cantidadCamionetas;
}



}



