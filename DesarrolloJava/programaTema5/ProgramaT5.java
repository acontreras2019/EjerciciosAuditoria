package DesarrolloJava.programaTema5;
import java.util.Scanner;

public class ProgramaT5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Capturar datos del producto
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Ingrese la cantidad de producto a ingresar: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio de costo por unidad (en euros): ");
        double costoPorUnidad = scanner.nextDouble();

        // Calcular el costo total
        double costoTotal = cantidad * costoPorUnidad;

        // Calcular el precio de venta
        double precioVenta;
        if (cantidad > 1000 && costoPorUnidad>=200 ) {
            // Si la cantidad es mayor a 1000, el precio de venta es el 40% más que el costo por unidad
            precioVenta = costoPorUnidad * 1.4;
        } else {
            // Si la cantidad no supera los 1000, el precio de venta es el 45% más que el costo por unidad
            precioVenta = costoPorUnidad * 1.45;
        }

        // Mostrar resultados
        System.out.println("\nResumen del producto:");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Precio de costo por unidad: " + costoPorUnidad + " euros");
        System.out.println("Costo total: " + costoTotal + " euros");
        System.out.println("Precio de venta: " + precioVenta + " euros");

        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
