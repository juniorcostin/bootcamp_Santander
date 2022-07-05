package variaveis;

public class Main {
    public static void main(String[] args) {
        int i;
        //int i; Esta variável está dendo duplicada
        int I;
        //int 1a; Variáveis não podem iniciar com números
        int _1a; //Esta variável é valida, mas não segue boas práticas
        int $aq;

        //Deve-se prover os valores iniciais as variáveis
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;


        final int j = 10; // final significa que é uma variável constante
        //j = 15; está tentando mudar o valor de uma constante, portanto não será possível
        int asrn24678m;
        //int asrn246 78md; Não é possível criar variáveis com espaço
        int asrn246_78md; //Variável correta porém fere as boas práticas

        asrn24678m = 100;
        asrn246_78md = 10;

        int quatidadedeProduto = 50;
        int QuantidadedeProduto; //Variável está correta, porém fere as boas práticas iniciando com uma letra maiuscula
        final int NUMERO_TENTATIVAS = 5; // Variável correta, sempre em constantes ultilizar letras maiusculas
        final int numeroTentativas = 5; // variavel correta porém fere as boas práticas
        int QUANTIDADE_OPCOES = 25; //variavel correta porém fere as boas práticas
        int qtdProd; //variavel correta porém fere as boas práticas


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678m);
        System.out.println(asrn246_78md);

        System.out.println(quatidadedeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
