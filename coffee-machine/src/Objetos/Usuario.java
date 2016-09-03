package Objetos;

/**
 *
 * @author Talita
 */
public abstract class Usuario {
    
    protected String nome;
    protected Integer codigo;

    public Usuario() {
    }
    
    public void cadastrar (String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public abstract void consultar();  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
}
