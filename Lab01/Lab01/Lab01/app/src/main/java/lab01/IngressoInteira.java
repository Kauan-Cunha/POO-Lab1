package lab01;

public class IngressoInteira extends Ingresso{
    @Override
    public double getPreco() {
        return evento.getPrecoIngresso();
    }
}
