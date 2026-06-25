package ar.edu.unahur.obj2.command.decorator;

public class Cafe implements IDecorable{
    private Double precioBase;
    
    public Cafe(Double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public Double precio() {
        return precioBase;
    }

    @Override
    public String display() {
        return "Cafe";
    }

}
