/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import static java.util.Locale.US;
import java.util.Scanner;


public class Ejecutor2 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        sc.useLocale(US);
        
        EstudianteDistancia ed = new EstudianteDistancia();
        
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        ed.establecerNombresEstudiante(nombre);
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        ed.establecerApellidoEstudiante(apellido);
        System.out.println("Ingrese su Indetificacion: ");
        String identificacion = sc.nextLine();
        ed.establecerIdentificacionEstudiante(identificacion);
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        ed.establecerEdadEstudiante(edad);
        System.out.println("Ingrese Numero de Asignaturas: ");
        int numA = sc.nextInt();
        ed.establecerNumeroAsginaturas(numA);
        System.out.println("Ingrese el Costo de la Asignatura: ");
        int costoA = sc.nextInt();
        ed.establecerCostoAsignatura(costoA);

        ed.calcularMatriculaDistancia();
        
        
        System.out.printf("Nombre: %s\n"
        +"Apellido %s\n"
        +"Identificacion: %s\n"
        +"Edad: %d\n"
        +"Numero de asignatura: %d\n"
        +"Costo Asignatura: %.2f\n"
        +"Costo Matricula: %.2f\n",
        ed.obtenerNombresEstudiante(),
        ed.obtenerApellidoEstudiante(),
        ed.obtenerIdentificacionEstudiante(),
        ed.obtenerEdadEstudiante(),
        ed.obtenerNumeroAsignaturas(),
        ed.obtenerCostoAsignatura(),
        ed.obtenerMatriculaDistancia());
        
        
    }
    
}
