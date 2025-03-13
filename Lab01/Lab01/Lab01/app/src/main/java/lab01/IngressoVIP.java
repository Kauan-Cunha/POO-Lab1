package lab01;

public class IngressoVIP extends Ingresso {
    @Override
    public double getPreco() {
        return (evento.getPrecoIngresso())*2;
    }
}
