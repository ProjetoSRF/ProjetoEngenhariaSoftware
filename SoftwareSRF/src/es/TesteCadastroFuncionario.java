/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import es.funcoes.ValidaCPF;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jean
 */
public class TesteCadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TesteCadastroFuncionario
     */
    public TesteCadastroFuncionario() throws ParseException {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/es/imagens/logomt16.png")));
        MaskFormatter maskData = new MaskFormatter("###########");
        maskData.install(cpfCT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelBotoes = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        LabelCPF = new javax.swing.JLabel();
        LabelRua = new javax.swing.JLabel();
        LabelCidade = new javax.swing.JLabel();
        LabelNascimento = new javax.swing.JLabel();
        LabemComplemento = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        nomeCT = new javax.swing.JTextField();
        ruaCT = new javax.swing.JTextField();
        cidadeCT = new javax.swing.JTextField();
        complementoCT = new javax.swing.JTextField();
        dddCT = new javax.swing.JTextField();
        telefoneCT = new javax.swing.JTextField();
        calendarioJC = new com.toedter.calendar.JCalendar();
        LabelFuncao = new javax.swing.JLabel();
        funcaoCB = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        cpfCT = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Funcionário");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        LabelNome.setText("Nome:");

        LabelCPF.setText("CPF:");

        LabelRua.setText("Rua:");

        LabelCidade.setText("Cidade:");

        LabelNascimento.setText("Nascimento:");

        LabemComplemento.setText("Complemento:");

        LabelTelefone.setText("Telefone:");

        LabelFuncao.setText("Função:");

        funcaoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médico(a)", "Fisioterapeuta", "Secretário(a)" }));

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTelefone)
                            .addComponent(LabelCidade))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addComponent(LabelNascimento)
                                .addGap(18, 18, 18)
                                .addComponent(calendarioJC, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabemComplemento)
                                    .addComponent(LabelCPF)
                                    .addComponent(LabelRua)
                                    .addComponent(LabelNome)
                                    .addComponent(LabelFuncao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeCT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nomeCT)
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(dddCT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefoneCT))
                                    .addComponent(ruaCT)
                                    .addComponent(complementoCT)
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(funcaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(cpfCT))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFuncao))
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(LabelNome)
                                .addGap(18, 18, 18)
                                .addComponent(LabelCPF)
                                .addGap(18, 18, 18)
                                .addComponent(LabelRua)
                                .addGap(18, 18, 18)
                                .addComponent(LabemComplemento))
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(LabelCidade)
                        .addGap(18, 18, 18)
                        .addComponent(LabelTelefone))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCT)
                        .addGap(13, 13, 13)
                        .addComponent(cpfCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ruaCT)
                        .addGap(12, 12, 12)
                        .addComponent(complementoCT)
                        .addGap(12, 12, 12)
                        .addComponent(cidadeCT)
                        .addGap(12, 12, 12)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneCT)
                            .addComponent(dddCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelNascimento)
                    .addComponent(calendarioJC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cadastrar)
                .addGap(67, 67, 67))
        );

        jScrollPane1.setViewportView(painelBotoes);

        jTabbedPane1.addTab("Funcionário", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("funcionario");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        boolean validacpf = ValidaCPF.isCPF(cpfCT.getText());
        System.out.println(validacpf);
    }//GEN-LAST:event_cadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelFuncao;
    private javax.swing.JLabel LabelNascimento;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRua;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JLabel LabemComplemento;
    private javax.swing.JButton cadastrar;
    private com.toedter.calendar.JCalendar calendarioJC;
    private javax.swing.JTextField cidadeCT;
    private javax.swing.JTextField complementoCT;
    private javax.swing.JFormattedTextField cpfCT;
    private javax.swing.JTextField dddCT;
    private javax.swing.JComboBox<String> funcaoCB;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nomeCT;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JTextField ruaCT;
    private javax.swing.JTextField telefoneCT;
    // End of variables declaration//GEN-END:variables
}
