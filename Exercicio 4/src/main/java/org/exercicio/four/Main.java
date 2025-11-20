package org.exercicio.four;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
* Mini dicionario de tradução
* author: Henrique Bernardo
* */

public class Main {
    public static void main(String[] args) {

        //Variaveis
        Map<String,String> dicionario = new HashMap<>();
        String palavraIngles;
        String palavraPortugues;
        String opcao = "";

        //loop para o usuario escolher a ação que ele preferir
        while (!opcao.equals("3")){
            //Input das opções do menu
            Scanner escolha = new Scanner(System.in);
            System.out.println("Digite uma das opções do menu: ");
            System.out.println("1- Digite as palavras em inglês e em portugues para tradução.");
            System.out.println("2- Digite a palavra em inglês que deseja procurar no seu dicionario para traduzir.");
            System.out.println("3- Sair do Programa.");
            opcao = escolha.nextLine();

            //Checa se tem só numero
            if (opcao.matches(".*[0-9].*")){
                //Checa qual das opções é
                switch (opcao){
                    case "1":
                        //Input para palavra em inglês
                        Scanner input = new Scanner(System.in);
                        System.out.println("Digite sua palavra em inglês: ");
                        palavraIngles = input.nextLine().toLowerCase();

                        //Input para palavra em português
                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Digite sua palavra em português: ");
                        palavraPortugues = entrada.nextLine().toLowerCase();

                        //Checa se tem letras minusculas e se tiver acento é palavra em português
                        if(palavraIngles.matches(".*[a-z].*") &&
                                palavraPortugues.matches(".*[a-záéíóúãõâêôç].*")){
                            dicionario.put(palavraIngles, palavraPortugues);
                        }else{
                            System.out.println("Digite corretamente as palavras");
                            System.exit(0);
                        }
                        break;
                    case "2":
                        //Input para palavra em inglês
                        Scanner procura = new Scanner(System.in);
                        System.out.println("Digite uma palavra em inglês para traduzir: ");
                        System.out.println(dicionario);
                        palavraIngles = procura.nextLine().toLowerCase();

                        //Checa se tem letras minusculas
                        if(palavraIngles.matches(".*[a-z].*")){
                            System.out.println(dicionario.get(palavraIngles));
                        }else{
                            System.out.println("Digite corretamente a palavra");
                            System.exit(0);
                        }
                        break;
                    case "3":
                        System.out.println("Finalizando programa.");
                        break;
                }
            }else{
                System.out.println("Digite apenas numeros");
                System.exit(0);
            }
        }
    }
}