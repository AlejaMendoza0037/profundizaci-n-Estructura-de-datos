import java.util.Scanner;


public class Biblioteca {

    private Libro[] libros;
    private int count;




    //Este es el contructor

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];// aca inicializamos el arreglo de los libros con el tamaño especificado
        count = 0;
    }




    // Método para registrar un libro

    public void registrarLibro(Scanner scanner) {
        if (count < libros.length) {
            System.out.println("Ingrese el código del libro:");
            String codigo = scanner.next();
            System.out.println("Ingrese el nombre del libro:");
            String nombre = scanner.next();
            System.out.println("Ingrese el autor del libro:");
            String autor = scanner.next();
            System.out.println("Ingrese la materia del libro:");
            String materia = scanner.next();
            System.out.println("Ingrese el número de páginas:");
            int numPaginas = scanner.nextInt();

            libros[count++] = new Libro(codigo, nombre, autor, materia, numPaginas);

            System.out.println("Libro registrado con éxito.");
        } else {
            System.out.println("No hay espacio para más libros.");
        }
    }

    // Método para actualizar un libro
    public void actualizarLibro(Scanner scanner) {
        System.out.println("Ingrese el código del libro a actualizar:");
        String codigo = scanner.next();

        for (int i = 0; i < count; i++) {
            if (libros[i].codigo.equals(codigo)) {
                System.out.println("Ingrese el nuevo nombre del libro:");
                libros[i].nombre = scanner.next();
                System.out.println("Ingrese el nuevo autor del libro:");
                libros[i].autor = scanner.next();
                System.out.println("Ingrese la nueva materia del libro:");
                libros[i].materia = scanner.next();
                System.out.println("Ingrese el nuevo número de páginas:");
                libros[i].numPaginas = scanner.nextInt();
                System.out.println("Libro actualizado.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    // Método para eliminar un libro
    public void eliminarLibro(Scanner scanner) {
        System.out.println("Ingrese el código del libro a eliminar:");
        String codigo = scanner.next();

        for (int i = 0; i < count; i++) {
            if (libros[i].codigo.equals(codigo)) {
                for (int j = i; j < count - 1; j++) {
                    libros[j] = libros[j + 1];
                }
                libros[count - 1] = null;
                count--;
                System.out.println("Libro eliminado.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    // Método para buscar un libro
    public void buscarLibro(Scanner scanner) {
        System.out.println("Ingrese el código del libro a buscar:");
        String codigo = scanner.next();

        for (int i = 0; i < count; i++) {
            if (libros[i].codigo.equals(codigo)) {
                System.out.println("Libro encontrado: ");
                System.out.println(libros[i]);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    // Método para ordenar los libros
    public void ordenarLibros(Scanner scanner) {
        System.out.println("Seleccione el criterio para ordenar:");
        System.out.println("1. Por código");
        System.out.println("2. Por autor");
        int criterio = scanner.nextInt();

        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Método Burbuja");
        System.out.println("2. Método Selección");
        int metodo = scanner.nextInt();

        switch (criterio) {
            case 1:
                if (metodo == 1) {
                    ordenarPorCodigoBurbuja();
                } else if (metodo == 2) {
                    ordenarPorCodigoSeleccion();
                }
                break;
            case 2:
                if (metodo == 1) {
                    ordenarPorAutorBurbuja();
                } else if (metodo == 2) {
                    ordenarPorAutorSeleccion();
                }
                break;
        }
    }

    // ordenar por código con el método de Burbuja
    private void ordenarPorCodigoBurbuja() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (libros[j].codigo.compareTo(libros[j + 1].codigo) > 0) {
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
        System.out.println("Libros ordenados por código usando Burbuja.");
    }

    // rdenar por código con el método de Selección
    private void ordenarPorCodigoSeleccion() {
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (libros[j].codigo.compareTo(libros[minIndex].codigo) < 0) {
                    minIndex = j;
                }
            }
            Libro temp = libros[i];
            libros[i] = libros[minIndex];
            libros[minIndex] = temp;
        }
        System.out.println("Libros ordenados por código usando Selección.");
    }

    // ordenar por autor con el método de Burbuja
    private void ordenarPorAutorBurbuja() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (libros[j].autor.compareTo(libros[j + 1].autor) > 0) {
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
        System.out.println("Libros ordenados por autor usando Burbuja.");
    }

    //  ordenar por autor con el método de Selección
    private void ordenarPorAutorSeleccion() {
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (libros[j].autor.compareTo(libros[minIndex].autor) < 0) {
                    minIndex = j;
                }
            }
            Libro temp = libros[i];
            libros[i] = libros[minIndex];
            libros[minIndex] = temp;
        }
        System.out.println("Libros ordenados por autor usando Selección.");
    }
}
