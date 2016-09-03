package ManipulaObjetos;

import Objetos.Bebida;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class ManipulaBebida {

     private Bebida bebida;
     public static ArrayList<Bebida> listaBebida = new ArrayList<>(); 

    public ManipulaBebida() {
        
    }
     
    public void cadastrarBebida (String bebida){
        this.bebida = new Bebida();     //instancia
        this.bebida.setBebida(bebida);  //seta
        listaBebida.add(this.bebida);   //adiciona
    }
    
    public void consultarBebida (){
        if (listaBebida.isEmpty()){
            JOptionPane.showMessageDialog(null, "LISTA VAZIA!");
            return;
        }
        String s = " → Bebidas cadastradas: \n";
        for (int i = 0; i < listaBebida.size(); i++){
            s+= listaBebida.get(i).getBebida() + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
     
}
