/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;
import java.util.Scanner;
public class ArrayDeAlumnosPrincipal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// Define la estructura, un array de 5 alumnos
// pero no crea los objetos
        Alumno[] alum = new Alumno[5];
// Pide los datos de los alumnos /////////////////////////////////
System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos."
        );
String nombreIntroducido;
        double notaIntroducida;
        for (int i = 0; i < 5; i++) {
            alum[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido =s.nextLine();
            (alum[i]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = s.nextDouble();
            alum[i].setNotaMedia(notaIntroducida);
        } // for i
// Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");
        double sumaDeMedias = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += alum[i].getNotaMedia();
        } // for i
        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
        System.out.println("La media global de la clase es " + alum[1].getnotamediaglobal() / 5);
        
    }
}

