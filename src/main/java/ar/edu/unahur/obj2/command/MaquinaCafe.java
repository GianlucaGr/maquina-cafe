package ar.edu.unahur.obj2.command;
import ar.edu.unahur.obj2.command.decorator.AgrandarCafe;
import ar.edu.unahur.obj2.command.decorator.Azucar;
import ar.edu.unahur.obj2.command.decorator.Cafe;
import ar.edu.unahur.obj2.command.decorator.IDecorable;
import ar.edu.unahur.obj2.command.decorator.Leche;

public class MaquinaCafe {
    private IDecorable cafe = new Cafe(2000.0);
    private static MaquinaCafe instancia = new MaquinaCafe();

    private MaquinaCafe(){}
    public static MaquinaCafe getInstancia(){
        return instancia;
    }

    public void agregarLeche(){
        cafe = new Leche(cafe,500.0);
    }

    public void agregarAzucar(){
        cafe = new Azucar(cafe, 200.0);
    }

    public void agrandarCafe(){
        cafe = new AgrandarCafe(cafe, 1000.0);
    }

    public IDecorable getCafe(){
        return cafe;
    }

    public void setCafe(IDecorable cafe){
        this.cafe = cafe; 
    }
}
