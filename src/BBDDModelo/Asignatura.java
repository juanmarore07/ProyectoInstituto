package BBDDModelo;

public class Asignatura {
    private int id;
    private String nombre;
    private int curso;

    //Constructor
    public Asignatura(int id, String nombre, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }

    //Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "---- Asignatura " + this.id + "---- \n" +
                "Nombre: " + this.nombre + "\n" +
                "Curso: " + this.curso + "\n";

    }
}
