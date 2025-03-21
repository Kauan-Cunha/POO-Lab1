/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;

import java.util.ArrayList;
import java.util.List;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public abstract class Evento {
    private String nome;
    private Local local;
    private String data;
    private double precoIngresso;
    private int numIngressos;
    private List<Ingresso> ingressosVendidos;


    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     */
    public Evento(String nome, Local local, String data, double precoIngresso){
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.precoIngresso = precoIngresso;
        numIngressos = 0;
        List<Ingresso> ingressosVendidos = new ArrayList<Ingresso>();
    }

    /**
     * Retorna o nome do Evento
     * @return o nome do Evento
     */

    public int getNumIgressos(){
        return numIngressos;
    }
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do Evento para `nome` 
     * @param nome o novo nome do Evento
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o preço do ingresso do Evento
     * @return o precoIngresso do Evento
     */
    public double getPrecoIngresso(){
        return precoIngresso;
    }

    public Local getLocal(){
        return local;
    }

    public String getData(){
        return data;
    }

    /**
     * Altera o precoIngresso do Evento para `precoIngresso` 
     * @param precoIngresso o novo precoIngresso do Evento
     */
    public void setPrecoIngresso(double precoIngresso){
        this.precoIngresso = precoIngresso;
    }

    public void exibirDetalhes(){
        String saida = """
                Nome: %s
                Local: %s
                Data: %s
                Preço Inteira: %dR$
                """;
        System.out.println(String.format(saida, nome, local, data, precoIngresso));
    }
 
    public void adicionarIngresso(Ingresso ingresso, Usuario usuario){
        ingresso.setUsuario(usuario);
        ingressosVendidos.add(ingresso);
        numIngressos += 1;
    }

    public double calcularFaturamento(){
        double faturamento = 0;
        for(Ingresso ingresso:ingressosVendidos){
            faturamento +=ingresso.getPreco();
        }
        
        return faturamento;
    }
}   
