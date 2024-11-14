public class Libro {


    String codigo;
    String nombre;
    String autor;
    String materia;
    int numPaginas;

    public Libro(String codigo, String nombre, String autor, String materia, int numPaginas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.materia = materia;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {// aca estoy utilizacndo un metodo de la clase objet sobreescritura
        return "Código: " + codigo + ", Nombre: " + nombre + ", Autor: " + autor +
                ", Materia: " + materia + ", Páginas: " + numPaginas;
    }
}
