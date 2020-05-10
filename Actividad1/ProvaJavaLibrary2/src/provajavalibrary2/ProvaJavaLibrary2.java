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
        //se hace un array de productos
        Producte[] arrayProductos = new Producte[6];
        arrayProductos[0]= new Producte("Portable Msi USB 3.0",1,10,3,50);
        arrayProductos[1]= new Producte("Disco duro 1tb",2,13,3,45);
        arrayProductos[2]= new Producte("Placa Base msi dragon",3,4,4,150);
        arrayProductos[3]= new Producte("16gb 2x8gb ",4,8,1,40);
        arrayProductos[4]= new Producte("multiples puertos usb tipo c",5,20,4,4);
        arrayProductos[5] = new Producte("Raton corsair 3000",6,22,3,25);

        //lo mismo con las comandas
        Comanda[] arrayComanda = new Comanda[6];
        for (int i = 0; i < arrayProductos.length; i++) {
             arrayComanda[i]= new Comanda();
             //se asigna la comanda con su respectivo producto
             arrayProductos[i].addPropertyChangeListener(arrayComanda[i]);

        }
        //producte.addPropertyChangeListener(comanda);
        System.out.println("Stock Minimo del producto: "+ arrayProductos[0].getStockminim());
        arrayProductos[0].setStockactual(2);
        System.out.println("Stock Minimo del producto: "+ arrayProductos[1].getStockminim());
        arrayProductos[1].setStockactual(2);
        System.out.println("Stock Minimo del producto: "+ arrayProductos[2].getStockminim());
        arrayProductos[2].setStockactual(1);
        System.out.println("Stock Minimo del producto: "+ arrayProductos[3].getStockminim());
        arrayProductos[3].setStockactual(4);
        System.out.println("Stock Minimo del producto: "+ arrayProductos[4].getStockminim());
        arrayProductos[4].setStockactual(2);
        
          for (int i = 0; i < arrayComanda.length; i++) {
            if(arrayComanda[i].isDemana()){
                    System.out.println("Fer comnada en producte :" + arrayProductos[i].getDescripcio() );
                }else{
                    System.out.println("No es necesari fer la comanda del producte :" + arrayProductos[i].getDescripcio() );
                }
        }

    }
    
}
