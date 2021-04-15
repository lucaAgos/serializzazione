/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agostinelli.luca
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f;
        f = new File("testo.ser");
        studente s = new studente("e3e34", "pasquale", "gnegne");
        try {
            f.createNewFile();
            FileOutputStream st = new FileOutputStream(f);
            ObjectOutputStream OS = new ObjectOutputStream(st);
            OS.writeObject("sono bello");
           
           
            OS.close();
            st.close();
           
            FileInputStream FI = new FileInputStream(f);
            ObjectInputStream IS = new ObjectInputStream(FI);
            String  v1 = (String) IS.readObject();
           // String v2=(String) IS.readObject();
            System.out.println(v1);

        } catch (IOException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
