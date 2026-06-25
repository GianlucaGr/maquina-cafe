package ar.edu.unahur.obj2.command.command;

import ar.edu.unahur.obj2.command.MaquinaCafe;
import ar.edu.unahur.obj2.command.decorator.IDecorable;

public class AgregarLecheCommand implements Ejecutable{
    private MaquinaCafe maquina;
    private IDecorable cafeAnterior;

    public AgregarLecheCommand(MaquinaCafe maquina) {
        this.maquina = maquina;
    }

    @Override
    public void executable() {
        cafeAnterior = maquina.getCafe();
        maquina.agregarLeche();
    }

    @Override
    public void undo() {
        maquina.setCafe(cafeAnterior);
    }

}