package ar.edu.unahur.obj2.command.decorator;

public class AgrandarCafe extends DecoradorCafe{
    private Double adicional;
    public AgrandarCafe(IDecorable cafe, Double adicional) {
        super(cafe);
        this.adicional = adicional;
    }

    @Override
    public String display() {
        return cafe.display() + " - " + "XL";
    }

    @Override
    public Double precio() {
        return super.precio() + adicional;
    }
}
