package main;

import FuncionamentoCompra.Operacoes;
import ManipulaObjetos.AdministraMaq;
import ManipulaObjetos.ManipulaBebida;
import ManipulaObjetos.ManipulaIngred;
import Objetos.AdminInvalido;
import Objetos.Bebida;
import Objetos.Cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class Principal {

    public static void main(String[] args) throws AdminInvalido {
        Scanner l = new Scanner (System.in);
        
        menu();
    }
    
    public static void menu () throws AdminInvalido{
        ManipulaBebida mb = new ManipulaBebida();
        ManipulaIngred mi = new ManipulaIngred();
        Cliente mc = new Cliente();
        Operacoes oper = new Operacoes();
        do{
            //JOptionPane.showMessageDialog(null, "BEM VINDO AO MENU");
            //JOptionPane.showMessageDialog(null, "Escolha uma das opções a seguir");
            String op = JOptionPane.showInputDialog(null, "1. Cadastrar bebida\n" + 
                                                          "2. Listar bebidas \n" +
                                                          "3. Cadastrar ingrediente: \n" + 
                                                          "4. Consultar ingrediente \n" +
                                                          "5. Cadastrar Cliente \n" + 
                                                          "6. Consultar Clientes \n" +
                                                          "7. Comprar bebida \n" + 
                                                          "9. Sair!");
            // SE A PESSOA CLICAR EM CANCELAR op FICA NULL, sair
            if(op == null) {
                System.exit(0);
            }
            
            switch (op){
                case "1":
                    String b = JOptionPane.showInputDialog("Digite o nome da bebida: ");
                    mb.cadastrarBebida(b.trim().toLowerCase());
                    break;
                case "2":
                    mb.consultarBebida();
                    break;
                case "3":
                    String ing = JOptionPane.showInputDialog("Digite o nome do ingrediente: ");
                    try{
                        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite as gramas: "));
                        mi.cadastrarIngrediente(ing, quantidade);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO!");
                    }
                    break;
                case "4":
                    mi.consultarIngrediente();
                    break;
                case "5":
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
                    try{
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: "));
                        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo do cliente: "));
                        Cliente cliente = new Cliente();
                        cliente.setSaldo(saldo);
                        cliente.cadastrar(nome, codigo);
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO");
                    }
                    break;
                case "6":
                   mc.consultar();
                    break;
                case "7": 
                    try {
                        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do usuario: ");
                       /* boolean achei = false;
                        for(int i =0; i < listalxcvalckv.sozeIO; i++) {
                            Clicente c = listalshlasd.get(i);
                            if(c.getNome().equalsisdjfisdjf(nomeCliente));
                            achei = true;
                        }
                        if(acheri == false) {
                            kjsdhfksdhf "nkajsdnknsd"
                        }*/
                        String beb = JOptionPane.showInputDialog("Digite a bebida: ").trim();// SEMPRE QUANDO PEDIR UMA STRING, FAZER O TRIM PARA GARANTIR QUE NÃO VEIO ESPAÇOS DOS LADOS
                        oper.consultarSaldo(nomeCliente);
                        //AdministraMaq.reporSaldo(nomeCliente);  //só repõe do cliente passado por parameto se for menor que 5
                        AdministraMaq.reporIngrediente();       //só repõe se for menor que 5
                        oper.consumirIngredientes(beb);
                        oper.consumirSaldo(nomeCliente, beb);
                    } catch(AdminInvalido e) {
                        JOptionPane.showMessageDialog(null, "Admin inválido, fechando programa.");
                        System.exit(0);
                    }
                    break;
                case "9":
                    System.exit(0);
                    break;
                    
                default: 
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            }
        }while(1==1);
    }
}
