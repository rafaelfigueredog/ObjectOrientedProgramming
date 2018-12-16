package br.edu.ifpb;

public class LivroNaoEncontradoException extends LivrariaException {

    private static final long SerialVersionUID = 1L;

    public LivroNaoEncontradoException(Long id) {
        super("Livro não encontrado: " + id);
    }
}
