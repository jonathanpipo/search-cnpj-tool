package org.example.testefx.entities;

import com.google.gson.annotations.SerializedName;

public class Socio {
        
    @SerializedName("cpf_cnpj_socio")
    private String cpfCnpjSocio;
    private String nome;
    private String tipo;
    private String dataEntrada;

    @SerializedName("cpf_representante_legal")
    private String cpfRepresentanteLegal;

    private String nomeRepresentante;
    private String faixaEtaria;
    private String atualizadoEm;
    private String paisId;
    private Qualificacao qualificacaoSocio;
    private String qualificacaoRepresentante;

    // Getters and Setters


    public String getCpfCnpjSocio() {
        return cpfCnpjSocio;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getCpfRepresentanteLegal() {
        return cpfRepresentanteLegal;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getAtualizadoEm() {
        return atualizadoEm;
    }

    public String getPaisId() {
        return paisId;
    }

    public Qualificacao getQualificacaoSocio() {
        return qualificacaoSocio;
    }

    public String getQualificacaoRepresentante() {
        return qualificacaoRepresentante;
    }
}
