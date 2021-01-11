package br.com.lucaspestana.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

    void valorAlterado(String novoValor);
}
