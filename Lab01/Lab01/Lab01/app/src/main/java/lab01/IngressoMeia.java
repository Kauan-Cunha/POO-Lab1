package lab01;

public class IngressoMeia extends Ingresso{
    @Override
    public double getPreco() {
        return (evento.getPrecoIngresso())/2;
    }
}