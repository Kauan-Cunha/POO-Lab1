package lab01;

public class EventoShow extends Evento {
    String artista;
    
    public EventoShow(String nome, Local local, double precoIngresso
                    ,String artista, String data){
        super(nome, local, data, precoIngresso);
        this.artista = artista;
    }
    @Override
    public void exibirDetalhes() {
        String saida = """
                Nome: %s\n
                Local: %s\n
                Artista: %s\n
                Data: %s \n
                Preço Inteira: %dR$\n
                """;
        System.out.println(String.format(saida, getNome(), getLocal().getNome(), artista, getData(), getPrecoIngresso()));
    }
}
