package Membro;

import Base.*;

import javax.swing.*;
import java.awt.*;

public class EditarMembro {
    public EditarMembro(Biblioteca biblioteca) {
        JFrame janelaEditarMembro = new JFrame("Editar membro");
        JPanel painelEditarMembro = new JPanel();
        painelEditarMembro.setLayout(new GridLayout(3, 1, 0, 10));
        painelEditarMembro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel labelMembro = new  JLabel("Escolha o membro");
        JComboBox<Membro> Membros = new JComboBox<>();

        // Coloca os membros cadastrados na caixa de seleção
        for (Membro membro : biblioteca.getMembros()) {
            Membros.addItem(membro);
        }

        Membros.setSelectedIndex(-1);

        JButton salvar = new JButton("Salvar");
        JButton cancelar = new JButton("Cancelar");

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(20);

        JLabel labelEndereço = new JLabel("Endereço:");
        JTextField campoEndereço = new JTextField(20);

        JLabel labelIdade = new JLabel("Idade:");
        JTextField campoIdade = new JTextField(20);

        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField campoTelefone = new JTextField(20);

        JLabel labelCPF = new JLabel("CPF:");
        JTextField campoCPF = new JTextField(20);

        JLabel labelId = new JLabel("Id:");
        JTextField campoId = new JTextField(20);

        JLabel labelData = new JLabel("Data de cadastro:");
        JTextField campoData = new JTextField(20);

         Membros.addActionListener(e -> {
            Membro selecionado = (Membro) Membros.getSelectedItem();

            if (selecionado != null) {
                campoNome.setText(selecionado.getNome());
                campoEndereço.setText(selecionado.getEndereço());
                campoIdade.setText(String.valueOf(selecionado.getIdade()));
                campoTelefone.setText(String.valueOf(selecionado.getTelefone()));
                campoCPF.setText(selecionado.getCpf());
                campoId.setText(String.valueOf(selecionado.getId()));
                campoData.setText(selecionado.getDataCadastro());
            }
        });

        // Altera os dados do próprio livro que está na biblioteca
        salvar.addActionListener(e -> {
            Membro selecionado = (Membro) Membros.getSelectedItem();

            if (selecionado != null) {
                selecionado.setNome(campoNome.getText());
                selecionado.setEndereço(campoEndereço.getText());
                selecionado.setIdade(Integer.parseInt(campoIdade.getText()));
                selecionado.setTelefone(Integer.parseInt(campoTelefone.getText()));
                selecionado.setCpf(campoCPF.getText());
                selecionado.setId(Integer.parseInt(campoId.getText()));
                selecionado.setDataCadastro(campoData.getText());

                janelaEditarMembro.dispose();
            }
        });

        cancelar.addActionListener(e -> {
            janelaEditarMembro.dispose();
        });

        painelEditarMembro.setLayout(new GridLayout(0, 2, 10, 10));
        painelEditarMembro.add(labelMembro);
        painelEditarMembro.add(Membros);
        painelEditarMembro.add(labelNome);
        painelEditarMembro.add(campoNome);
        painelEditarMembro.add(labelEndereço);
        painelEditarMembro.add(campoEndereço);
        painelEditarMembro.add(labelIdade);
        painelEditarMembro.add(campoIdade);
        painelEditarMembro.add(labelTelefone);
        painelEditarMembro.add(campoTelefone);
        painelEditarMembro.add(labelCPF);
        painelEditarMembro.add(campoCPF);
        painelEditarMembro.add(labelId);
        painelEditarMembro.add(campoId);
        painelEditarMembro.add(labelData);
        painelEditarMembro.add(campoData);
        painelEditarMembro.add(salvar);
        painelEditarMembro.add(cancelar);
        salvar.addActionListener(e -> {janelaEditarMembro.dispose();});
        cancelar.addActionListener(e -> {janelaEditarMembro.dispose();});
        janelaEditarMembro.add(painelEditarMembro);
        janelaEditarMembro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaEditarMembro.setSize(500, 300);
        janelaEditarMembro.setLocationRelativeTo(null);
        janelaEditarMembro.setVisible(true);
    }
}
