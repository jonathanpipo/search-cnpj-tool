package org.example.testefx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.testefx.entities.Empresa;
import com.google.gson.Gson;
import org.example.testefx.model.ModelEmpresa;
import org.example.testefx.service.CnpjApiClient;

import java.util.ArrayList;
import java.util.List;

public class AppController {
    @FXML
    private Button btFetchCnpj;

    @FXML
    private TextField inputField;

    @FXML
    private TableView<ModelEmpresa> tableView;  // Alterado para ModelEmpresa

    @FXML
    private TableColumn<ModelEmpresa, String> columnCampo;  // Alterado para ModelEmpresa

    @FXML
    private TableColumn<ModelEmpresa, String> columnValor;  // Alterado para ModelEmpresa (valor é String)

    @FXML
    public void initialize() {
        columnCampo.setCellValueFactory(new PropertyValueFactory<>("campo"));
        columnValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
    }

    @FXML
    protected void handleSearchButton() throws Exception {
        String cnpj = inputField.getText();

        if (cnpj.isEmpty()) {
            System.out.println("CNPJ não pode estar vazio!");
            return;
        }

        // Chamada da API
        String jsonResponse = getCnpjDataFromApi(cnpj);

        // Gson para converter JSON em objeto Java
        Gson gson = new Gson();
        Empresa empresa = gson.fromJson(jsonResponse, Empresa.class);

        // Preencher a tabela com os dados da empresa
        preencherTabelaComDados(empresa);
    }

    private String getCnpjDataFromApi(String cnpj) throws Exception {
        return CnpjApiClient.fetchCnpjData(cnpj);
    }

    private void preencherTabelaComDados(Empresa empresa) {
        List<ModelEmpresa> infoList = new ArrayList<>();

        infoList.add(new ModelEmpresa("CNPJ Raiz", empresa.getCnpjRaiz()));
        infoList.add(new ModelEmpresa("Razão Social", empresa.getRazaoSocial()));
        infoList.add(new ModelEmpresa("Capital Social", empresa.getCapitalSocial() != null ? empresa.getCapitalSocial().toString() : ""));
        infoList.add(new ModelEmpresa("Porte", empresa.getDescricaoPorte()));
        infoList.add(new ModelEmpresa("CNPJ", empresa.getCnpj()));
        infoList.add(new ModelEmpresa("Nome Fantasia", empresa.getNomeFantasia()));
        infoList.add(new ModelEmpresa("Data Início Atividade", empresa.getDataInicioAtividade()));
        infoList.add(new ModelEmpresa("Tipo", empresa.getTipo()));
        infoList.add(new ModelEmpresa("Situação Cadastral", empresa.getSituacaoCadastral()));
        infoList.add(new ModelEmpresa("MEI", empresa.getMei()));

        // Preencha a TableView com os dados
        ObservableList<ModelEmpresa> observableList = FXCollections.observableArrayList(infoList);
        tableView.setItems(observableList);
    }
}
