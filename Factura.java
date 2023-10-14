package EjercicioFactura;

public class Factura {
    private String Npieza;
    private String Dpieza;
    private int cantidad;
    private double precio;

    public Factura(String Npieza, String Dpieza, int cantidad, double precio){
        this.Npieza = Npieza;
        this.Dpieza = Dpieza;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public void setNpieza(String Npieza){
        this.Npieza = Npieza;
    }


    public void setDpieza(String Dpieza){
        this.Dpieza = Dpieza;
    }


    public void setCantidad(int cantidad){
        if (cantidad<0){
            cantidad = 0;}
        this.cantidad = cantidad;

    }
    public void setPrecio(double precio){
        if (precio>0){
            precio = 0.0;
        }
        this.precio = precio;
    }


    public String getNpieza(){
        return Npieza;
    }

    public String getDpieza(){
        return Dpieza;
    }

    public int getCantidad(){
        return cantidad;
    }

    public double getPrecio(){
        return precio;
    }


    public double obtenerMontoFactura(){
        return cantidad*precio;
    }

    @Override
    public String toString(){
        String mensaje = "";
        mensaje += "Numero de Pieza: "+Npieza+"\nDescrip.Pieza: "+Dpieza+"\nPrecio: "+precio+"\nCantidad: "+cantidad;
        return mensaje;
    }

}
