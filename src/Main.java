import classes.Guitarrista;
import interfaces.GuitarBase;
import interfaces.GuitarSolo;

public class Main {
    public static void funcao(GuitarSolo guitarrista)
    {
        guitarrista.solar();
    }
    public static void main(String[] args) {
        GuitarSolo guitarrista = new Guitarrista();

        funcao(guitarrista);
    }
}