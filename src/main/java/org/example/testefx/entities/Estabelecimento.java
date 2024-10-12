package org.example.testefx.entities;

import com.google.gson.annotations.SerializedName;

public class Estabelecimento {
    @SerializedName("cnpj")
    private String cnpj;

    @SerializedName("nome_fantasia")
    private String nomeFantasia;

    @SerializedName("data_inicio_atividade")
    private String dataInicioAtividade;

    @SerializedName("tipo")
    private String tipo;

    @SerializedName("situacao_cadastral")
    private String situacaoCadastral;

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }


    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }
}
