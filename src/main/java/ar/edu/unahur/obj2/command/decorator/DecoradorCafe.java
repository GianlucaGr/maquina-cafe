package ar.edu.unahur.obj2.command.decorator;

public class DecoradorCafe implements IDecorable{
    protected IDecorable cafe;
    public DecoradorCafe(IDecorable cafe) {
        this.cafe = cafe;
    }

    @Override
    public Double precio() {
        return cafe.precio();
    }

    @Override
    public String display() {
        return cafe.display();
    }

}
