package lab01;

import java.util.ArrayList;
import java.util.List;

public class HistoricoEventos {
    List<Evento> eventos;
    
    public HistoricoEventos(){
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento){
        eventos.add(evento);
    }
    
    public void exibir(){
        System.out.println("Eventos Cadastrados: ");
        for(Evento evento : eventos){
            System.out.println(evento.getNome()+ " (" + evento.getNumIgressos() + ");" );
        }
    }
}
