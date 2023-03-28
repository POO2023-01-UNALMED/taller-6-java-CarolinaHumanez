package vehiculos;

public class Automovil extends Vehiculo{
    int puestos;
    static int cantidadAutos;

    //Constructorcon super
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {

        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutos+=1;
    }

    //set y set puestos
    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    //set y get cantidadAutos
    static public int getCantidadAutos() {
        return cantidadAutos;
    }
    public void setCantidadAutos(int cantidadAutos) {
        Automovil.cantidadAutos = cantidadAutos;
    }
    
    

}
