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
import java.io.Serializable;
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
    public static void main(String[] args) throws InterruptedException {
        File f;
        f = new File("testo.ser");
        generatore g=new generatore();
        studente[] lista = new studente[3];
        try {
           g.generaGeneralita();
            Thread t = new Thread(g);
            
            //blocco che scrive
            
            t.run();
            
            FileOutputStream st = new FileOutputStream(f);
            ObjectOutputStream OS = new ObjectOutputStream(st);  //va a sovrascrivere

            OS.close();
            st.close();

            //blocco che le legge
            FileInputStream FI = new FileInputStream(f);
            ObjectInputStream IS = new ObjectInputStream(FI);

// String v2=(String) IS.readObject();
        } catch (IOException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
