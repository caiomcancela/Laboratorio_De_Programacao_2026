package br.com.cadastro;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FormularioController {

    @FXML private TextField cpfField;
    @FXML private TextField nomeField;
    @FXML private TextField enderecoField;
    @FXML private ComboBox<String> estadoCombo;
    @FXML private ComboBox<String> cargoCombo;
    @FXML private Button imprimirButton;

    @FXML
    private void initialize() {
        ObservableList<String> estados = FXCollections.observableArrayList(
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
                "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão",
                "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
                "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins");
        ObservableList<String> cargos = FXCollections.observableArrayList(
                "Administrador(a)", "Analista de Banco de Dados", "Analista de Business Intelligence",
                "Analista de Dados", "Analista de Infraestrutura", "Analista de Negócios",
                "Analista de QA", "Analista de Requisitos", "Analista de Segurança da Informação",
                "Analista de Sistemas", "Analista de SOC", "Analista de Suporte",
                "Analista de Testes", "Arquiteto(a) de Cloud", "Arquiteto(a) de Software",
                "Assistente Administrativo", "Cientista de Dados", "Coordenador(a) de TI",
                "Desenvolvedor(a) Back-end", "Desenvolvedor(a) Front-end", "Desenvolvedor(a) Full Stack",
                "Desenvolvedor(a) Java", "Desenvolvedor(a) Mobile", "Desenvolvedor(a) .NET",
                "Desenvolvedor(a) Python", "Diretor(a) de Informação - CIO", "Diretor(a) de Tecnologia - CTO",
                "Engenheiro(a) de Banco de Dados", "Engenheiro(a) de Cloud", "Engenheiro(a) de Dados",
                "Engenheiro(a) de Infraestrutura", "Engenheiro(a) de Machine Learning", "Engenheiro(a) de QA",
                "Engenheiro(a) de Redes", "Engenheiro(a) de Segurança", "Engenheiro(a) de Software",
                "Especialista em Cibersegurança", "Especialista em Inteligência Artificial", "Estagiário(a) de TI",
                "Gerente de Projetos de TI", "Gerente de Segurança da Informação - CISO", "Gerente de TI",
                "Pentester", "Product Manager", "Product Owner",
                "Scrum Master", "Técnico(a) de Informática", "Técnico(a) de Suporte",
                "Administrador(a) de Redes", "Administrador(a) de Banco de Dados"
        );

        estadoCombo.setItems(estados);
        cargoCombo.setItems(cargos);

        imprimirButton.setOnAction(event -> {
            String dados = "Cpf: " + valor(cpfField.getText()) + "\n"
                    + "Nome: " + valor(nomeField.getText()) + "\n"
                    + "Endereço: " + valor(enderecoField.getText()) + "\n"
                    + "Estado: " + valor(estadoCombo.getValue()) + "\n"
                    + "Cargo: " + valor(cargoCombo.getValue());

            JOptionPane.showMessageDialog(null, dados, "Dados do cadastro", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private static String valor(String texto) {
        return texto == null || texto.isBlank() ? "Não informado" : texto;
    }
}
