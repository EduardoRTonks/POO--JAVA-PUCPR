public class Metodos {
    int soma(int a, int b){
        return a+b;
    }
    double fat(int n){
        double f=1;
        while(n>1) f*=n--;
        return f;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        //Metodos m= new Metodos();
        //System.out.println(a+" + "+b+" = "+m.soma(a,b));
        //System.out.format("%d! = %.0f. ",m.soma(a,b),m.fat(m.soma(a,b)));
        //int s=Mat.soma(a,b); // classe.método()
        //System.out.println(a+" + "+b+" = "+Mat.soma(a,b));
        System.out.format("Numeros Fornecidos: %d %d %d",a,b,c);
        System.out.format("\nMaior:.... %d",tresNum.maior(a,b,c));
        System.out.format("\nInter:.... %d",tresNum.intermediario(a,b,c));
        System.out.format("\nMenor:.... %d",tresNum.menor(a,b,c));








    }
}
