//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Numeros fornecidos: "+a+" e "+b+".");
        if (a>b) // Comando análogo ao da linguagem C.
            System.out.println("O maior eh "+a+".");
        else
            System.out.println("O maior eh "+b+".");
        }
    }
