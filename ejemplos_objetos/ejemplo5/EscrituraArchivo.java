package ejemplo5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class EscrituraArchivo {

    public static void main(String[] args) {

        //crear un jfilechooser para que el usuario elija la ruta de escritura
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona la ruta para guardar el archivo");

        //mostrar el cuadro de dialogo para seleccionar la ruta
        int seleccion = fileChooser.showSaveDialog(null);

        //se verifica si el usuario selecciono una ruta
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            
            //obtener el archivo seleccionado
            File archivo = fileChooser.getSelectedFile();

            //escribir en el archivo
            escribirArchivo(archivo.getAbsolutePath());

            //leer el archivo
            leerArchivo(archivo.getAbsolutePath());
        } else {
            System.out.println("No se selecciono ninguna ruta");
        }
    }

    //para escribir en el archivo
    
    public static void escribirArchivo(String rutaArchivo) {

        /*
         * Lo que se encuentra en los parentesis del try son recursos que se cierran automaticamente
         * al final del bloque, sin necesidad de hacerlo manualmente
         * incluso si ocurre una excepción dentro del bloque
         */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            //escribir el archivo
            writer.write("Hola, este es un archivo de ejemplo\n");
            writer.write("Estamos aprendiendo a manejar archivos en Java en IPC 1\n");

            System.out.println("Datos escritos en el archivo correctamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    //para leer desde un archivo
    public static void leerArchivo(String rutaArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            System.out.println("\n\nLeyendo el contenido del archivo:");

            String linea;
            //leer el archivo linea por linea
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
