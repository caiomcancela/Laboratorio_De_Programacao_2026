
package formulariopessoa;

/**
 *
 * @author Aluno
 */
public class FormularioPessoa {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaForm().setVisible(true);
            }
        });
    }
    
}
