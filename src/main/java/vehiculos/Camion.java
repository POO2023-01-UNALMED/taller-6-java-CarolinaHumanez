package vehiculos;

public class Camion extends Vehiculo{
    int ejes;
    static int cantidadCamiones;

    //Constructor
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.cantidadCamiones+=1;
    }

    //get y set ejes
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    //get y set cantidadCamiones
    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }
    public static void setCantidadCamiones(int cantidadCamiones) {
        Camion.cantidadCamiones = cantidadCamiones;
    } 

}
