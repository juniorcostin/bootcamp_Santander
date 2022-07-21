package logica_condicional;

public class if_switch {
    public static void main(String[] args){
        ifFlecha();
        switchDiaSemana();
        swithNumero();
    }
    private static void ifFlecha() {
        int mes = 07;
        if (mes == 01) {
            System.out.println("Janeiro");
        } else if (mes == 02) {
            System.out.println("Fevereiro");
        } else if (mes == 03) {
            System.out.println("Março");
        } else if (mes == 04) {
            System.out.println("Abril");
        } else if (mes == 05) {
            System.out.println("Maio");
        } else if (mes == 06) {
            System.out.println("Junho");
        } else if (mes == 07) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }

        if (mes == 01 || mes == 07 || mes == 12) {
            System.out.println("Férias");
        }
    }
    private static void switchDiaSemana() {
        String diaSemana = "segunda-feira";
        switch (diaSemana) {
            case "domingo":
                System.out.println("01");
                break;
            case "segunda-feira":
                System.out.println("02");
                break;
            case "terça-feira":
                System.out.println("03");
                break;
            case "quarta-feira":
                System.out.println("04");
                break;
            case "quinta-feira":
                System.out.println("05");
                break;
            case "sexta-feira":
                System.out.println("06");
                break;
            case "sabado":
                System.out.println("07");
                break;
        }
    }
    private static void swithNumero() {
        int numero = 7;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }
}
