package edu.escuelaing.arep.app.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Daniel Alfonso
 */
public class FileReader {
    private File archivo;
    private Operations media;
    private Operations desviacionStandard;
    private double[] respuesta;


    public FileReader(File archivo) {
        this.archivo = archivo;
        media = new Mean();
        respuesta = new double[2];
    }

    public double[] leerArchivo() throws IOException {
        FileReader fr = new FileReader(archivo);
        LinkedList listaNumeros = new LinkedList();
        BufferedReader buffer = new BufferedReader(new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(archivo), "UTF8")));
        String linea;
        try {
            Nodo nodo = new Nodo(0);
            Nodo nuevoNodo; 
            listaNumeros.add(nodo);
            while ((linea = buffer.readLine()) != null) {
                linea = linea.trim();
                if(linea.contains(".")){
                    nuevoNodo = new Nodo(Double.parseDouble(linea));
                    listaNumeros.add(nuevoNodo);
               }else {
                    nuevoNodo = new Nodo(Integer.parseInt(linea));
                    listaNumeros.add(nuevoNodo);
                }
            }
            double valorMedia = media.calculate(listaNumeros);
            desviacionStandard =  new StandardDeviation(valorMedia);
            double valorDesviacionEstandar = desviacionStandard.calculate(listaNumeros);
            System.out.printf("\nEl valor de la media es: %.2f" , valorMedia);
            System.out.printf("\nEl valor de la desviación estandar es: %.2f" , valorDesviacionEstandar);
            respuesta[0] = valorMedia;
            respuesta[1] = valorDesviacionEstandar;
            return respuesta;
        } catch (Exception e) {
            throw new UnsupportedOperationException("No se puede leer el archivo");
        }
    }
}
