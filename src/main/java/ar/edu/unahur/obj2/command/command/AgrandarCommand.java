package ar.edu.unahur.obj2.command.command;

import ar.edu.unahur.obj2.command.MaquinaCafe;
import ar.edu.unahur.obj2.command.decorator.IDecorable;

public class AgrandarCommand implements Ejecutable{
    private MaquinaCafe maquina;
    private IDecorable cafeAnterior;

    public AgrandarCommand(MaquinaCafe maquina) {
        this.maquina = maquina;
    }

    @Override
    public void executable() {
        cafeAnterior = maquina.getCafe();
        maquina.agrandarCafe();
    }

    @Override
    public void undo() {
        maquina.setCafe(cafeAnterior);
    }

}
