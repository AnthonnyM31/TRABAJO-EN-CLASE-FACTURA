package EjercicioFactura;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factura factura;
        Scanner scanner = new Scanner(System.in);
        String Npieza, Dpieza;
        int cantidad;
        double precio;


        System.out.println("-----Factura------");
        System.out.print("Ingrese el numero de pieza: ");
        Npieza = scanner.next();
        System.out.print("Ingrese la descripcion: ");
        Dpieza = scanner.next();
        System.out.print("Ingrese la cantidad de pieza: ");
        cantidad = scanner.nextInt();
        System.out.print("Ingrese el precio de pieza: ");
        precio = scanner.nextDouble();
        factura = new Factura(Npieza, Dpieza, cantidad, precio);
        System.out.println();
        System.out.println();
        System.out.println("-------Factura------\n"+factura);
        System.out.println ("Total: "+factura.obtenerMontoFactura());

    }
}
