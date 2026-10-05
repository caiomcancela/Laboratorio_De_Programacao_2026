package br.com.cadastro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FormularioCadastro extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/com/cadastro/formulario.fxml"));
        Scene scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("/br/com/cadastro/estilo.css").toExternalForm());

        stage.setTitle("Formulário para cadastro de Pessoa");
        stage.setScene(scene);
        stage.setMinWidth(385);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
