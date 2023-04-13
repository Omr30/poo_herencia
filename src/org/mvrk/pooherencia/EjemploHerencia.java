package org.mvrk.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("========= Creando la instancia de la clase Alumno =========");
        Alumno alumno = new Alumno("Oscar", "Mr", 27, "Isil");
        alumno.setNotaHistoria(5.3);
        alumno.setNotaLenguaje(9.3);
        alumno.setNotaMatematica(2.4);
        alumno.setEmail("oscar@test.com");

        System.out.println("========= Creando la instancia de la clase AlumnoInternacional =========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaLenguaje(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@test.com");

        System.out.println("========= Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("luci@test.com");

        System.out.println("========= - =========");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo datos en comun del tipo Persona");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido:  " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Lenguaje: " + ((Alumno) persona).getNotaLenguaje());
            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }

        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("=====================");
    }

}
