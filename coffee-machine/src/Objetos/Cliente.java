package Objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class Cliente extends Usuario {
    
    private Integer saldo;
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Cliente() {
        
    }
    
    @Override
    public void cadastrar(String nome, int codigo){
        super.cadastrar(nome, codigo);
        listaClientes.add(this);      
    }

    public void consultar() {
        if (listaClientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "LISTA VAZIA!");
            return;
        }
        String texto = "Clientes cadastrados: \n";
        for (int i=0; i < listaClientes.size(); i ++){
            Cliente c = listaClientes.get(i);
            texto+= "Nome: " + c.getNome() + "; Código: " + c.getCodigo() + "; Saldo: " + c.getSaldo() + "\n";
       }
        JOptionPane.showMessageDialog(null, texto);
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    
}
