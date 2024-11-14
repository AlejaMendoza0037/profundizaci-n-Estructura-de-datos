import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(100);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Registrar nuevo libro");
            System.out.println("2. Actualizar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Buscar libro");
            System.out.println("5. Ordenar libros");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    biblioteca.registrarLibro(scanner);
                    break;
                case 2:
                    biblioteca.actualizarLibro(scanner);
                    break;
                case 3:
                    biblioteca.eliminarLibro(scanner);
                    break;
                case 4:
                    biblioteca.buscarLibro(scanner);
                    break;
                case 5:
                    biblioteca.ordenarLibros(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();


    }
}