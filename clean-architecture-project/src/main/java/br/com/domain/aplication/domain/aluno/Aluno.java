package br.com.domain.aplication.domain.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private String name;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(final String ddd, final String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
}
