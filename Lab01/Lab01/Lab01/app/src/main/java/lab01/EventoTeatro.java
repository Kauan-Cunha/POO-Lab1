package lab01;

public class EventoTeatro extends Evento {
    String diretor;

    public EventoTeatro(String nome, Local local, double precoIngresso, String data, String diretor){
        super(nome, local, data, precoIngresso);
        this.diretor = diretor;
    }
}
