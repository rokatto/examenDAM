/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Joan
 */
public class Caixer implements Serializable{   
    private static final long serialVersionUID = 5091667629793827365L;
    
    private String nom;
    //Cola de espectadores
    private Cua<Espectador> llista;
    
    //constructor
    public Caixer(String nom) {
        this.setNom(nom);
        this.setLlista(new Cua<Espectador>());
    }
    
     //getters setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Cua<Espectador> getLlista() {
        return llista;
    }

    public void setLlista(Cua<Espectador> llista) {
        this.llista = llista;
    }
    
    //METODOS//  
    //Espectador entra en la cola del cajero
    public void entrarCua(Espectador esp){
        this.getLlista().push(esp);
    }
    //Sale de la cola del cajero. Retorna el espectador y lo elimina de la cola.
    public Espectador sortirCaixer(){
        return this.getLlista().pop();
    }
    
    @Override
    public String toString() {
        return this.getLlista().toString();
    }
}

