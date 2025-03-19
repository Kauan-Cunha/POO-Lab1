package lab01;

public class EventoTeatro extends Evento{
    String diretor;

    public EventoTeatro(String nome, Local local, double precoIngresso, String data, String diretor){
        super(nome, local, data, precoIngresso);
        this.diretor = diretor;
    }
    @Override
    public void exibirDetalhes() {
        String saida = """
                Nome: %s\n
                Local: %s\n
                Diretor: %s\n
                Data: %s \n
                Preço Inteira: %dR$\n
                """;
        System.out.println(String.format(saida, getNome(), getLocal().getNome(), diretor, getData(), getPrecoIngresso()));
    }
}
