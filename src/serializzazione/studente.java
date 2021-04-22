/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author agostinelli.luca
 */
public class studente implements Serializable {

    private int numerR;
    private String nome;
    private String cognome;

    public studente(int numerR, String nome, String cognome) {
        this.numerR = numerR;
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "studente{" + "numerR=" + numerR + ", nome=" + nome + ", cognome=" + cognome + '}';
    }

    public String getNome() {
        return nome;
    }

 

}
