import java.util.*;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    private int numeroDeClase;
    private ArrayListInt notas;
    private float media;
    private boolean aprobado;
    public static final int MINIMO_APROBAR = 5;
    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numeroDeClase += 1;
        notas = new ArrayListInt();
    }
    
    /**
     * Método que nos permite añadir notas
     */
    public void añadirNota(int nota){
        notas.add(nota);
    }
    
    /**
     * Método  que nos permite crear la media de las notas
     */
    public void notaMedia(){
        int suma = 0;
        for(int i = 0; i < notas.size(); i++){
            suma = suma + notas.get(i);
            System.out.println("Nota: " + notas.get(i));
        }
        media = suma/notas.size();
        System.out.println("Suma: " + suma + "\n Media: " + media);
    }
    
    /**
     * Método que nos permite saber si está aprobado 
     */
    public void estaAprobado(){
        if(media < MINIMO_APROBAR){
            aprobado = false;
        }
        else{
            aprobado = true;
        }
       
        if(aprobado == true){
            System.out.println("Aprobado: Sí");
        }
        else {
            System.out.println("Aprobado: No");
        }
    }
    
    /**
     * Método que nos permite ver todos los datos del alumno.
     */
    public void datos(){
        System.out.println("Nombre: " + nombre + "\n Edad: " + edad + "\n  Número de clase: " + numeroDeClase + "\n  Nota media: " + media + "\n  Aprobado: " + aprobado);
    }

    
}
