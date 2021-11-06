package br.com.domain.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Terceirizado {
    /*
     * A classe Terceirizado não precisa dos métodos de Funcionário (promover, reajustarSalario, etc.),
     *  apenas alguns atributos da classe são semelhantes.
     * Usando Composição para evitar usar um extends de Funcionários, pois nesse caso fere o Liskov Substitution Principle.
     */
    private DadosPessoais dadosPessoais;
    private String nomeEmpresa;

    public Terceirizado(final String nome, final String cpf, final Cargo cargo, final BigDecimal aumento, final LocalDate data) {

    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
