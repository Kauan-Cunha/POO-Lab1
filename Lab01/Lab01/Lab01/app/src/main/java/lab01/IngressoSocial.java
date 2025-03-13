package lab01;

public class IngressoSocial extends Ingresso{

    public IngressoSocial(Evento evento){
        super(evento);
    }
    public double getPreco() {
        return (getEvento().getPrecoIngresso())/3;
    }
}
