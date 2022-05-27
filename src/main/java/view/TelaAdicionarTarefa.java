package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Task;

public class TelaAdicionarTarefa extends javax.swing.JDialog 
{
    boolean taskSaved = false;
    TaskController controller;
    SimpleDateFormat format;
    Task task;
    
    public TelaAdicionarTarefa(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        controller = new TaskController();
        format = new SimpleDateFormat("dd/MM/yyyy");
        task = new Task();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        labelTITULO = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        nomeTarefa = new javax.swing.JTextField();
        placaText = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        dataTarefa = new javax.swing.JTextField();
        comentariosTarefa = new javax.swing.JTextField();
        adicionarTarefa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTITULO.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        labelTITULO.setText("ADICIONAR TAREFA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(labelTITULO)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Nome da tarefa:");

        placaText.setEnabled(false);

        label1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Placa:");

        label2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Comentários:");

        label3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Data da tarefa:");

        adicionarTarefa.setText("Adicionar");
        adicionarTarefa.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                adicionarTarefaMouseClicked(evt);
            }
        });

        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nomeTarefa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(placaText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(dataTarefa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comentariosTarefa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(adicionarTarefa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comentariosTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dataTarefa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(placaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label))
                    .addComponent(adicionarTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentariosTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarTarefaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_adicionarTarefaMouseClicked
    {//GEN-HEADEREND:event_adicionarTarefaMouseClicked
        if(isTextFieldEmpty(dataTarefa))
        {
            showDialog("ERRO", "Você deve informar a data!");
            return;
        }
        
        if(isValidDate(dataTarefa.getText()) == false)
        {
            return;
        }
        
        if(isTextFieldEmpty(nomeTarefa))
        {
            showDialog("ERRO", "Você deve informar o título!");
            return;
        }

        try
        {
            task.setTaskDate(format.parse(dataTarefa.getText()));
            task.setTitle(nomeTarefa.getText());
            task.setText(comentariosTarefa.getText());
            
            controller.saveTask(task);
            taskSaved = true;
            
            dispose();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }//GEN-LAST:event_adicionarTarefaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaDialogo dialog = new TelaDialogo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarTarefa;
    private javax.swing.JTextField comentariosTarefa;
    private javax.swing.JTextField dataTarefa;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelTITULO;
    private javax.swing.JTextField nomeTarefa;
    private javax.swing.JTextField placaText;
    // End of variables declaration//GEN-END:variables

    public boolean taskSaved()
    {
        return taskSaved;
    }

    public void setPlate(String placa)
    {
        task.setPlate(placa);
        placaText.setText(placa);
    }
    
    private boolean isValidDate(String data)
    {
        if(!(data.length() == 10))
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }

        if (!(Character.isDigit(data.charAt(0)) && Character.isDigit(data.charAt(1)))) 
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }

        if (data.charAt(2) != '/')
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }

        if (!(Character.isDigit(data.charAt(3)) && Character.isDigit(data.charAt(4))))
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }
        if (data.charAt(5) != '/')
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }

        if (! (Character.isDigit(data.charAt(6)) && Character.isDigit(data.charAt(7))
         && Character.isDigit(data.charAt(8)) && Character.isDigit(data.charAt(9))) )
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }
        
        int i = Integer.parseInt(data.substring(3, 5));//mês
        
        if (i < 0 || i > 12)
        {
            showDialog("ERRO", "A data informada é inválida!");
            return false;
        }
        
        int j = Integer.parseInt(data.substring(0, 2));//dia
        
        switch (i)
        {
            case 1 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 2 ->
            {
                int k = Integer.parseInt(data.substring(6, 9));
                if (k % 4 == 0)
                {
                    if (j < 0 || j > 29)
                    {
                        showDialog("ERRO", "A data informada é inválida!");
                        return false;
                    }
                }
                else
                {
                    if (j < 0 || j > 28)
                    {
                        showDialog("ERRO", "A data informada é inválida!");
                        return false;
                    }
                }
            }
            case 3 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 4 ->
            {
                if (j < 0 || j > 30)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 5 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 6 ->
            {
                if (j < 0 || j > 30)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 7 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 8 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 9 ->
            {
                if (j < 0 || j > 30)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 10 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 11 ->
            {
                if (j < 0 || j > 30)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
            case 12 ->
            {
                if (j < 0 || j > 31)
                {
                    showDialog("ERRO", "A data informada é inválida!");
                    return false;
                }
            }
        }
        return true;
    }

    private void showDialog(String titulo,String texto)
    {
        TelaDialogo dialogo = new TelaDialogo(null,true);
        dialogo.SetMessage(titulo, texto);
        dialogo.setVisible(true);
    }
    
    private boolean isTextFieldEmpty(javax.swing.JTextField textField)
    {
        return textField.getDocument().getLength() == 0;
    }
    
}

