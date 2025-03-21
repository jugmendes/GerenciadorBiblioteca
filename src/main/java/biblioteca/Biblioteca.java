package biblioteca;

import model.Livro;

import java.util.*;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro (Livro livro){
        livros.add(livro);
    }

    public Livro buscarPorTitulo(String titulo){
        return livros.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public List<Livro> listarOrdenadoAno(){
        return livros.stream()
                .sorted(Comparator.comparing(Livro::getAnoPublicacao))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> contarLivrosPorAutor() {
        return livros.stream()
                .collect(Collectors.groupingBy(Livro::getAutor, Collectors.summingInt(l -> 1)));
    }

    public Set<Livro> listarLivrosUnicos() {
        return new HashSet<>(livros);
    }

    public List<Livro> listarLivrosAntesDe(int ano) {
        return livros.stream()
                .filter(livro -> livro.getAnoPublicacao() < ano)
                .collect(Collectors.toList());
    }
}
