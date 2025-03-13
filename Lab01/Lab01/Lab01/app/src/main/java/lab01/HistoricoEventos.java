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
}
