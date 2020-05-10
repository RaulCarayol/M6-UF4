/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElsMeusBeans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Raul Carayol Rodriguez
 */
public class Producte implements Serializable {
    
    private String descripcio;
    private int idproducte;
    private int stockactual;
    private int stockminim;
    private float pvp;
    
    private PropertyChangeSupport propertySupport;
    public Producte() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public Producte(String descripcio, int idproducte, int stockactual,
            int stockminim, float pvp) {
        this.descripcio = descripcio;
        this.idproducte = idproducte;
        this.stockactual = stockactual;
        this.stockminim = stockminim;
        this.pvp = pvp;
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getIdproducte() {
        return idproducte;
    }

    public void setIdproducte(int idproducte) {
        this.idproducte = idproducte;
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setStockactual(int stocknuevo) {
        int valorAnterior = stockactual;
        stockactual = stocknuevo;
        //mira si que el stockaje actual nunca baje del minimo
        //si baja del minimo se tiene que hacer una "comanda" 
        //para restablecer el stockaje
        if(getStockminim() > stockactual){
            propertySupport.firePropertyChange("stockavtual",
                    valorAnterior,stockactual);
        }
    }

    public int getStockminim() {
        return stockminim;
    }

    public void setStockminim(int stockminim) {
        this.stockminim = stockminim;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    

    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
