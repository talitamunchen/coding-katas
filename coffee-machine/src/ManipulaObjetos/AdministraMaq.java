package ManipulaObjetos;

import Objetos.Cliente;
import Objetos.Ingredientes;

/**
 *
 * @author Talita
 */
public class AdministraMaq {

    public AdministraMaq() {
    
    }
    
    public static void reporIngrediente(){
        for (int i = 0; i < ManipulaIngred.listaIngrediente.size(); i ++){
            Ingredientes ing = ManipulaIngred.listaIngrediente.get(i);
            int quantidade = ing.getGramas(); //acessa a quantidade de gramas
            if (quantidade < 5){
                ing.setGramas(quantidade+5); //seta a variavel alterada
                System.out.println("    Ingrediente " + ing.getNome() + " creditado!");
            }else{
                System.out.println("    Tudo ok com " + ing.getNome() + " pode prosseguir!");
            }
        }
        
    }
    
    public static void reporSaldo (String nomeCliente){
        for (int i=0; i < Cliente.listaClientes.size(); i++){
            Cliente c = Cliente.listaClientes.get(i);
            int saldo = c.getSaldo();
            if (c.getNome().equals(nomeCliente)){
                if (saldo < 5){
                    c.setSaldo(saldo+5); 
                }
                   
            }
        }
        
    }
    
}
