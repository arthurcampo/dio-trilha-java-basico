public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        numero = numero + 2;
        System.out.println(numero);

        //negando expressoes booleanas
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        //realacionais (==;!;>;>=;<;<=)
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero um é igual a numero dois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero 1 é diferente de numero 2?" + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numero 1 é maior que numero 2?" + simNao);

        //Operedor logico (&& "E"; || "OU")
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições sao verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeiras");
        }
        System.out.println("fim");
    }
}
