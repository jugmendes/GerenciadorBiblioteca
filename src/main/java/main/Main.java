package main;

import biblioteca.Biblioteca;
import model.Livro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("A Hipótese do Amor", "Ali Hazelwood", 2021));
        biblioteca.adicionarLivro(new Livro("É Assim Que Acaba", "Colleen Hoover", 2016));
        biblioteca.adicionarLivro(new Livro("Verity", "Colleen Hoover", 2018));
        biblioteca.adicionarLivro(new Livro("Os Sete Maridos de Evelyn Hugo", "Taylor Jenkins Reid", 2017));
        biblioteca.adicionarLivro(new Livro("O Homem de Giz", "C.J. Tudor", 2018));

        System.out.println("Buscar livro por título: " + biblioteca.buscarPorTitulo("Verity"));

        System.out.println("Listar livros ordenados por ano:");
        biblioteca.listarOrdenadoAno().forEach(System.out::println);

        System.out.println("Contagem de livros por autor:");
        biblioteca.contarLivrosPorAutor().forEach((autor, qtd) -> System.out.println(autor + ": " + qtd));

        System.out.println("Listar livros únicos:");
        biblioteca.listarLivrosUnicos().forEach(System.out::println);

        System.out.println("Listar livros publicados antes de 2018:");
        biblioteca.listarLivrosAntesDe(1950).forEach(System.out::println);
    }
}