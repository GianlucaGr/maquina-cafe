package ar.edu.unahur.obj2.command.decorator;

public class Azucar extends DecoradorCafe{
    private Double adicional;
    public Azucar(IDecorable cafe, Double adicional) {
        super(cafe);
        this.adicional = adicional;
    }

    @Override
    public String display() {
        return cafe.display() + " - " + "Azucar";
    }

    @Override
    public Double precio() {
        return super.precio() + adicional;
    }
}
