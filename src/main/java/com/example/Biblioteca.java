package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if (livros.size() >= MAX_LIVROS) {
            return false;
        }
        
        for (Livro l : livros){
            if(livro.getTitulo().equals(livro.getTitulo())){
                return false;
            }
        }
        
        return livros.add(livro);
    }

    public boolean removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                livros.remove(i);
                return true;
            }
        }
        
        return false;
    }
    
    public void listarLivros() {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println(i + " - " + livro.getTitulo() +
                " escrito por " + livro.getAutor() +
                " no ano " + livro.getAno()
            );
        }
    }
}