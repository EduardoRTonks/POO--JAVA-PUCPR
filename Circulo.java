class Circulo{
    private static double PI=Math.PI;
    private double raio;
    public Circulo(double r) {setRaio(r);} // Construtor.
    public void setRaio(double r){ // Setter (modificador).
        if (r>=0)
            raio=r;
        else {
            System.out.println("Programa encerrado: raio<0!");
            System.exit(1);
        }
    }
    public double getRaio() {return raio;} // Getter (acessor).
    public double area() {return PI*raio*raio;}
    public double perimetro() {return 2*PI*raio;}
}
