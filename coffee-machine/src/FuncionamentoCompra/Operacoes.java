package FuncionamentoCompra;

import ManipulaObjetos.ManipulaIngred;
import Objetos.AdminInvalido;
import Objetos.Administrador;
import Objetos.Cliente;
import static Objetos.Cliente.listaClientes;
import Objetos.Ingredientes;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class Operacoes {
    
    private Administrador admin;
    
   
 
    
   private void criaAdmin() throws AdminInvalido{   
       String nome = JOptionPane.showInputDialog("Digite o nome do adminitrador: ");
       if (!"admin123".equals(nome)){
            throw new AdminInvalido(" **Administrador Incompativel!** ");
        }
        
        admin = new Administrador();
   }
        
    
   public void consultarSaldo (String nomeCliente) throws AdminInvalido{
       for (int i =0; i < listaClientes.size(); i++){
           Cliente c = listaClientes.get(i);
           if (c.getNome().equals(nomeCliente)){
               if (c.getSaldo() < 5){
                   //if (admin == null){ 
                       criaAdmin();
                   //}
                   admin.reporSaldo(nomeCliente);
               }
           }
       }
            
             
   }
   
   public void reporIngrediente () throws AdminInvalido{
       if (admin == null){
           criaAdmin();
       }
       admin.reporIngredientes();
   }
   
   private void baixaIngrediente (String nomeI, int gramasI){
       for (int i=0; i <ManipulaIngred.listaIngrediente.size();i++){
           Ingredientes ing = ManipulaIngred.listaIngrediente.get(i);
           if (ing.getNome().equalsIgnoreCase(nomeI)){ //se o nome do ingrediente for igual ao passao por paramentro
               ing.setGramas(ing.getGramas()-gramasI);
           }
           
       }
   }
   
   private void baixaSaldo (String nomeC, int quantidadeS){
       for (int i=0; i < listaClientes.size();i++){
           Cliente c = listaClientes.get(i);
           if (c.getNome().equalsIgnoreCase(nomeC)){
               c.setSaldo(c.getSaldo()-quantidadeS);
           }
       }
       
   }
   
   public void consumirIngredientes(String bebida){
       if (bebida.equalsIgnoreCase("café curto")){
           baixaIngrediente("café", 3);
           baixaIngrediente("açucar", 2);
       }else if (bebida.equalsIgnoreCase("café longo")){
           baixaIngrediente("café", 5);
           baixaIngrediente("açucar", 3);
       }else if(bebida.equalsIgnoreCase("cappucino")){
           baixaIngrediente("café", 4);
           baixaIngrediente("leite em pó", 3);
           baixaIngrediente("chocolate", 3);
           baixaIngrediente("açucar", 2);
       }    
       
   }
   
   public void consumirSaldo(String nomeCliente, String bebida){
       if (bebida.equalsIgnoreCase("café curto")){
           baixaSaldo(nomeCliente, 2);
       }else if (bebida.equalsIgnoreCase("café longo")){
           baixaSaldo(nomeCliente, 3);
       }else if (bebida.equalsIgnoreCase("cappucino")){
           baixaSaldo(nomeCliente, 5);
       }
   }
   
   
    
}
