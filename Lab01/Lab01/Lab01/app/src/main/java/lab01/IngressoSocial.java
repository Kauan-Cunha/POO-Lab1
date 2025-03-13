package lab01;

public class IngressoSocial extends Ingresso{
    @Override
    public double getPreco() {
        return (evento.getPrecoIngresso())/3;
    }
}
