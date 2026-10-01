// Autor: Caio Moreira Cancela
package ControleDeClientes;
import javax.swing.JOptionPane;


public class PanelCadastroPessoas extends javax.swing.JPanel {
    // Atributo que salva o objeto que foi o responsavel por instanciar o FormCadastroPessoas
    private FormPrincipal formPrincipal;
    
    // Metodo constrututor que inicia a aplicação atraves do metodo initComponents();
    public PanelCadastroPessoas() {
        initComponents();
    }
   // Inicializa o formulário de cadastro e armazena a referência da tela principal que abriu esta janela.
    public PanelCadastroPessoas(FormPrincipal form){
        this.formPrincipal = form;
        initComponents();
    }

    //Usado para assim que clicar em Cadastro de pessoas ele limpa os campos e seta o foco
    //no input de nome
    public void prepararNovoCadastro() {
        limparCampos();
        Imp_Nome.requestFocusInWindow();
    }
    // Metodo usado para limpar o formulario dos campos Nome,Idade,CPF e Tipo
    private void limparCampos() {
        Imp_Nome.setText("");
        Imp_Idade.setText("");
        Imp_CPF.setText("");
        Bx_Tipo.setSelectedIndex(0);
    }
    // metodo que retorna o tipo, se e Cliente ou Fornecedor
    public String getBx_Tipo() {
        return Bx_Tipo.getSelectedItem().toString();
    }
    // metodo que retorna o CPF
    public String getImp_CPF() {
        return Imp_CPF.getText();
    }
    
    // metodo que retorna a idade
    public String getImp_Idade() {
        return Imp_Idade.getText();
    }

    // metodo que retorna o nome
    public String getImp_Nome() {
        return Imp_Nome.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imp_Nome = new javax.swing.JTextField();
        Lbl_Nome = new javax.swing.JLabel();
        Lbl_Nome1 = new javax.swing.JLabel();
        Imp_Idade = new javax.swing.JTextField();
        Imp_CPF = new javax.swing.JTextField();
        Lbl_CPF = new javax.swing.JLabel();
        Lbl_Tipo = new javax.swing.JLabel();
        Bx_Tipo = new javax.swing.JComboBox<>();
        Btn_Cadastrar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));

        Lbl_Nome.setText("Nome: ");

        Lbl_Nome1.setText("Idade: ");

        Lbl_CPF.setText("CPF");
        Lbl_CPF.setToolTipText("");

        Lbl_Tipo.setText("Tipo:");
        Lbl_Tipo.setToolTipText("");

        Bx_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Fornecedor" }));

        Btn_Cadastrar.setText("SALVAR");
        Btn_Cadastrar.addActionListener(this::Btn_CadastrarActionPerformed);

        Btn_Cancelar.setText("CANCELAR");
        Btn_Cancelar.addActionListener(this::Btn_CancelarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 105, 79));
        jLabel1.setText("CADASTRO DE PESSOAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Nome)
                    .addComponent(Lbl_Nome1)
                    .addComponent(Lbl_CPF)
                    .addComponent(Lbl_Tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(Btn_Cancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Imp_CPF)
                        .addComponent(Imp_Idade)
                        .addComponent(Imp_Nome)
                        .addComponent(Bx_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Nome)
                    .addComponent(Imp_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imp_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Nome1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imp_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_CPF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Tipo)
                    .addComponent(Bx_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Cadastrar)
                    .addComponent(Btn_Cancelar))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Botão usado para chamar o JOptionPane para conferencia dos dados cadastrados e depois limpar os dados
    // e voltar para o menu principal.
    private void Btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CadastrarActionPerformed
        String Texto = "Nome: " + getImp_Nome() +
        "\nIdade: " + getImp_Idade() +
        "\nCPF: " + getImp_CPF() +
        "\nTipo: " + getBx_Tipo();
        JOptionPane.showMessageDialog(this,Texto);
        limparCampos();
        if (formPrincipal != null) {
            formPrincipal.mostrarPainelInicial();
        }
    }//GEN-LAST:event_Btn_CadastrarActionPerformed

    //Botão usado para cancelar a inserção de dados e voltar para o form Principal,usando limpar
    //dados para limpar os campos de imput
    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        limparCampos();
        if (formPrincipal != null) {
            formPrincipal.mostrarPainelInicial();
        }
    }//GEN-LAST:event_Btn_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cadastrar;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JComboBox<String> Bx_Tipo;
    private javax.swing.JTextField Imp_CPF;
    private javax.swing.JTextField Imp_Idade;
    private javax.swing.JTextField Imp_Nome;
    private javax.swing.JLabel Lbl_CPF;
    private javax.swing.JLabel Lbl_Nome;
    private javax.swing.JLabel Lbl_Nome1;
    private javax.swing.JLabel Lbl_Tipo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
