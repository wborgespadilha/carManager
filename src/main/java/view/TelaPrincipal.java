package view;

import controller.CarController;
import controller.TaskController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Car;
import model.Task;

public class TelaPrincipal extends javax.swing.JFrame 
{

    CarController carController;
    TaskController taskController;
    Car globalCar;
    Boolean isEditButtonClicked;
    List<Car> carList;
    List<Task> taskList;
    SimpleDateFormat format;
    DefaultTableModel modelRegister;
    DefaultTableModel modelQuery;
    
    public TelaPrincipal() 
    {
        initComponents();
        carController = new CarController();
        taskController = new TaskController();
        globalCar = new Car();
        isEditButtonClicked = false;
        format = new SimpleDateFormat("dd/MM/yyyy");
        this.modelRegister = (DefaultTableModel) tabelaCadastro.getModel();
        this.modelQuery = (DefaultTableModel) tabelaConsulta.getModel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MarcaCadastro = new javax.swing.JTextField();
        DonoCadastro = new javax.swing.JTextField();
        ModeloCadastro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComentariosCadastro = new javax.swing.JTextArea();
        BotaoCadastrar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaCadastro = new javax.swing.JTable();
        botaoAdicionarTarefaCadastro = new javax.swing.JButton();
        botaoRemoverTarefaCadastro = new javax.swing.JButton();
        PlacaCadastro = new javax.swing.JFormattedTextField();
        local1Cadastro = new javax.swing.JCheckBox();
        local2Cadastro = new javax.swing.JCheckBox();
        local3Cadastro = new javax.swing.JCheckBox();
        local4Cadastro = new javax.swing.JCheckBox();
        DataEntradaCadastro = new javax.swing.JTextField();
        DataSaidaCadastro = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        SelecionarTipo = new javax.swing.JComboBox<>();
        BarraDePesquisa = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DonoConsulta = new javax.swing.JTextField();
        ModeloConsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComentariosConsulta = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        botaoEditarConsulta = new javax.swing.JButton();
        botaoSalvarConsulta = new javax.swing.JButton();
        botaoExcluirConsulta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        IDConsulta = new javax.swing.JTextField();
        MarcaConsulta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        botaoAdicionarTarefaConsulta = new javax.swing.JButton();
        botaoRemoverTarefaConsulta = new javax.swing.JButton();
        PlacaConsulta = new javax.swing.JFormattedTextField();
        local1Consulta = new javax.swing.JCheckBox();
        local2Consulta = new javax.swing.JCheckBox();
        local3Consulta = new javax.swing.JCheckBox();
        local4Consulta = new javax.swing.JCheckBox();
        DataEntradaConsulta = new javax.swing.JTextField();
        DataSaidaConsulta = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 255));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 36)); // NOI18N
        jLabel27.setText("Seja bem vindo!");

        jLabel28.setText("Use as abas acima para começar.");

        jLabel29.setText("Use a aba \"sobre\" para informações sobre o banco de dados!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel30.setForeground(new java.awt.Color(153, 204, 255));
        jLabel30.setText("Versão 1.0");

        jDesktopPane3.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane3)
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        jDesktopPane4.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Placa*:");

        jLabel14.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Marca:");

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Modelo:");

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dono:");

        MarcaCadastro.setNextFocusableComponent(ModeloCadastro);

        DonoCadastro.setNextFocusableComponent(MarcaCadastro);

        ModeloCadastro.setNextFocusableComponent(DataEntradaCadastro);

        jLabel17.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Comentários*");

        ComentariosCadastro.setColumns(20);
        ComentariosCadastro.setRows(5);
        jScrollPane2.setViewportView(ComentariosCadastro);

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Data entrada:");

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Data saída*:");

        jLabel32.setForeground(new java.awt.Color(153, 204, 255));
        jLabel32.setText("(Fomato: XXX0000)");

        jLabel35.setForeground(new java.awt.Color(153, 204, 255));
        jLabel35.setText("(Fomato de data: XX/XX/XXXX)");

        jLabel36.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("* Não obrigatório");

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tarefas*:");

        tabelaCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data da tarefa", "Título da tarefa ", "Comentários"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCadastro.setSelectionForeground(new java.awt.Color(102, 153, 255));
        tabelaCadastro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaCadastro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(tabelaCadastro);
        if (tabelaCadastro.getColumnModel().getColumnCount() > 0) {
            tabelaCadastro.getColumnModel().getColumn(0).setMinWidth(90);
            tabelaCadastro.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabelaCadastro.getColumnModel().getColumn(0).setMaxWidth(90);
            tabelaCadastro.getColumnModel().getColumn(1).setMinWidth(150);
            tabelaCadastro.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaCadastro.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        botaoAdicionarTarefaCadastro.setText("Adicionar Tarefa");
        botaoAdicionarTarefaCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarTarefaCadastroMouseClicked(evt);
            }
        });

        botaoRemoverTarefaCadastro.setText("Remover Tarefa");
        botaoRemoverTarefaCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverTarefaCadastroMouseClicked(evt);
            }
        });

        try {
            PlacaCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU#A##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        local1Cadastro.setForeground(new java.awt.Color(153, 204, 255));
        local1Cadastro.setText("Voss");

        local2Cadastro.setForeground(new java.awt.Color(153, 204, 255));
        local2Cadastro.setText("Blucar");

        local3Cadastro.setForeground(new java.awt.Color(153, 204, 255));
        local3Cadastro.setText("Terceiros");

        local4Cadastro.setForeground(new java.awt.Color(153, 204, 255));
        local4Cadastro.setText("Oficina");

        jDesktopPane4.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(MarcaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(DonoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(ModeloCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(BotaoCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(botaoAdicionarTarefaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(botaoRemoverTarefaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(PlacaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(local1Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(local2Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(local3Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(local4Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(DataEntradaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(DataSaidaCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PlacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addContainerGap(884, Short.MAX_VALUE))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MarcaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ModeloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel22))
                                        .addGap(27, 27, 27)
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DataEntradaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DataSaidaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(15, 15, 15)
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(local1Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(local2Cadastro))
                                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(local3Cadastro))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(local4Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel35)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAdicionarTarefaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemoverTarefaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DonoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(336, 336, 336))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel36)
                .addGap(349, 939, Short.MAX_VALUE))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(PlacaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DonoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MarcaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ModeloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DataEntradaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(local1Cadastro)
                                        .addComponent(local3Cadastro)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DataSaidaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(local2Cadastro)
                                        .addComponent(local4Cadastro)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(58, 58, 58)
                                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jDesktopPane4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoAdicionarTarefaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botaoRemoverTarefaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        jTabbedPane1.addTab("Cadastrar", jDesktopPane4);

        jDesktopPane2.setMinimumSize(null);

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Busca por:");

        SelecionarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Placa", "Dono", "Marca", "Modelo", "Data de entrada", "Data de saída", "Data da tarefa", "VOSS", "BLUCAR", "TERCEIROS", "OFICINA", " " }));

        BarraDePesquisa.setText("0");

        BotaoPesquisar.setText("Buscar");
        BotaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoPesquisarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa:");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dados");

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dono:");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Marca:");

        DonoConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        DonoConsulta.setEnabled(false);

        ModeloConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        ModeloConsulta.setEnabled(false);

        ComentariosConsulta.setColumns(20);
        ComentariosConsulta.setRows(5);
        ComentariosConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        ComentariosConsulta.setEnabled(false);
        jScrollPane1.setViewportView(ComentariosConsulta);

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Modelo:");

        jLabel25.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Data Saída:");

        jLabel26.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Data Entrada:");

        botaoEditarConsulta.setText("Editar");
        botaoEditarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarConsultaMouseClicked(evt);
            }
        });

        botaoSalvarConsulta.setText("Salvar");
        botaoSalvarConsulta.setEnabled(false);
        botaoSalvarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarConsultaMouseClicked(evt);
            }
        });

        botaoExcluirConsulta.setText("Excluir");
        botaoExcluirConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirConsultaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID:");

        IDConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        IDConsulta.setEnabled(false);

        MarcaConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        MarcaConsulta.setEnabled(false);

        jLabel33.setForeground(new java.awt.Color(153, 204, 255));
        jLabel33.setText("(Fomato de placa: XXX0000)");

        jLabel34.setForeground(new java.awt.Color(153, 204, 255));
        jLabel34.setText("(Fomato de data: XX/XX/XXXX)");

        jLabel24.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Comentários");

        jLabel31.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Tarefas:");

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data da tarefa", "Título da tarefa ", "Comentários"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsulta.setSelectionForeground(new java.awt.Color(102, 153, 255));
        tabelaConsulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaConsulta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(tabelaConsulta);
        if (tabelaConsulta.getColumnModel().getColumnCount() > 0) {
            tabelaConsulta.getColumnModel().getColumn(0).setMinWidth(90);
            tabelaConsulta.getColumnModel().getColumn(0).setPreferredWidth(90);
            tabelaConsulta.getColumnModel().getColumn(0).setMaxWidth(90);
            tabelaConsulta.getColumnModel().getColumn(1).setMinWidth(150);
            tabelaConsulta.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaConsulta.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        botaoAdicionarTarefaConsulta.setText("Adicionar Tarefa");
        botaoAdicionarTarefaConsulta.setEnabled(false);
        botaoAdicionarTarefaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAdicionarTarefaConsultaMouseClicked(evt);
            }
        });

        botaoRemoverTarefaConsulta.setText("Remover Tarefa");
        botaoRemoverTarefaConsulta.setEnabled(false);
        botaoRemoverTarefaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverTarefaConsultaMouseClicked(evt);
            }
        });

        try {
            PlacaConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU#A##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        PlacaConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        PlacaConsulta.setEnabled(false);

        local1Consulta.setForeground(new java.awt.Color(153, 204, 255));
        local1Consulta.setText("Voss");
        local1Consulta.setEnabled(false);

        local2Consulta.setForeground(new java.awt.Color(153, 204, 255));
        local2Consulta.setText("Blucar");
        local2Consulta.setEnabled(false);

        local3Consulta.setForeground(new java.awt.Color(153, 204, 255));
        local3Consulta.setText("Terceiros");
        local3Consulta.setEnabled(false);

        local4Consulta.setForeground(new java.awt.Color(153, 204, 255));
        local4Consulta.setText("Oficina");
        local4Consulta.setEnabled(false);

        DataEntradaConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        DataEntradaConsulta.setEnabled(false);

        DataSaidaConsulta.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        DataSaidaConsulta.setEnabled(false);

        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(SelecionarTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(BarraDePesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(BotaoPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(DonoConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ModeloConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(botaoEditarConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(botaoSalvarConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(botaoExcluirConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(IDConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(MarcaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(botaoAdicionarTarefaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(botaoRemoverTarefaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(PlacaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(local1Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(local2Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(local3Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(local4Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(DataEntradaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(DataSaidaConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addComponent(PlacaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(IDConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(MarcaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DonoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModeloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DataSaidaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DataEntradaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(local1Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(BotaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BarraDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SelecionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(botaoEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(botaoSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(botaoExcluirConsulta))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(local4Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(local3Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(local2Consulta)))))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(botaoAdicionarTarefaConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoRemoverTarefaConsulta)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(340, 340, 340))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(323, 323, 323))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SelecionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BarraDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(BotaoPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PlacaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(IDConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MarcaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ModeloConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(local1Consulta)
                    .addComponent(local3Consulta)
                    .addComponent(DataEntradaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(local2Consulta)
                    .addComponent(local4Consulta)
                    .addComponent(DataSaidaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluirConsulta))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarTarefaConsulta)
                    .addComponent(botaoRemoverTarefaConsulta))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Consultar", jDesktopPane2);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Como ligar e desligar o banco de dados");

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sobre");

        jLabel10.setForeground(new java.awt.Color(153, 204, 255));
        jLabel10.setText("Software criado por William Borges Padilha");

        jLabel11.setForeground(new java.awt.Color(153, 204, 255));
        jLabel11.setText("Para lógica de programação e algoritmos III");

        jLabel12.setForeground(new java.awt.Color(153, 204, 255));
        jLabel12.setText("Feito em Java com Swing e MySql.");

        jLabel21.setForeground(new java.awt.Color(153, 204, 255));
        jLabel21.setText("Da Proway - EAD.");

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Abra a pasta xampp e execute o xampp-control.exe");

        jLabel18.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Clique em start ao lado do Apache e do MySQL");

        jLabel37.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("O programa já estará funcionando após isso.");

        jLabel38.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Depois de usar o programa, basta clicar em stop");

        jLabel39.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ao lado do Apache e do MySQL e fechar o xampp");

        jLabel41.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("É só isso :D");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(596, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(152, 152, 152))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel21))
                        .addGap(60, 60, 60))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38))
                        .addGap(0, 739, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18))
                .addGap(4, 4, 4)
                .addComponent(jLabel21)
                .addGap(14, 14, 14)
                .addComponent(jLabel37)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addGap(20, 20, 20)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addGap(43, 43, 43)
                .addComponent(jLabel41)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sobre", jDesktopPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoPesquisarMouseClicked
        
        int selectedRow = SelecionarTipo.getSelectedIndex();

        //Requisita a inserção de dados, exceto para as localizações dos veículos 
        
        if(selectedRow != 8 && selectedRow != 9 && selectedRow != 10 && selectedRow != 11)
        {
            if(isTextFieldEmpty(BarraDePesquisa))
            {
                showDialog("ERRO", "Você deve informar os dados!");
                return;      
            }     
        }

        switch(selectedRow)
        {
            case 0 -> //ID
            {
                fetchCarByID();
                return;
            }
            case 1 -> //Placa
            {
                fetchCarByPlate();
            }
            case 2 -> //Dono
            {
                fetchCarByOwner();
            }
            case 3 -> //Marca
            {
                fetchCarByBrand();
            }
            case 4 -> //Modelo
            {
                fetchCarByModel();
            }
            case 5 -> //Entrada
            {
                fetchCarByEntrance();
            }
            case 6 -> //Saida
            {
                fetchCarByExit();            
            }
            case 7 ->//Data da tarefa
            {
                fetchCarByTaskDay(); 
            }
            case 8 ->//VOSS - local1
            {
                fetchCarByFirstLocal();
            }
            case 9 ->//BLUCAR - local2
            {
                fetchCarBySecondLocal();
            }
            case 10 ->//TERCEIROS - local3
            {
                fetchCarByThirdLocal();
            }
            case 11 ->//OFICINA - local4
            {
                fetchCarByFourthLocal();
            }
        }   
    }//GEN-LAST:event_BotaoPesquisarMouseClicked

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        // Unico botão da tela CADASTRAR
        // Faz a validação de todos os parâmetros
        
        if(isTextFieldEmpty(DonoCadastro))
        {
            showDialog("ERRO", "Você deve informar o dono!");
            return;
        }
        
        if(isTextFieldEmpty(MarcaCadastro))
        {
            showDialog("ERRO", "Você deve informar a marca!");
            return;
        }
        
        if(isTextFieldEmpty(ModeloCadastro))
        {
            showDialog("ERRO", "Você deve informar o modelo!");
            return;
        }
        
        if(isTextFieldEmpty(DataEntradaCadastro))
        {
            showDialog("ERRO", "Você deve informar a data de entrada!");
            return;
        }
        
        if(isValidDate(DataEntradaCadastro.getText()) == false){return;}
        
        if(isTextFieldEmpty(DataSaidaCadastro) == false)
        {
            if(isValidDate(DataSaidaCadastro.getText()) == false){return;}
        }
        
        if(isRegisterTableValid())
        {
            createCar();
        }
        
    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void botaoEditarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarConsultaMouseClicked
        if(isTextFieldEmpty(IDConsulta) ==  false)
        {
            if(isEditButtonClicked == false)
            {
                isUserEditing(true);
            }
            else if(isEditButtonClicked == true)
            {
                refreshQueryFieldsData();
                isUserEditing(false);  
            }
        }
    }//GEN-LAST:event_botaoEditarConsultaMouseClicked

    private void botaoSalvarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarConsultaMouseClicked

        // Faz a validação de todos os parâmetros
        if(isTextFieldEmpty(PlacaConsulta))
        {
            showDialog("ERRO", "Você deve informar a placa!");
            return;
        }
        
        if(isTextFieldEmpty(DonoConsulta))
        {
            showDialog("ERRO", "Você deve informar o dono!");
            return;
        }
        
        if(isTextFieldEmpty(MarcaConsulta))
        {
            showDialog("ERRO", "Você deve informar a marca!");
            return;
        }
        
        if(isTextFieldEmpty(ModeloConsulta))
        {
            showDialog("ERRO", "Você deve informar o modelo!");
            return;
        }
        
        if(isTextFieldEmpty(DataEntradaConsulta))
        {
            showDialog("ERRO", "Você deve informar a data de entrada!");
            return;
        }
        
        if(isValidDate(DataEntradaConsulta.getText()) == false)
        {
            return;
        }
        
        if(isTextFieldEmpty(DataSaidaConsulta) == false)
        {
            if(isValidDate(DataSaidaConsulta.getText()) == false)
            {
                return;
            }
        }
        
        updateCar();
        
    }//GEN-LAST:event_botaoSalvarConsultaMouseClicked

    private void botaoExcluirConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirConsultaMouseClicked
        if(isTextFieldEmpty(IDConsulta) == false)
        {
            showDeleteConfirmation();
        }
    }//GEN-LAST:event_botaoExcluirConsultaMouseClicked

    private void botaoAdicionarTarefaCadastroMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoAdicionarTarefaCadastroMouseClicked
    {//GEN-HEADEREND:event_botaoAdicionarTarefaCadastroMouseClicked
        Object[] rowData = {};
        modelRegister.addRow(rowData);
    }//GEN-LAST:event_botaoAdicionarTarefaCadastroMouseClicked

    private void botaoRemoverTarefaCadastroMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoRemoverTarefaCadastroMouseClicked
    {//GEN-HEADEREND:event_botaoRemoverTarefaCadastroMouseClicked
        modelRegister.removeRow(tabelaCadastro.getSelectedRow());
    }//GEN-LAST:event_botaoRemoverTarefaCadastroMouseClicked

    private void botaoAdicionarTarefaConsultaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoAdicionarTarefaConsultaMouseClicked
    {//GEN-HEADEREND:event_botaoAdicionarTarefaConsultaMouseClicked
       if(botaoAdicionarTarefaConsulta.isEnabled() == true)
       {
            TelaAdicionarTarefa addTask = new TelaAdicionarTarefa(this.jFrame1,true);
            addTask.setPlate(PlacaConsulta.getText());
            addTask.setVisible(true);
            
            if(addTask.taskSaved() == true)
            {
                PopulateOrRefreshTasks(PlacaConsulta.getText());
                //Refresh the table
            }
       }
    }//GEN-LAST:event_botaoAdicionarTarefaConsultaMouseClicked

    private void botaoRemoverTarefaConsultaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_botaoRemoverTarefaConsultaMouseClicked
    {//GEN-HEADEREND:event_botaoRemoverTarefaConsultaMouseClicked
        if(botaoRemoverTarefaConsulta.isEnabled() == true)
        {
            Task task = new Task();
            task.setTitle((String) tabelaConsulta.getValueAt(tabelaConsulta.getSelectedRow(), 1));
            task.setPlate(PlacaConsulta.getText());
            
            TelaConfirmacaoTarefa confirmDialog = new TelaConfirmacaoTarefa(this.jFrame1,true);
            confirmDialog.PassarTarefa(task);
            confirmDialog.setVisible(true);
            
            if(confirmDialog.isYesButtonClicked() == true)
            {
                PopulateOrRefreshTasks(PlacaConsulta.getText());
            }
            
        }
    }//GEN-LAST:event_botaoRemoverTarefaConsultaMouseClicked

    public static void main(String args[]) 
    {
        
        
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraDePesquisa;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextArea ComentariosCadastro;
    private javax.swing.JTextArea ComentariosConsulta;
    private javax.swing.JTextField DataEntradaCadastro;
    private javax.swing.JTextField DataEntradaConsulta;
    private javax.swing.JTextField DataSaidaCadastro;
    private javax.swing.JTextField DataSaidaConsulta;
    private javax.swing.JTextField DonoCadastro;
    private javax.swing.JTextField DonoConsulta;
    private javax.swing.JTextField IDConsulta;
    private javax.swing.JTextField MarcaCadastro;
    private javax.swing.JTextField MarcaConsulta;
    private javax.swing.JTextField ModeloCadastro;
    private javax.swing.JTextField ModeloConsulta;
    private javax.swing.JFormattedTextField PlacaCadastro;
    private javax.swing.JFormattedTextField PlacaConsulta;
    private javax.swing.JComboBox<String> SelecionarTipo;
    private javax.swing.JButton botaoAdicionarTarefaCadastro;
    private javax.swing.JButton botaoAdicionarTarefaConsulta;
    private javax.swing.JButton botaoEditarConsulta;
    private javax.swing.JButton botaoExcluirConsulta;
    private javax.swing.JButton botaoRemoverTarefaCadastro;
    private javax.swing.JButton botaoRemoverTarefaConsulta;
    private javax.swing.JButton botaoSalvarConsulta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox local1Cadastro;
    private javax.swing.JCheckBox local1Consulta;
    private javax.swing.JCheckBox local2Cadastro;
    private javax.swing.JCheckBox local2Consulta;
    private javax.swing.JCheckBox local3Cadastro;
    private javax.swing.JCheckBox local3Consulta;
    private javax.swing.JCheckBox local4Cadastro;
    private javax.swing.JCheckBox local4Consulta;
    private javax.swing.JTable tabelaCadastro;
    private javax.swing.JTable tabelaConsulta;
    // End of variables declaration//GEN-END:variables

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

    private boolean isTextFieldEmpty(javax.swing.JTextField textField)
    {
        return textField.getDocument().getLength() == 0;
    }
      
    private void showDialog(String title,String text)
    {
        TelaDialogo dialogo = new TelaDialogo(this.jFrame1,true);
        dialogo.SetMessage(title, text);
        dialogo.setVisible(true);
    }
    
    private boolean isRegisterTableValid()
    {
        for(int i = 0; i < tabelaCadastro.getRowCount(); i++)
        {
            String date = (String) tabelaCadastro.getValueAt(i, 0);
            
            if(date == null)
            {
                showDialog("ERRO", "Você deve informar a data da tarefa!");
                return false;
            }
            
            if(isValidDate(date) == false)
            {
                return false;
            }
            
            String titulo = (String) tabelaCadastro.getValueAt(i, 1);
            
            if(titulo == null)
            {
                showDialog("ERRO", "Você deve informar o título da tarefa!");
                return false;
            }
        }
        return true;
    }
    
    public void showDeleteConfirmation()
    {
        TelaConfirmacao confirmDialog = new TelaConfirmacao(this.jFrame1,true);
        confirmDialog.SetCar(globalCar);
        confirmDialog.setVisible(true);

        if(confirmDialog.wasConfirmed()== true)
        {
            globalCar.setPlate(null);
            globalCar.setOwner(null);
            globalCar.setBrand(null);
            globalCar.setModel(null);
            globalCar.setEntrance(null);
            globalCar.setExit(null);
            globalCar.setComments(null);
            globalCar.setInFirstLocal(false);
            globalCar.setInSecondLocal(false);
            globalCar.setInThirdLocal(false);
            globalCar.setInFourthLocal(false);
            
            if(isEditButtonClicked == true)
            {
                isUserEditing(false);
            }    
            
            for(int i = 0; i < tabelaConsulta.getRowCount(); i++)
            {
                Task task = new Task();
                
                task.setTitle((String) tabelaConsulta.getValueAt(i, 1));
                task.setPlate(PlacaConsulta.getText());
                
                taskController.deleteTask(task); 
            }
            clearQuery();
        } 
    }
    
    private void clearQuery()
    {
        IDConsulta.setText("");
        PlacaConsulta.setText("");
        DonoConsulta.setText("");
        MarcaConsulta.setText("");
        ModeloConsulta.setText("");
        DataEntradaConsulta.setText("");
        DataSaidaConsulta.setText("");
        ComentariosConsulta.setText("");
        local1Consulta.setSelected(false);
        local2Consulta.setSelected(false);
        local3Consulta.setSelected(false);
        local4Consulta.setSelected(false);
        modelQuery.setRowCount(0);
    }
 
    private void checkResult(List<Car> lista)
    {
        if(lista.isEmpty())
        {
            showDialog("ERRO", "A pesquisa não teve resultados!");
        }
        else
        {
            ShowSelectionScreen(lista);
        }
    }
    
    public void ShowSelectionScreen(List<Car> carList)
    {
        TelaSelecao selectionScreen = new TelaSelecao(this,true);
        selectionScreen.PopulateTable(carList);
        selectionScreen.setVisible(true);
        
        if(selectionScreen.ReturnSelectedCar() != -1)
        {
            globalCar = (carList.get(selectionScreen.ReturnSelectedCar()));
            
            setQueryDataByGlobalCar();
            PopulateOrRefreshTasks(globalCar.getPlate());
            
            if(isEditButtonClicked == true)
            {
                isUserEditing(false);
            }
        }
    }
    
    public void PopulateOrRefreshTasks(String plate)
    {
        modelQuery.setRowCount(0);
        taskList = taskController.getTasksByPlate(plate);
        Task task;
        
        for(int i = 0; i < taskList.size(); i++)
        {
            task = taskList.get(i);
            Date data = task.getTaskDate();
            String titulo = task.getTitle();
            String texto = task.getText();
            Object[] row = { data, titulo, texto};
            modelQuery.addRow(row);
        }
        
    }
    
    private void isUserEditing(Boolean bool)
    {
        /*
        Deshabilita os campos e o botão salvar
        Caso busque novo carro sem sair do modo edição ou
        Delete um carro sem sair do modo edição
        
        Habilita quando clicar no botão editar
        
        */
        botaoSalvarConsulta.setEnabled(bool);
        PlacaConsulta.setEnabled(bool);
        DonoConsulta.setEnabled(bool);
        MarcaConsulta.setEnabled(bool);
        ModeloConsulta.setEnabled(bool);
        DataEntradaConsulta.setEnabled(bool);
        DataSaidaConsulta.setEnabled(bool);
        ComentariosConsulta.setEnabled(bool);
        local1Consulta.setEnabled(bool);
        local2Consulta.setEnabled(bool);
        local3Consulta.setEnabled(bool);
        local4Consulta.setEnabled(bool);
        botaoAdicionarTarefaConsulta.setEnabled(bool);
        botaoRemoverTarefaConsulta.setEnabled(bool);
        isEditButtonClicked = bool;
    }
    
    private void updateCar()       
    {
        try
        {
            setGlobalCarByQueryData();

            carController.update(globalCar);
            showDialog("CONFIRMAÇÃO", "As informações foram salvas");

            isUserEditing(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void createCar()
    {
        try
        {
            setGlobalCarByRegisterData();
            
            for(int i = 0; i < tabelaCadastro.getRowCount(); i++)//Converte tabela em objetos
            {
                Task task = new Task();
                Date dataTabela = format.parse((String) tabelaCadastro.getValueAt(i, 0));
                
                task.setTaskDate(dataTabela);
                task.setTitle((String) tabelaCadastro.getValueAt(i, 1));
                task.setText((String) tabelaCadastro.getValueAt(i, 2));
                task.setPlate(PlacaCadastro.getText());
                
                taskController.saveTask(task); //Salva as tarefas no banco de dados
            }

            carController.create(globalCar);

            showDialog("SUCESSO", "O carro foi cadastrado com sucesso!");

            clearRegister();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void clearRegister()
    {
        PlacaCadastro.setText("");
        DonoCadastro.setText("");
        MarcaCadastro.setText("");
        ModeloCadastro.setText("");
        DataEntradaCadastro.setText("");
        DataSaidaCadastro.setText("");
        ComentariosCadastro.setText("");
        local1Cadastro.setSelected(false);
        local2Cadastro.setSelected(false);
        local3Cadastro.setSelected(false);
        local4Cadastro.setSelected(false);
        modelRegister.setRowCount(0);
    }
    
    private void setGlobalCarByRegisterData()
    {
        try
        {
            globalCar.setPlate(PlacaCadastro.getText());
            globalCar.setOwner(DonoCadastro.getText());
            globalCar.setBrand(MarcaCadastro.getText());
            globalCar.setModel(ModeloCadastro.getText());
            globalCar.setEntrance(format.parse(DataEntradaCadastro.getText()));

            if (DataSaidaCadastro.getDocument().getLength() != 0) 
            {
                globalCar.setExit(format.parse(DataSaidaCadastro.getText()));
            }

            globalCar.setComments(ComentariosCadastro.getText());
            globalCar.setInFirstLocal(local1Cadastro.isSelected());
            globalCar.setInSecondLocal(local2Cadastro.isSelected());
            globalCar.setInThirdLocal(local3Cadastro.isSelected());
            globalCar.setInFourthLocal(local4Cadastro.isSelected());   
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void setGlobalCarByQueryData()
    {
        try
        {
            globalCar.setPlate(PlacaConsulta.getText());
            globalCar.setOwner(DonoConsulta.getText());
            globalCar.setBrand(MarcaConsulta.getText());
            globalCar.setModel(ModeloConsulta.getText());
            globalCar.setEntrance(format.parse(DataEntradaConsulta.getText()));

            if (DataSaidaConsulta.getDocument().getLength() != 0) 
            {
                globalCar.setExit(format.parse(DataSaidaConsulta.getText()));
            }

            globalCar.setComments(ComentariosConsulta.getText());
            globalCar.setInFirstLocal(local1Consulta.isSelected());
            globalCar.setInSecondLocal(local2Consulta.isSelected());
            globalCar.setInThirdLocal(local3Consulta.isSelected());
            globalCar.setInFourthLocal(local4Consulta.isSelected());
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void setQueryDataByGlobalCar()
    {
        try
        {
            PlacaConsulta.setText(globalCar.getPlate());
            IDConsulta.setText(Integer.toString(globalCar.getId()));
            DonoConsulta.setText(globalCar.getOwner());
            MarcaConsulta.setText(globalCar.getBrand());
            ModeloConsulta.setText(globalCar.getModel());
            DataEntradaConsulta.setText(format.format(globalCar.getEntrance()));

            if (!"31/12/1969".equals(format.format(globalCar.getExit()))) 
            {
                DataSaidaConsulta.setText(format.format(globalCar.getExit()));
            } 
            else 
            {
                DataSaidaConsulta.setText("");
            }

            ComentariosConsulta.setText(globalCar.getComments());
            local1Consulta.setSelected(globalCar.isInFirstLocal());
            local2Consulta.setSelected(globalCar.isInSecondLocal());
            local3Consulta.setSelected(globalCar.isInThirdLocal());
            local4Consulta.setSelected(globalCar.isInFourthLocal()); 
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void refreshQueryFieldsData() 
    {
        if (!"".equals(IDConsulta.getText())) 
        {
            PlacaConsulta.setText(globalCar.getPlate());
            IDConsulta.setText(Integer.toString(globalCar.getId()));
            DonoConsulta.setText(globalCar.getOwner());
            MarcaConsulta.setText(globalCar.getBrand());
            ModeloConsulta.setText(globalCar.getModel());
            
            DataEntradaConsulta.setText(format.format(globalCar.getEntrance()));
            
            if(!"31/12/1969".equals(format.format(globalCar.getExit())))
            {
                DataSaidaConsulta.setText(format.format(globalCar.getExit()));
            }
            else
            {
                DataSaidaConsulta.setText("");
            }
            
            ComentariosConsulta.setText(globalCar.getComments());
            local1Consulta.setSelected(globalCar.isInFirstLocal());
            local2Consulta.setSelected(globalCar.isInSecondLocal());
            local3Consulta.setSelected(globalCar.isInThirdLocal());
            local4Consulta.setSelected(globalCar.isInFourthLocal());
            PopulateOrRefreshTasks(globalCar.getPlate());
        }
    }
    
    private void fetchCarByID() 
    {
        try 
        {
            globalCar = carController.getById(Integer.valueOf(BarraDePesquisa.getText()));

            if (globalCar.getPlate() == null) 
            {
                showDialog("ERRO", "A pesquisa não teve resultados!");
                return;
            }

            setQueryDataByGlobalCar();
            
            PopulateOrRefreshTasks(globalCar.getPlate());
            
            if (isEditButtonClicked == true) 
            {
                isUserEditing(false);
            }
            
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    private void fetchCarByPlate() 
    {
        try 
        {
            carList = carController.getByPlate(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    private void fetchCarByOwner()
    {
        try 
        {
            carList = carController.getByOwner(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByBrand()
    {
        try 
        {
            carList = carController.getByBrand(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByModel()
    {
        try 
        {
            carList = carController.getByModel(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByEntrance()
    {
        try 
        {
            if (isValidDate(BarraDePesquisa.getText()) == false) 
            {
                return;
            }

            carList = carController.getByEntrance(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByExit()
    {
        try 
        {
            if (isValidDate(BarraDePesquisa.getText()) == false) 
            {
                return;
            }

            carList = carController.getByExit(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByTaskDay()
    {
        try 
        {
            if (isValidDate(BarraDePesquisa.getText()) == false) 
            {
                return;
            }

            carList = taskController.getCarByTask(BarraDePesquisa.getText());
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByFirstLocal()
    {
        try
        {
            carList = carController.getByFirstLocal();
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarBySecondLocal()
    {
        try
        {
            carList = carController.getBySecondLocal();
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
        
    private void fetchCarByThirdLocal()
    {
        try
        {
            carList = carController.getByThirdLocal();
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    private void fetchCarByFourthLocal()
    {
        try
        {
            carList = carController.getByFourthLocal();
            checkResult(carList);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
}
