import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao jogo do adivinha");
        System.out.println("Responda através das dicas abaixo");
        System.out.println("Dica 1: É uma fruta");
        System.out.println("Dicas 2: A maioria delas estão na cor vermelha mas também existe na cor verde");
        System.out.println("Dicas 3: É bastante utilizada em saladas ");



        Scanner scan = new Scanner(System.in);

        String op;

        do {
            op = scan.nextLine();

            if(op.equals("Morango")) {
                System.out.println("Você errou! não existe morangos na cor verde");
            } else if (op.equals("Cereja")) {
                System.out.println("Você errou! Cereja não é bastante utilizada em saladas");
            } else if (op.equals("Manga")) {
                System.out.println("Você errou! Existem poucas mangas na cor vermelha");
            } else if(!op.equals("Tomate")){
                System.out.println("Tente novamente você vai conseguir");
            } else if(op.equals("")) {
                System.out.println("Dígite alguma resposta");
            } else if (op.equals("Tomate")) {
                System.out.println("Parabéns você acertou!");
                System.out.println("Muitas pessoas não conhece mas o tomate é uma fruta :)");
            }

        } while(!op.equals("Tomate"));

    }

 
}

