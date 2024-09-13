public class retangulo {
        private double altura, largura;
        public retangulo(double a,double l) {setLado(a,l);} // Construtor.
        protected void setLado(double a, double l){ // Setter (modificador).
            if (a>=0 && l>=0){
                altura = a;
                largura = l;
            } else {
                System.out.println("Programa encerrado: raio<0!");
                System.exit(1);
            }
        }
        public double getAltura() {return altura;} // Getter (acessor).
        public double getLargura() {return largura;} // Getter (acessor).
        public double retArea() {return altura*largura;}
        public double retPerimetro() {return (2*altura)+(2*largura);}
    }


