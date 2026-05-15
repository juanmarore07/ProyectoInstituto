package BBDDModelo;

public class Matriculas {
    private int id;
    private int idAlumno;
    private int idAsignatura;
    private double nota;

    //Constructor
    public Matriculas(int id, int idAlumno, int idAsignatura, double nota) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.nota = nota;
    }

    //Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getIdAlumno() {
        return idAlumno;
    }
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }
    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "---- Matricula " + this.id + "---- \n" +
                "ID alumno: " + this.idAlumno + "\n" +
                "ID asignatura: " + this.idAsignatura + "\n" +
                "nota: " + this.nota + "\n";

    }
}
