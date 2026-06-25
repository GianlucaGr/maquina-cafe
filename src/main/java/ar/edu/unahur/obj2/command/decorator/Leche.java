package ar.edu.unahur.obj2.command.decorator;

public class Leche extends DecoradorCafe{
    private Double adicional;
    public Leche(IDecorable cafe, Double adicional) {
        super(cafe);
        this.adicional = adicional;
    }

    @Override
    public String display() {
        return cafe.display() + " - " + "Leche";
    }

    @Override
    public Double precio() {
        return super.precio() + adicional;
    }
}
