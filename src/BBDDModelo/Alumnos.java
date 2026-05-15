package BBDDModelo;

public class Alumnos {
    private int id;
    private String nombre;
    private String direccion;
    private String estadoMatricula;
    private boolean carnetConducir;

    //Constructores
    public Alumnos(int id, String nombre, String direccion, String estadoMatricula, boolean carnetConducir) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoMatricula = estadoMatricula;
        this.carnetConducir = carnetConducir;
    }

    public Alumnos(String nombre, String direccion, String estadoMatricula, boolean carnetConducir) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoMatricula = estadoMatricula;
        this.carnetConducir = carnetConducir;
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

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoMatricula() {
        return estadoMatricula;
    }
    public void setEstadoMatricula(String estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }

    public boolean getCarnetConducir() {
        return carnetConducir;
    }
    public void setCarnetConducir(boolean carnetConducir) {
        this.carnetConducir = carnetConducir;
    }

    @Override
    public String toString() {
        return "---- Alumno " + this.id + "---- \n" +
                "Nombre: " + this.nombre + "\n" +
                "Dirección: " + this.direccion + "\n" +
                "Matrícula: " + this.estadoMatricula + "\n" +
                "Carnet de conducir: " + this.carnetConducir + "\n";

    }
}
