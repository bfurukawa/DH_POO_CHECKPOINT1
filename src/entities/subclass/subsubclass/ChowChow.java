package entities.subclass.subsubclass;

import entities.Cliente;
import entities.subclass.Cachorro;

public class ChowChow extends Cachorro {

    public ChowChow(int id, Cliente dono, String nome, int idade, boolean gostaDaVet) {
        super(id, dono, nome, idade, gostaDaVet);
    }

    @Override
    public void comer(){
        System.out.println("Coloca Comida pro ChowChow.");
    }
}
