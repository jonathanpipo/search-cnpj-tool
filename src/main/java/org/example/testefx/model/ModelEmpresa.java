package org.example.testefx.model;

public class ModelEmpresa {
    private String campo;
    private String valor;

    public ModelEmpresa(String campo, String valor) {
        this.campo = campo;
        this.valor = valor;
    }

    public String getCampo() {
        return campo;
    }

    public String getValor() {
        return valor;
    }
}

