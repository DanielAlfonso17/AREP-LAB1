package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.model.FileReader;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String path = args[0];
        File archivo = new File(path);
        FileReader archivoLeer= new FileReader(archivo);
        archivoLeer.leerArchivo();
    }
}
