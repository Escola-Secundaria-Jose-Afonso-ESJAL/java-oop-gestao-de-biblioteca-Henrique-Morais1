package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro l3 = new Livro("1984", "George Orwell", 1949);
        
        ArrayList<Livro> livros = new ArrayList();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        
        Livro l4 = new Livro("Duna", "Frank Herbert", 1965);
        livros.add(l4);
        
        biblioteca1.removerLivro("1984");
        
        biblioteca1.listarLivros();
    }
}
