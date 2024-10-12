package org.example.testefx.entities;

import com.google.gson.annotations.SerializedName;

public class Empresa {
        @SerializedName("cnpj_raiz")
        private String cnpjRaiz;

        @SerializedName("razao_social")
        private String razaoSocial;

        @SerializedName("atualizado_em")
        private String atualizadoEm;

        @SerializedName("capital_social")
        private Double capitalSocial;

        @SerializedName("porte")
        private Porte porte;

        @SerializedName("estabelecimento")
        private Estabelecimento estabelecimento;

        @SerializedName("simples")
        private Simples simples;

        @SerializedName("natureza_juridica")
        private NaturezaJuridica naturezaJuridica;

        public Double getCapitalSocial() {
                return capitalSocial;
        }
        public String getCnpjRaiz() {
                return cnpjRaiz;
        }
        public String getRazaoSocial() {
                return razaoSocial;
        }
        public String getAtualizadoEm() {
                return atualizadoEm;
        }
        public Porte getPorte() {
                return porte;
        }
        public String getDescricaoPorte() {
                if (porte != null) {
                        return porte.getDescricao();
                }
                return null;
        }
        public String getCnpj() {
                if (estabelecimento != null) {
                        return estabelecimento.getCnpj();
                }
                return null;
        }
        public String getNomeFantasia() {
                if (estabelecimento != null) {
                        return estabelecimento.getNomeFantasia();
                }
                return null;
        }
        public String getDataInicioAtividade() {
                if (estabelecimento != null) {
                        return estabelecimento.getDataInicioAtividade();
                }
                return null;
        }
        public String getTipo() {
                if (estabelecimento != null) {
                        return estabelecimento.getTipo();
                }
                return null;
        }
        public String getSituacaoCadastral() {
                if (estabelecimento != null) {
                        return estabelecimento.getSituacaoCadastral();
                }
                return null;
        }
        public String getMei() {
                if (simples != null) {
                        return simples.getMei();
                }
                return null;
        }

}