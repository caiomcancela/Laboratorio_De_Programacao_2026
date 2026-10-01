//Autor: Caio Moreira Cancela
package ControleDeClientes;

public class Principal {
    // Metodo Main da aplicação que inicia o primeiro formulario FormPrincipal.java e deixa ele visivel
    // para o Usuario.
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }
}
