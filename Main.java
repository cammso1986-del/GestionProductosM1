// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        
        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTIÓN DE INVENTARIO     ");
        System.out.println("========================================\n");

        // 1. INSTANCIACIÓN DE 10 OBJETOS (PRODUCTOS)
        Producto p1 = new Producto("Laptop Gamer Pro", 1200.00, 10, "Electrónica");
        Producto p2 = new Producto("Teclado Mecánico RGB", 50.00, 25, "Accesorios");
        Producto p3 = new Producto("Mouse Inalámbrico", 25.50, 40, "Accesorios");
        Producto p4 = new Producto("Monitor 24 pulgadas", 180.00, 12, "Electrónica");
        Producto p5 = new Producto("Audífonos Bluetooth", 45.00, 30, "Audio");
        Producto p6 = new Producto("Silla Ergonómica Oficina", 220.00, 8, "Muebles");
        Producto p7 = new Producto("Escritorio Minimalista", 150.00, 5, "Muebles");
        Producto p8 = new Producto("Memoria USB 64GB", 15.00, 60, "Almacenamiento");
        Producto p9 = new Producto("Disco Duro Externo 1TB", 75.00, 15, "Almacenamiento");
        Producto p10 = new Producto("Impresora Multifuncional", 130.00, 7, "Oficina");

        // 2. MOSTRAR EL INVENTARIO DE TODOS LOS PRODUCTOS
        System.out.println("--- MOSTRANDO INVENTARIO INICIAL ---");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        p4.mostrarInformacion();
        p5.mostrarInformacion();
        p6.mostrarInformacion();
        p7.mostrarInformacion();
        p8.mostrarInformacion();
        p9.mostrarInformacion();
        p10.mostrarInformacion();

        System.out.println("\n========================================");
        System.out.println("   PROBANDO ACCIONES Y MÉTODOS          ");
        System.out.println("========================================");

        // Aplicamos descuento a algunos productos
        p1.aplicarDescuento(15); // 15% de descuento a la Laptop
        p4.aplicarDescuento(10); // 10% de descuento al Monitor

        System.out.println();

        // Realizamos ventas para probar el control de stock
        p2.vender(5);  // Vendemos 5 teclados
        p7.vender(2);  // Vendemos 2 escritorios
        p10.vender(10); // Intentamos vender más de lo que hay (prueba de validación)

        System.out.println("\n========================================");
        System.out.println("   FIN DE LA EJECUCIÓN DEL SISTEMA      ");
        System.out.println("========================================");
    }
}