/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Part1 {

    
    public static void main(String[] args) {
        
        /* Declaração de variáveis */
        //Menu > Opção 4 > Faixa Etaria
        double mediaGeral = 0;
        double mediaMasc = 0;
        double contadorMasc = 0;
        int contadorFemi = 0;
        int mediaFemi = 0;

        Scanner in = new Scanner(System.in); // Scanner

        int opcoes;
        do {
            System.out.println(" 1 Soma");
            System.out.println(" 2 Subtração");
            System.out.println(" 3 Divisão");
            System.out.println(" 4 Faixa etária");
            System.out.println(" 5 Numeros primos");
            System.out.println(" 6 Mundaça de Base");
            System.out.println(" 7 Sair");
            opcoes = in.nextInt();

            switch (opcoes) {
                //  Soma
                case 1:
                    System.out.println(" Soma ");
                    System.out.println(" Informe o primeiro número: ");  // Entrada de Dados
                    int num1 = in.nextInt();
                    System.out.println(" Informe o segundo número: "); // Entrada de Dados
                    int num2 = in.nextInt();
                    System.out.println(" Resultado: " + (num1 + num2));  //Soma

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao Menu inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                //  Subtração
                case 2:
                    System.out.println(" Subtração ");
                    System.out.println(" Informe o primeiro número: "); // Entrada de dados
                    int num3 = in.nextInt();
                    System.out.println(" Informe o segundo número: ");  //Entrada de dados
                    int num4 = in.nextInt();
                    System.out.println(" Resultado:" + (num3 - num4));  // Subtração

                    /* Opção para retornar ao menu principal */
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao Menu inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 3:
                    //  Divisão
                    System.out.println("  Divisão ");
                    System.out.println(" Informe o primeiro número: "); // Entrada de dados
                    int num5 = in.nextInt();
                    System.out.println(" Informe o segundo número: "); // Entrada de dados
                    int num6 = in.nextInt();
                    System.out.println(" Resultado:" + (num5 / num6)); // Divisão

                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 4:
                    //  Faixa etaria
                    System.out.println(" Faixa etária ");
                    double mediamsc = 0;
                    double mediafem = 0;
                    System.out.println(" Informe a quantidade de pessoas");
                    int numeropessoas = in.nextInt();
                    for (int i = 0; i < numeropessoas; i++) {
                        System.out.println(" Qual sua idade ");
                        int idade = in.nextInt();
                        System.out.println(" Qual seu sexo: (1) Masculino (2)Feminino ");
                        int sexo = in.nextInt();

                        mediaGeral = mediaGeral + idade;  // Somar todas as idades digitadas
                        if (sexo == 1) {

                            contadorMasc++;

                            mediaMasc = mediaMasc + idade;  // Soma das idades masculinas
                            mediamsc = mediaMasc / contadorMasc;  // Media da idades masculinas

                        } else if (sexo == 2) {

                            contadorFemi++;

                            mediaFemi = mediaFemi + idade;  // Soma das idades femininas
                            mediafem = mediaFemi / contadorFemi; // Media das idades femininas

                        }

                    }
                    //Saida de dados
                    System.out.println(" Media Geral: " + mediaGeral / numeropessoas);
                    System.out.println(" Media Masculina: " + mediamsc);
                    System.out.println(" Media Feminina: " + mediafem);

                    // Opção para voltar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção para voltar ao menu
                    break;

                case 5:
                    // numeros primos
                    // variáveis utilizadas na opção 5
                    int soma = 0;

                    // Entrada de dados
                    System.out.println("Digite um número: ");
                    int num = in.nextInt();

                    for (int j = 1; j <= num; j++) {  // Número que irá aumentar para ser testado
                        int contador = 0;
                        for (int i = 1; i <= num; i++) { // FOR QUE IRÁ AUMENTAR para testar o Numero
                            if (j % i == 0) {
                                contador++;  // Conta quantas divisoes tiveram resto 0
                            }
                        }
                        //Numeros primos só tem 2 divisões
                        if (contador == 2) {
                            soma = soma + j;  //Soma dos primos
                        }
                    }
                    //Saída de Dados
                    System.out.println("A soma dos números primos de 1 até "+num+" é igual a: "+soma);

                    // Opção para voltar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

                case 6:
                    //  Mundança de base
                    System.out.println(" Mundança de base ");
                    System.out.println(" Digite [1] para informar um número binário e [2] para informar um número decimal: ");
                    int binariodecimal = in.nextInt();  //Opcao para o menu (binario ou decimal
            {
                int binariodececimal = 0;
                switch (binariodececimal) {
                    case 1:
                        System.out.println(" Digite o valor em binário ");
                        String entrada = in.next();
                        int potencia = 0;
                        int decimal = 0;
                        
                        for (int i = entrada.length() - 1; i >= 0; i--) {
                            decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                            potencia++;
                            
                        }
                        System.out.println(" O número decimal é: " + decimal);
                        break;
                        
                    case 2:
                        int dec,
                                mod;
                        String bin = "b";
                        System.out.println(" Digite um número em decimal ");
                        dec = in.nextInt();
                        
                        while (dec > 0) {
                            mod = (dec % 2);
                            bin = mod + bin;
                            dec = dec / 2;
                        }
                        System.out.println(" O número binário é " + bin);
                        
                }
            }
                    // Opção para retornar ao menu principal
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = in.nextInt();
                        if (opcoes == 0) {
                            opcoes = 0;
                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    // Fim da opção de retorno ao menu
                    break;

            }
            if(opcoes>7){

                while(opcoes>7){
                    System.out.println("Digite [7] para sair ou [0] para voltar ao menu : ");
                    opcoes = in.nextInt();

                    if(opcoes == 7){
                        opcoes = 7;
                    } else
                    if(opcoes == 0){
                        opcoes = 0;
                    }
                }









            }


        } while (opcoes == 0);

        System.out.println("Saindo!");

    }
}

  