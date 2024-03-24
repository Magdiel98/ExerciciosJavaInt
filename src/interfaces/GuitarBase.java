package interfaces;

public interface GuitarBase {
    default void harmonizar()
    {
        System.out.println("Progressão I-IV-V-I");
    }

    static void emitirProgressao(String cadencia)
    {
        System.out.println(cadencia);
    }
}
