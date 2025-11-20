package org.exercicio.four;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String,String> dicionario = new HashMap<>();
        String palavraIngles;
        String palavraPortugues;
        String opcao = "";

        while (!opcao.equals("3")){
            Scanner escolha = new Scanner(System.in);
            System.out.println("Digite uma das opções do menu: ");
            System.out.println("1- Digite as palavras em inglês e em portugues para tradução.");
            System.out.println("2- Digite a palavra em inglês que deseja procurar no seu dicionario para traduzir.");
            System.out.println("3- Sair do Programa.");
            opcao = escolha.nextLine();

            if (opcao.matches(".*[0-9].*")){
                switch (opcao){
                    case "1":
                        Scanner input = new Scanner(System.in);
                        System.out.println("Digite sua palavra em inglês: ");
                        palavraIngles = input.nextLine().toLowerCase();

                        Scanner entrada = new Scanner(System.in);
                        System.out.println("Digite sua palavra em portugues: ");
                        palavraPortugues = entrada.nextLine().toLowerCase();

                        if(palavraIngles.matches(".*[a-z].*") &&
                                palavraPortugues.matches(".*[a-záéíóúãõâêôç].*")){
                            dicionario.put(palavraIngles, palavraPortugues);
                        }else{
                            System.out.println("Digite corretamente as palavras");
                            System.exit(0);
                        }
                        break;
                    case "2":
                        Scanner procura = new Scanner(System.in);
                        System.out.println("Digite uma palavra em inglês para traduzir: ");
                        System.out.println(dicionario);
                        palavraIngles = procura.nextLine().toLowerCase();

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