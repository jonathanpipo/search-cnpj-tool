package org.example.testefx.service;

import org.example.testefx.utilities.HttpRequest;

public class CnpjApiClient {
    public static String fetchCnpjData(String inputCnpj) throws Exception {

        final String urlApiCnpj="https://publica.cnpj.ws/cnpj/" + inputCnpj;

        try {
            return HttpRequest.sendGetRequestCnpjApi(urlApiCnpj);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fazer requisicao!");
        }
    }
}
