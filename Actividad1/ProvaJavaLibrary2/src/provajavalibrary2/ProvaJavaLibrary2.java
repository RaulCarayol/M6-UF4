/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provajavalibrary2;
import ElsMeusBeans.Comanda;
import ElsMeusBeans.Producte;
/**
 *
 * @author Raul Carayol Rodriguez
 */
public class ProvaJavaLibrary2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producte producte = new Producte("Portable Msi USB 3.0",1,10,3,50);
        Comanda comanda = new Comanda();
        
        producte.addPropertyChangeListener(comanda);
        
        producte.setStockactual(2);
        if(comanda.isDemana()){
            System.out.print("Fer comnada en pproducte :" + producte.getDescripcio() );
        }else{
             System.out.print("No es necesari fer la comanda del pproducte :" + producte.getDescripcio() );
        }
    }
    
}
