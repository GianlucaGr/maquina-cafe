package ar.edu.unahur.obj2.command.command;

import ar.edu.unahur.obj2.command.MaquinaCafe;
import ar.edu.unahur.obj2.command.decorator.IDecorable;

public class AgregarAzucarCommand implements Ejecutable{
    private MaquinaCafe maquina;
    private IDecorable cafeAnterior;

    public AgregarAzucarCommand(MaquinaCafe maquina) {
        this.maquina = maquina;
    }

    @Override
    public void executable() {
        cafeAnterior = maquina.getCafe();
        maquina.agregarAzucar();
    }

    @Override
    public void undo() {
        maquina.setCafe(cafeAnterior);
    }

}
