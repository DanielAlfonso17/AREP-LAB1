package edu.escuelaing.arep.app;

import edu.escuelaing.arep.app.model.FileReader;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;


public class AppTest {
    @Test
    public void deberiaCalcularMediaCorrecta() throws IOException {
        String path = "ArchivosPrueba/archivo1";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(550.6 == resultado[0] );
    }

    @Test
    public void deberiaCalcularDesviacionEstandarCorrecta() throws IOException{
        String path = "ArchivosPrueba/archivo1";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(572.026844746915 == resultado[1] );
    }

    @Test
    public void deberiaFallarCalculoMedia() throws  IOException{
        String path = "ArchivosPrueba/archivo1";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(550.5 == resultado[0] );
    }

    @Test
    public void deberiaFallarCalculoDesviacionEstandarCorrecta() throws IOException{
        String path = "ArchivosPrueba/archivo1";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(572.0268447469 == resultado[1] );
    }

    @Test
    public void deberiaCalcularMediaCorrecta1() throws IOException {
        String path = "ArchivosPrueba/archivo2";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(638.9 == resultado[0]);
    }

    @Test
    public void deberiaCalcularDesviacionEstandarCorrecta1() throws IOException{
        String path = "ArchivosPrueba/archivo2";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(625.6339806770231 == resultado[1]);
    }

    @Test
    public void deberiaFallarCalculoMedia1() throws  IOException{
        String path = "ArchivosPrueba/archivo2";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(639.1 == resultado[0] );
    }

    @Test
    public void deberiaFallarCalculoDesviacionEstandarCorrecta1() throws IOException{
        String path = "ArchivosPrueba/archivo2";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(625.1156465465 == resultado[1] );
    }

    @Test
    public void deberiaCalcularMediaCorrecta2() throws IOException {
        String path = "ArchivosPrueba/archivo3";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(60.32000000000001 == resultado[0] );
    }

    @Test
    public void deberiaCalcularDesviacionEstandarCorrecta2() throws IOException{
        String path = "ArchivosPrueba/archivo3";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertTrue(62.25583060601187 == resultado[1] );
    }

    @Test
    public void deberiaFallarCalculoMedia2() throws  IOException{
        String path = "ArchivosPrueba/archivo3";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(61.25 == resultado[0] );
    }

    @Test
    public void deberiaFallarCalculoDesviacionEstandarCorrecta2() throws IOException{
        String path = "ArchivosPrueba/archivo3";
        File archivo = new File(path);
        FileReader archivoLeer = new FileReader(archivo);
        double[] resultado = archivoLeer.leerArchivo();
        assertFalse(62.36 == resultado[1] );
    }
}
