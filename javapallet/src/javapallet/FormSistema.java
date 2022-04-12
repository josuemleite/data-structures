package javapallet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

public class FormSistema extends javax.swing.JFrame {

    Stack<Pallet> pilha = new Stack<>();
    Stack<Pallet> paux = new Stack<>();

    public FormSistema() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        carregarStack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAux = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPilha = new javax.swing.JTextArea();
        txtProduto = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        lblTopo = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(105, 39, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pallet.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(14, 40, 65));

        listAux.setEditable(false);
        listAux.setBackground(new java.awt.Color(165, 62, 79));
        listAux.setColumns(20);
        listAux.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        listAux.setForeground(new java.awt.Color(255, 255, 255));
        listAux.setRows(5);
        jScrollPane1.setViewportView(listAux);

        listPilha.setEditable(false);
        listPilha.setBackground(new java.awt.Color(165, 62, 79));
        listPilha.setColumns(20);
        listPilha.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        listPilha.setForeground(new java.awt.Color(255, 255, 255));
        listPilha.setRows(5);
        jScrollPane2.setViewportView(listPilha);

        txtProduto.setBackground(new java.awt.Color(102, 102, 102));
        txtProduto.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 122, 142)), "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Mono", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtQtd.setBackground(new java.awt.Color(102, 102, 102));
        txtQtd.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(255, 255, 255));
        txtQtd.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 122, 142)), "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Mono", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblTopo.setFont(new java.awt.Font("Noto Mono", 0, 24)); // NOI18N
        lblTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTopo.setText("Topo:");

        btnRemove.setBackground(new java.awt.Color(226, 85, 45));
        btnRemove.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        btnRemove.setText("Remover");
        btnRemove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 120, 68));
        btnAdd.setFont(new java.awt.Font("Noto Mono", 0, 18)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema de Controle de Pallets");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTopo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblTopo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    File arquivo = new File("./database/stack.txt");

    // https://www.devmedia.com.br/forum/abrindo-arquivos-txt-pegando-dados-e-pondo-em-variaveis/567845
    void carregarStack() {

        String linha = null;

        try {
            if (!arquivo.exists() && !arquivo.isDirectory()) {
                System.out.println(arquivo + " não existe!");
                arquivo.createNewFile();
                //arquivoAux.createNewFile();
                System.out.println("Arquivo " + arquivo + " criado com sucesso!");
            } else if (arquivo.exists() && !arquivo.isDirectory()) {

                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                StringTokenizer st = null;

                if (arquivo.exists() && !arquivo.isDirectory()) {
                    while ((linha = br.readLine()) != null) {
                        st = new StringTokenizer(linha, " : ");
                        String dados = null;
                        while (st.hasMoreTokens()) {

                            Pallet p = new Pallet();

                            dados = st.nextToken();
                            p.setProduto(dados);

                            dados = st.nextToken();
                            p.setQtd(Integer.parseInt(dados));

                            pilha.push(p);
                        }
                    }
                    br.close();
                    mostra();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    void salvarStack() {

        Pallet p = new Pallet();

        try {
            if (arquivo.exists() && !arquivo.isDirectory()) {
                if (arquivo.delete()) {
                    System.out.println(arquivo + " deletado com sucesso (2)!");
                } else {
                    System.out.println("Não foi possível deletar o arquivo (2)!");
                }
                if (arquivo.createNewFile()) {
                    System.out.println("Arquivo " + arquivo + " criado com sucesso!");
                } else {
                    System.out.println("Não foi possível criar o arquivo!");
                }
                while (!pilha.isEmpty()) {
                    paux.push(pilha.pop());
                }
                while (!paux.isEmpty()) {
                    p = paux.peek();
                    FileWriter fw = new FileWriter(arquivo, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(p.toString());
                    bw.newLine();
                    bw.close();
                    fw.close();
                    paux.pop();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            arquivo.delete();
        }
    }

    void mostra() {
        // pilha principal
        listPilha.setText("");
        for (Pallet p : pilha) {
            listPilha.append(p.toString() + "\n");
        }

        // mostrando a pilha Aux
        listAux.setText("");
        for (Pallet p : paux) {
            listAux.append(p.toString() + "\n");
        }

        if (pilha.isEmpty()) {
            lblTopo.setText("Topo -> Vazio");
        } else {
            lblTopo.setText("Topo -> " + pilha.peek());
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            salvarStack();
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Pallet p = new Pallet();
        p.setProduto(txtProduto.getText());
        p.setQtd(Integer.parseInt(txtQtd.getText()));
        pilha.push(p);
        System.out.println(pilha);
        System.out.println("Topo:" + pilha.peek());
        mostra();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        if (txtProduto.getText() == "") {
            JOptionPane.showConfirmDialog(null, "Informe uma descrição para o produto!");
        }
        if (txtQtd.getText() == "") {
            JOptionPane.showConfirmDialog(null, "Informe uma quantidade para o produto!");
        }
        
        Pallet p = new Pallet();

        while (!pilha.isEmpty()) {
            p = pilha.peek();
            if (p.getProduto().equals(txtProduto.getText())) {
                // Testar se a quantidade é o que quero remover
                // Se for > = pop apenas - fala que removeu tudo
                if (Integer.parseInt(txtQtd.getText()) >= p.getQtd()) {
                    pilha.pop();
                } //se for < = decrementa do p.getQtd a quantidade da caixa de texto
                // e devolve
                else if (Integer.parseInt(txtQtd.getText()) < p.getQtd()) {
                    p.setQtd(p.getQtd() - Integer.parseInt(txtQtd.getText()));
                }
                JOptionPane.showMessageDialog(null, "Encontrado");
                mostra();
                //break;
                break;
            }// fim if equals
            else {
                JOptionPane.showMessageDialog(null, "Movendo para auxiliar: " + p.getProduto());
                paux.push(pilha.pop());
                mostra();
            }// fim else remove
        }// fim while isEmpty

        // devolve da aux para principal
        while (!paux.isEmpty()) {
            pilha.push(paux.pop());
            mostra();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTopo;
    private javax.swing.JTextArea listAux;
    private javax.swing.JTextArea listPilha;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
