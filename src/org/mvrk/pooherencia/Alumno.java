package org.mvrk.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaLenguaje;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }


    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaHistoria, double notaLenguaje){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaHistoria = notaHistoria;
        this.notaLenguaje = notaLenguaje;

    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
