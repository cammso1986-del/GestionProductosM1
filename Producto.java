// Archivo: Producto.java

public class Producto {
    
    // 1. ATRIBUTOS (Las características que tiene todo producto)
    private String nombre;
    private double precio;
    private int stock; // Cantidad disponible en tienda
    private String categoria;

    // 2. CONSTRUCTOR (Se usa para darle valores iniciales al crear el producto)
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // 3. MÉTODOS (Las acciones o cálculos que puede hacer el producto)

    // Método para mostrar en pantalla la información del producto
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock + " unidades");
    }

    // Método para simular una venta y descontar del inventario
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println(">> Venta exitosa: " + cantidad + " unidad(es) de " + nombre);
            System.out.println(">> Nuevo stock de " + nombre + ": " + stock + " unidades");
        } else {
            System.out.println(">> ERROR: No hay suficiente stock para vender " + cantidad + " unidad(es) de " + nombre);
        }
    }

    // Método para recalcular precio si le aplicamos un descuento (%)
    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        precio = precio - descuento;
        System.out.println(">> ¡Descuento del " + porcentaje + "% aplicado a " + nombre + "! Nuevo precio: $" + precio);
    }
}
