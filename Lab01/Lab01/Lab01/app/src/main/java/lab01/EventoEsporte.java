package lab01;

public class EventoEsporte extends Evento {
    private String acento;

    public EventoEsporte(String nome, Local local, String acento, double precoIngresso, String data){
        super(nome, local, data, precoIngresso);
        this.acento = acento;
    }
    
    public void exibirDetalhes(){
        String saida = """
            Nome: %s\n
            Local: %s\n
            Artistas: %s\n
            Data: %s \n
            Preço Inteira: %dR$\n
            Acento: %s\n
            """;
        System.out.printf(saida, getNome(), getLocal().getNome(), acento, getData(), getPrecoIngresso());
    }
}
