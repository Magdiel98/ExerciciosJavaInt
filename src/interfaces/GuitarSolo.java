package interfaces;

public interface GuitarSolo {
    default void solar()
    {
        System.out.println("Modo grego Jônio");
    }

    static void emitirSolo(String escala)
    {
        System.out.println(escala);
    }
}
