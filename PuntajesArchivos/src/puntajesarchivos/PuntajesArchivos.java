/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntajesarchivos;

/**
 *
 * @author Kevin Garcia
 */

import java.io.*;

public class PuntajesArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int numeroPuntajes;
        int puntaje;
        
        File file = new File("Puntajes.txt");
        
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }
        
        numeroPuntajes = (int) (Math.random() * 10) + 1;
        
        for(int i=0; i<numeroPuntajes; i++){
            puntaje = (int) (Math.random() * 999) + 1;
            FileWriter Sobrescribe = new FileWriter(file.getAbsoluteFile(),true);
            try(BufferedWriter Puntajes = new BufferedWriter (Sobrescribe)){
                Puntajes.write("Puntaje:" + puntaje);
                Puntajes.newLine();
                Puntajes.close();
            }catch(IOException e){
                System.out.println("Error: " + e);
            }
        }
    }
    
}
