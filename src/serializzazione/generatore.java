/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.ArrayList;

/**
 *
 * @author agostinelli.luca
 */
public class generatore implements Runnable {

    ArrayList<studente> studenti = new ArrayList();
    String[] nomi = new String[3];
    String[] cognomi = new String[3];

    @Override
    public void run() {
         
        while (true) {
            int i = (int) (Math.random() * 3) + 0;
            int r = (int) (Math.random() * 100) + 0;
            studenti.add(new studente(r, nomi[i], cognomi[i]));
            System.out.println(studenti.get(i).toString());
        }

    }

    public void generaGeneralita() {

        nomi[0] = "fabio";
        nomi[1] = "andrea";
        nomi[2] = "luca";
        cognomi[0] = "bellone";
        cognomi[1] = "carlone";
        cognomi[2] = "verdone";
    }

}
