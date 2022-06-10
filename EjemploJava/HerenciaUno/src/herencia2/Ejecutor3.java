package herencia2;

import herencia1.Estudiante;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Scanner;

public class Ejecutor3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opciones;

        Estudiante ed = new Estudiante();
        System.out.println("Que desea Ingresar");
        System.out.println("Ingrese 1 para Estudiantes Distancias: ");
        System.out.println("Ingrese 2 para Estudiantes Presencial: ");
        opciones = sc.nextInt();

        if (opciones == 1 || opciones == 2) {

            System.out.println("Ingrese los valores");
            System.out.println("--------------------");
            sc.nextLine();
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

            switch (opciones) {
                case 1:
                    if (opciones == 1) {
                        EstudianteDistancia e1 = new EstudianteDistancia();

                        e1.establecerNombresEstudiante(nombre);
                        e1.establecerApellidoEstudiante(apellido);
                        e1.establecerIdentificacionEstudiante(identificacion);
                        e1.establecerEdadEstudiante(edad);

                        System.out.println("Ingrese Numero de Asignaturas: ");
                        int numA = sc.nextInt();
                        e1.establecerNumeroAsginaturas(numA);
                        System.out.println("Ingrese el Costo de la Asignatura: ");
                        int costoA = sc.nextInt();
                        e1.establecerCostoAsignatura(costoA);

                        e1.calcularMatriculaDistancia();

                        System.out.printf("\n%s", e1);
                    }
                    break;

                case 2:

                    if (opciones == 2) {

                        EstudiantePresencial e2 = new EstudiantePresencial();

                        e2.establecerNombresEstudiante(nombre);
                        e2.establecerApellidoEstudiante(apellido);
                        e2.establecerIdentificacionEstudiante(identificacion);
                        e2.establecerEdadEstudiante(edad);

                        System.out.println("Ingrese el numero de Creditos: ");
                        int numC = sc.nextInt();
                        e2.establecerNumeroCreditos(numC);

                        System.out.println("Ingrese el costo de Creditos");
                        int costoC = sc.nextInt();
                        e2.establecerCostoCredito(costoC);
                        e2.calcularMatriculaPresencial();
                        System.out.printf("n%s", e2);

                    }

                    break;

            }

        } else {
            System.out.println("Opcion incorrecta");
        }

    }
}
