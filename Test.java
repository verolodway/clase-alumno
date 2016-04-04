import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    private Alumno alumno;
    private ArrayList<String> nombresAleatorios; 
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        Random rnd = new Random();
        nombresAleatorios = new ArrayList<String>();
        nombresAleatorios.add("Ana");
        nombresAleatorios.add("Andres");
        nombresAleatorios.add("Sandra");
        nombresAleatorios.add("Pablo");
        nombresAleatorios.add("Angela");
        
        
        alumno = new Alumno(nombresAleatorios.get(rnd.nextInt(4)+0), rnd.nextInt(25)+12);
        
        alumno.añadirNota(rnd.nextInt(10)+0);
        alumno.añadirNota(rnd.nextInt(10)+0);
        alumno.añadirNota(rnd.nextInt(10)+0);
        alumno.añadirNota(rnd.nextInt(10)+0);
        alumno.añadirNota(rnd.nextInt(10)+0);
        
        alumno.notaMedia();
        
        alumno.estaAprobado();
        
        alumno.datos();
    }

    
}
