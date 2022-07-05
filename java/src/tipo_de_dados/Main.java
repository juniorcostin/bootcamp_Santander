package tipo_de_dados;

public class Main {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; Está recebendo um dado maior do que o Short pode suportar

        //int i1 = -10000000000; Está abaixo do valor negativo que o int pode suportar
        int i2 = 28500;

        long l1 = 10000000000000000L;
        long l2 = 2890983219843298523L;

        //float f1 = 4.5; Para float é necessário inserir o F no fim, senão é um double
        float f2 = 18.68F;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'W';
        //char c2 = 'Tw'; Char só recebe apenas um caractere
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";

        String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
