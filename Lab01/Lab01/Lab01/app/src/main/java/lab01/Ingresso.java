/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

/**
 * Contém a estrutura de implementação de um Ingresso.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public abstract class Ingresso {

    private Evento evento;
    private Usuario usuario;

    /**
     * Construtor da classe Ingresso
     * @param evento o evento associado ao Ingresso
     */
    public Ingresso(Evento evento){
        this.evento = evento;
    }

    public Evento getEvento(){
        return evento;
    }

    /**
     * Retorna o preço do Ingresso
     * @return o preço do Ingresso
     */
    public abstract double getPreco();
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
