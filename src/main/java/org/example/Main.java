package org.example;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {

        System.out.println("Este é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;

        double notaDoFilme = 8.1;

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);

        // programa que converta uma temperatura em graus Celsius para Fahrenheit

        double celsius = 35.0;
        double temperatura = (celsius * 1.8) + 32;
        System.out.println(temperatura);

        int primeiraNota = 7;
        double segundaNota = 8.0;
        int media = (primeiraNota + (int)segundaNota) / 2;
        System.out.println(media);

        char caractere = 'a';
        String palavra = "palavra";
        System.out.printf("%s %s é palavra%n", caractere, palavra);

        double precoProduto = 10.0;
        int quantidade = 10;
        double precoFinal = precoProduto * quantidade;
        System.out.println("O preço final é " + precoFinal);

        double valorEmDolares = 5.00;
        double real = 4.94;
        double conversao = valorEmDolares * real;
        System.out.println(conversao);

        double precoOriginal = 10.0;
        double percentualDesconto = 50;
        double precoDesconto = precoOriginal - (precoOriginal * percentualDesconto * ((double) 1 /100));
        System.out.println(precoDesconto);

    }
}