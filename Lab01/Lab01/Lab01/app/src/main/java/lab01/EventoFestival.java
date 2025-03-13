package lab01;

import java.util.List;

public class EventoFestival extends Evento {
    List<String> artistas;

    public EventoFestival(String nome, Local local, String data, double precoIngresso, List<String> artistas){
        super(nome, local, data, precoIngresso);
        this.artistas = artistas;
    }

    @Override
    public void exibirDetalhes() {
        String saida = """
                Nome: %s\n
                Local: %s\n
                Artistas: %s\n
                Data: %s \n
                Preço Inteira: %dR$\n
                """;
        System.out.println(String.format(saida, getNome(), getLocal().getNome(), artistas, getData(), getPrecoIngresso()));
    }
}
