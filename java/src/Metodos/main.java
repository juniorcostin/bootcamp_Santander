package Metodos;

public class main {
    public static void main(String[] args){
        System.out.println("Exercício calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        System.out.println("Exercicio Mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        System.out.println("Exercicio Empréstimo");
        emprestimo.calcular(4000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1500, emprestimo.getTresParcelas());
        emprestimo.calcular(4000, 2);
        emprestimo.calcular(1500, 3);
        emprestimo.calcular(1500, 5);
    }
}
