package classes;

import interfaces.GuitarBase;
import interfaces.GuitarSolo;

public class Guitarrista extends Musico implements GuitarBase, GuitarSolo{
    @Override
    public void tocar()
    {
        System.out.println("Guitarra");
    }

    @Override
    public void solar()
    {
        System.out.println("Modo grego Dórico");
    }

    @Override
    public void harmonizar()
    {
        System.out.println("Progressão II-V-I");
    }
}
