/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElsMeusBeans;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Raul Carayol Rodriguez
 */
public class Comanda implements Serializable, PropertyChangeListener {
    
    private int numComanda;
    private int idproducte;
    private Date data;
    private int quantitat;
    private boolean demana;
    
    public Comanda(){}

    public Comanda(int numComanda, int idproducte, Date data, int quantitat, boolean demana) {
        this.numComanda = numComanda;
        this.idproducte = idproducte;
        this.data = data;
        this.quantitat = quantitat;
        this.demana = demana;
    }
    
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Valor anterior:" + evt.getOldValue());
        System.out.println("Valor actual:" + evt.getNewValue());
        setDemana(true);
    }

    public int getNumComanda() {
        return numComanda;
    }

    public void setNumComanda(int numComanda) {
        this.numComanda = numComanda;
    }

    public int getIdproducte() {
        return idproducte;
    }

    public void setIdproducte(int idproducte) {
        this.idproducte = idproducte;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public boolean isDemana() {
        return demana;
    }

    public void setDemana(boolean demana) {
        this.demana = demana;
    }
    


    
}
