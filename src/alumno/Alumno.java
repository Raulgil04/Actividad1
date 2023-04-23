package alumno;

public class Alumno {
    private static double notamediaglobal;
    private String nombre;
    private double notaMedia = 0.0;

    public String getNombre() {
        return nombre;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
    
    public static double getnotamediaglobal(){
        return notamediaglobal;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
        notamediaglobal+= notaMedia;
    }
}
