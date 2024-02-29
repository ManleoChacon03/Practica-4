/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author alexa
 */
public class Arbolbinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo raiz=new Nodo("F");
        Nodo nodo2=new Nodo("A");
        Nodo nodo3=new Nodo("G");
        
        raiz.setNodoIzaquierda(nodo2);
        nodo2.setNodoIzaquierda(new Nodo("B"));
        
        Nodo nodo4=new Nodo("D");
        nodo2.setNodoDerecha(nodo4);
        
        nodo4.setNodoIzaquierda(new Nodo("C"));
        nodo4.setNodoDerecha(new Nodo("E"));
        
        raiz.setNodoDerecha(nodo3);
        
        Nodo nodo5=new Nodo("I");
        nodo3.setNodoDerecha(nodo5);
        
        nodo5.setNodoIzaquierda(new Nodo("H"));
        
        System.out.println("In Orden");
        InOrden(raiz);
        
        System.out.println("Post Orden");
        PostOrden(raiz);
        
        System.out.println("Pre Orden");
        preOrden(raiz);
        
    }
    public static void preOrden(Nodo raiz){
        if(raiz!=null){
            System.out.println(raiz.getDato());
            preOrden(raiz.getNodoIzaquierda());
            preOrden(raiz.getNodoDerecha());
        }
    }
    public static void InOrden(Nodo raiz){
        if(raiz!=null){
            InOrden(raiz.getNodoIzaquierda());
            System.out.println(raiz.getDato());
            InOrden(raiz.getNodoDerecha());
        }
    }
    public static void PostOrden(Nodo raiz){
        if(raiz!=null){
            PostOrden(raiz.getNodoIzaquierda());
            PostOrden(raiz.getNodoDerecha());
            System.out.println(raiz.getDato());
        }
    }
    
    
}
