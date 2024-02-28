package taller_java;
public class ticketventa {
    public static void main(String[] args) {
        // Datos del cliente
        String nombreCliente = "Juan Perez";
        int edadCliente = 30;
        String direccionCliente = "Calle Principal 123";

        // Detalles de la compra
        String[] productos = {"Producto 1", "Producto 2", "Producto 3"};
        double[] precios = {10.99, 20.50, 5.75};
        int[] cantidades = {2, 1, 3};

        // Calcular el total de la compra
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += precios[i] * cantidades[i];
        }

        // Imprimir el ticket de venta
        System.out.println("***** Ticket de Venta *****");
        System.out.println("Cliente: " + nombreCliente + " - Edad: " + edadCliente);
        System.out.println("Dirección: " + direccionCliente);
        System.out.println("\nDetalles de la compra:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + " x" + cantidades[i] + " - Precio unitario: $" + precios[i]);
        }
        System.out.println("\nTotal a pagar: $" + total);
    }
}