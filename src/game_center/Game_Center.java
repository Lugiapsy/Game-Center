/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_center;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lugiapsy
 */
public class Game_Center {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void lanceur(String command) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(command);
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            //Attendre la fin de l'execution
            if (process.waitFor() != 0) {
                System.out.println("Une erreur est survenue ");
            }
        } catch (InterruptedException | IOException ex) {
            Logger.getLogger(Game_Center.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
