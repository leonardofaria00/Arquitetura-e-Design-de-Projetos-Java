package br.com.domain.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Funcionario {
    /*
     * DadosPessoais foi criado para melhorar a Coesão e evitar ser estendida pela classe Terceirizado.
     * Composição implementado.
     */
    private final DadosPessoais dadosPessoais = new DadosPessoais();
    private LocalDate dataUltimoReajuste;

    public Funcionario(final String nome, final String cpf, final Cargo cargo, final BigDecimal salario, final LocalDate data) {
        this.dadosPessoais.setNome(nome);
        this.dadosPessoais.setCpf(cpf);
        this.dadosPessoais.setCargo(cargo);
        this.dadosPessoais.setSalario(salario);
        this.setDataUltimoReajuste(data);
    }

    public void atualizarSalario(final BigDecimal salarioReajustado) {
        this.dadosPessoais.setSalario(salarioReajustado);
        this.dataUltimoReajuste = LocalDate.now();
        save(this);
        System.out.println("Salário salvo.");
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void promover(final Cargo proximoCargo) {
        this.dadosPessoais.setCargo(proximoCargo);
        save(this);
        System.out.println("Promoção salva.");
    }

    private Funcionario getFuncionario(final String cpf) {
        //findFuncionarioByCPF(cpf);
        // parse implementation to domain
        this.dadosPessoais.setUuid(UUID.randomUUID());
        return this;
    }

    private Funcionario save(final Funcionario funcionario) {
        final Funcionario funcionario1 = getFuncionario(funcionario.dadosPessoais.getCpf());
        // parse implementation to infraestructure;
        // save in database;
        //parse implementation to domain
        return this;
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }
}
