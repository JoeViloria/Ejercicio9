public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Cliente y mostrar sus propiedades
        Cliente cliente = new Cliente(30, "Juan", "123456789", 1000.0);
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println();

        // Crear un objeto de la clase Trabajador y mostrar sus propiedades
        Trabajador trabajador = new Trabajador(35, "María", "987654321", 2000.0);
        System.out.println("Trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}