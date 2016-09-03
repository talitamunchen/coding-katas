package Objetos;

import ManipulaObjetos.AdministraMaq;

/**
 *
 * @author Talita
 */
public class Administrador extends Usuario {

    public Administrador() {
        super();
    }
    
    public void consultar() {
        System.out.println("    Administrador: " + getNome() + ";" + getCodigo());        
    }
    
    public void reporSaldo (String nomeCliente){
        AdministraMaq.reporSaldo(nomeCliente);
    }
    
    public void reporIngredientes (){
        AdministraMaq.reporIngrediente();
    }
    
    
    
    
    
}
