public class clienteRet {
    public static void main(String[] args) {
        retangulo r1 = new retangulo(2, 3); // Primeiro objeto circulo.
        retangulo r2 = new retangulo(3, 4); // Segundo objeto circulo.
        System.out.format("\nALTURA R1:  %.0f", r1.getAltura());
        System.out.format("\nLARGURA R1:  %.0f", r1.getLargura());
        System.out.format("\nPERIMETRO R1:  %.0f", r1.retPerimetro());
        System.out.format("\nAREA R1:  %.0f", r1.retArea());
        r1.setLado(3,4);
        System.out.format("\nALTURA R1:  %.0f", r1.getAltura());
        System.out.format("\nLARGURA R1:  %.0f", r1.getLargura());
        System.out.format("\nPERIMETRO R1:  %.0f", r1.retPerimetro());
        System.out.format("\nAREA R1:  %.0f", r1.retArea());
    }
}