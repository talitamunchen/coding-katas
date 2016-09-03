package ManipulaObjetos;

import static ManipulaObjetos.ManipulaBebida.listaBebida;
import Objetos.Ingredientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class ManipulaIngred {
    
    private Ingredientes ingrediente;
    public static ArrayList<Ingredientes> listaIngrediente = new ArrayList<>();

    public ManipulaIngred() {
        
    }
    
    public void cadastrarIngrediente(String ingrediente, int quantidade){ //quantidade = granmas
        this.ingrediente = new Ingredientes();  //cria
        this.ingrediente.setGramas(quantidade); //seta
        this.ingrediente.setNome(ingrediente);  //seta
        listaIngrediente.add(this.ingrediente); //adiciona
    }
    
    public void consultarIngrediente(){
        if (listaIngrediente.isEmpty()){
            JOptionPane.showMessageDialog(null, "LISTA VAZIA!");
            return;
        }
        String texto = "→Ingrediente: \n";
        for (int i = 0; i < listaIngrediente.size(); i ++){
            texto+= listaIngrediente.get(i).getNome() + " " + listaIngrediente.get(i).getGramas() + "gr\n";              
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    
}
