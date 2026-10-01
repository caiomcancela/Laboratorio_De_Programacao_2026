// Autor: Caio Moreira Cancela
package ControleDeClientes;

import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    private static final String TELA_INICIAL = "inicial";
    private static final String TELA_CADASTRO = "cadastro";

    private final java.awt.CardLayout cardLayout = new java.awt.CardLayout();
    private final javax.swing.JPanel painelTelas = new javax.swing.JPanel(cardLayout);
    private final PanelCadastroPessoas painelCadastro;

    // Inicializa os componentes e configura as telas da aplicação.
    public FormPrincipal() {
        initComponents();
        painelCadastro = new PanelCadastroPessoas(this);
        configurarTelas();
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    // Adiciona o painel inicial e o painel de cadastro ao CardLayout.
    private void configurarTelas() {
        painelTelas.add(Panel, TELA_INICIAL);
        painelTelas.add(painelCadastro, TELA_CADASTRO);
        setContentPane(painelTelas);
        mostrarPainelInicial();
    }

    // Exibe o painel de cadastro e limpa os campos.
    private void mostrarPainelCadastro() {
        cardLayout.show(painelTelas, TELA_CADASTRO);
        painelCadastro.prepararNovoCadastro();
    }

    // Retorna para o painel inicial.
    void mostrarPainelInicial() {
        cardLayout.show(painelTelas, TELA_INICIAL);
    }

    // Inicializa os componentes configurados no modo Design do NetBeans.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Lbl_Img = new javax.swing.JLabel();
        Lbl_Titulo = new javax.swing.JLabel();
        Mn_Principal = new javax.swing.JMenuBar();
        Mn_Arquivo = new javax.swing.JMenu();
        BtnMn_Novo = new javax.swing.JMenuItem();
        BtnMn_Sair = new javax.swing.JMenuItem();
        Mn_Relatorio = new javax.swing.JMenu();
        BtnMn_Clientes = new javax.swing.JMenuItem();
        BtnMn_Fornecedores = new javax.swing.JMenuItem();
        Mn_Sobre = new javax.swing.JMenu();
        MnBt_Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU, ITENS DE MENU, FONTES");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 102));

        Lbl_Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControleDeClientes/Img/images.png"))); // NOI18N

        Lbl_Titulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Lbl_Titulo.setForeground(new java.awt.Color(35, 105, 79));
        Lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Titulo.setText("CONTROLE DE CLIENTES");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(Lbl_Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Lbl_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Mn_Principal.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        Mn_Arquivo.setText("Arquivo");
        Mn_Arquivo.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        BtnMn_Novo.setText("Novo");
        BtnMn_Novo.addActionListener(this::BtnMn_NovoActionPerformed);
        Mn_Arquivo.add(BtnMn_Novo);

        BtnMn_Sair.setText("Sair");
        BtnMn_Sair.addActionListener(this::BtnMn_SairActionPerformed);
        Mn_Arquivo.add(BtnMn_Sair);

        Mn_Principal.add(Mn_Arquivo);

        Mn_Relatorio.setText("Relatório");
        Mn_Relatorio.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        BtnMn_Clientes.setText("Cliente");
        BtnMn_Clientes.addActionListener(this::BtnMn_ClientesActionPerformed);
        Mn_Relatorio.add(BtnMn_Clientes);

        BtnMn_Fornecedores.setText("Fornecedor");
        BtnMn_Fornecedores.addActionListener(this::BtnMn_FornecedoresActionPerformed);
        Mn_Relatorio.add(BtnMn_Fornecedores);

        Mn_Principal.add(Mn_Relatorio);

        Mn_Sobre.setText("Sobre");
        Mn_Sobre.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N

        MnBt_Info.setText("Info");
        MnBt_Info.addActionListener(this::MnBt_InfoActionPerformed);
        Mn_Sobre.add(MnBt_Info);

        Mn_Principal.add(Mn_Sobre);

        setJMenuBar(Mn_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abre o painel de cadastro pelo menu Arquivo > Novo.
    private void BtnMn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMn_NovoActionPerformed
        mostrarPainelCadastro();
    }//GEN-LAST:event_BtnMn_NovoActionPerformed

    // Encerra a aplicação pelo menu Arquivo > Sair.
    private void BtnMn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnMn_SairActionPerformed

    // Exibe a mensagem do relatório de clientes.
    private void BtnMn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMn_ClientesActionPerformed
        JOptionPane.showMessageDialog(this, "Relatório de clientes");
    }//GEN-LAST:event_BtnMn_ClientesActionPerformed

    // Exibe a mensagem do relatório de fornecedores.
    private void BtnMn_FornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMn_FornecedoresActionPerformed
        JOptionPane.showMessageDialog(this, "Relatório de fornecedores");
    }//GEN-LAST:event_BtnMn_FornecedoresActionPerformed

    // Exibe as informações do desenvolvedor.
    private void MnBt_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBt_InfoActionPerformed
        JOptionPane.showMessageDialog(this, "Desenvolvido por Caio Moreira Cancela");
    }//GEN-LAST:event_MnBt_InfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnMn_Clientes;
    private javax.swing.JMenuItem BtnMn_Fornecedores;
    private javax.swing.JMenuItem BtnMn_Novo;
    private javax.swing.JMenuItem BtnMn_Sair;
    private javax.swing.JLabel Lbl_Img;
    private javax.swing.JLabel Lbl_Titulo;
    private javax.swing.JMenuItem MnBt_Info;
    private javax.swing.JMenu Mn_Arquivo;
    private javax.swing.JMenuBar Mn_Principal;
    private javax.swing.JMenu Mn_Relatorio;
    private javax.swing.JMenu Mn_Sobre;
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
