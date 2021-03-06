package view;

import conexao.ConexaoMysql;
import conexao.ConexaoSQLite;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {

        initComponents();

        Buscar_NomeCompleto();
        Buscar_Telefone();
        Buscar_Email();
        Buscar_Idade();

        setIcon();

        setColor(btn_home);
        ind_home.setOpaque(true);
        MenuSettings.setVisible(false);
        MenuSettings.setEnabled(false);

        MenuUser.setVisible(false);
        MenuUser.setEnabled(false);

        MenuCalender.setVisible(false);
        MenuCalender.setEnabled(false);

        MenuSafe.setVisible(false);
        MenuSafe.setEnabled(false);

        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        DataCalender.setText(formatador.format(data));
        
        Timer time  = new Timer(1000, new hora());
        time.start();
        

    }

    private void Buscar_NomeCompleto() {

        ConexaoMysql conexao = new ConexaoMysql();

        conexao.conectar();

        ResultSet resultSQL = null;

        PreparedStatement comandoSQL = null;

        String insertSQL = "select NomeCompleto from Usuario;";

        try {

            comandoSQL = conexao.criarPreparedStatement(insertSQL);
            resultSQL = comandoSQL.executeQuery();
            while (resultSQL.next()) {
                txtNomeCompleto.setText(resultSQL.getString("NomeCompleto"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    private void Buscar_Telefone() {

        ConexaoMysql conexao = new ConexaoMysql();

        conexao.conectar();

        ResultSet resultSQL = null;

        PreparedStatement comandoSQL = null;

        String insertSQL = "select Telefone from Usuario;";

        try {

            comandoSQL = conexao.criarPreparedStatement(insertSQL);
            resultSQL = comandoSQL.executeQuery();
            while (resultSQL.next()) {
                txtTelefoneUser.setText(resultSQL.getString("Telefone"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    private void Buscar_Email() {

        ConexaoMysql conexao = new ConexaoMysql();

        conexao.conectar();

        ResultSet resultSQL = null;

        PreparedStatement comandoSQL = null;

        String insertSQL = "select Email from Usuario;";

        try {

            comandoSQL = conexao.criarPreparedStatement(insertSQL);
            resultSQL = comandoSQL.executeQuery();
            while (resultSQL.next()) {
                txtEmailUser.setText(resultSQL.getString("Email"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    private void Buscar_Idade() {

        ConexaoMysql conexao = new ConexaoMysql();

        conexao.conectar();

        ResultSet resultSQL = null;

        PreparedStatement comandoSQL = null;

        String insertSQL = "select Idade from Usuario;";

        try {

            comandoSQL = conexao.criarPreparedStatement(insertSQL);
            resultSQL = comandoSQL.executeQuery();
            while (resultSQL.next()) {
                txtIdadeUser.setText(resultSQL.getString("Idade") + " Years");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }

    }

    public void setIcon() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/IconPlanet.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        ind_home = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_productsP = new javax.swing.JPanel();
        ind_products = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_customersP = new javax.swing.JPanel();
        ind_customers = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_EmployeesP = new javax.swing.JPanel();
        ind_employees = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_servicesP = new javax.swing.JPanel();
        ind_services = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btn_salesP = new javax.swing.JPanel();
        ind_sales = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btn_spendingP = new javax.swing.JPanel();
        ind_spending = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btn_scheduleP = new javax.swing.JPanel();
        ind_schedule = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_User = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Settings = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        btn_records = new javax.swing.JPanel();
        ind_records = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        MenuSafe = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MenuCalender = new javax.swing.JPanel();
        HoraCalender = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        DataCalender = new javax.swing.JLabel();
        MenuUser = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtIdadeUser = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JLabel();
        txtNomeDeUsuario = new javax.swing.JLabel();
        txtTelefoneUser = new javax.swing.JLabel();
        txtEmailUser = new javax.swing.JLabel();
        MenuSettings = new javax.swing.JPanel();
        btn_MenuExit = new javax.swing.JLabel();
        btn_MenuSwitchUsers = new javax.swing.JLabel();
        btn_MenuReset = new javax.swing.JLabel();
        MenuApresentacao = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Intermedix");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(23, 35, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_home.setBackground(new java.awt.Color(23, 35, 51));
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });

        ind_home.setOpaque(false);
        ind_home.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_homeLayout = new javax.swing.GroupLayout(ind_home);
        ind_home.setLayout(ind_homeLayout);
        ind_homeLayout.setHorizontalGroup(
            ind_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_homeLayout.setVerticalGroup(
            ind_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Home");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addComponent(ind_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addComponent(ind_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, -1));

        btn_productsP.setBackground(new java.awt.Color(23, 35, 51));
        btn_productsP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_productsP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_productsPMouseReleased(evt);
            }
        });

        ind_products.setOpaque(false);
        ind_products.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_productsLayout = new javax.swing.GroupLayout(ind_products);
        ind_products.setLayout(ind_productsLayout);
        ind_productsLayout.setHorizontalGroup(
            ind_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_productsLayout.setVerticalGroup(
            ind_productsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Products");

        javax.swing.GroupLayout btn_productsPLayout = new javax.swing.GroupLayout(btn_productsP);
        btn_productsP.setLayout(btn_productsPLayout);
        btn_productsPLayout.setHorizontalGroup(
            btn_productsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_productsPLayout.createSequentialGroup()
                .addComponent(ind_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        btn_productsPLayout.setVerticalGroup(
            btn_productsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_productsPLayout.createSequentialGroup()
                .addComponent(ind_products, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_productsPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_productsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, -1));

        btn_customersP.setBackground(new java.awt.Color(23, 35, 51));
        btn_customersP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_customersP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customersPMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_customersPMouseReleased(evt);
            }
        });

        ind_customers.setOpaque(false);
        ind_customers.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_customersLayout = new javax.swing.GroupLayout(ind_customers);
        ind_customers.setLayout(ind_customersLayout);
        ind_customersLayout.setHorizontalGroup(
            ind_customersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_customersLayout.setVerticalGroup(
            ind_customersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Customers");

        javax.swing.GroupLayout btn_customersPLayout = new javax.swing.GroupLayout(btn_customersP);
        btn_customersP.setLayout(btn_customersPLayout);
        btn_customersPLayout.setHorizontalGroup(
            btn_customersPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_customersPLayout.createSequentialGroup()
                .addComponent(ind_customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        btn_customersPLayout.setVerticalGroup(
            btn_customersPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_customersPLayout.createSequentialGroup()
                .addComponent(ind_customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_customersPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_customersP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        btn_EmployeesP.setBackground(new java.awt.Color(23, 35, 51));
        btn_EmployeesP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EmployeesP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_EmployeesPMouseReleased(evt);
            }
        });

        ind_employees.setOpaque(false);
        ind_employees.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_employeesLayout = new javax.swing.GroupLayout(ind_employees);
        ind_employees.setLayout(ind_employeesLayout);
        ind_employeesLayout.setHorizontalGroup(
            ind_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_employeesLayout.setVerticalGroup(
            ind_employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Employees");

        javax.swing.GroupLayout btn_EmployeesPLayout = new javax.swing.GroupLayout(btn_EmployeesP);
        btn_EmployeesP.setLayout(btn_EmployeesPLayout);
        btn_EmployeesPLayout.setHorizontalGroup(
            btn_EmployeesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EmployeesPLayout.createSequentialGroup()
                .addComponent(ind_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel18)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        btn_EmployeesPLayout.setVerticalGroup(
            btn_EmployeesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EmployeesPLayout.createSequentialGroup()
                .addComponent(ind_employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_EmployeesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_EmployeesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, -1));

        btn_servicesP.setBackground(new java.awt.Color(23, 35, 51));
        btn_servicesP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_servicesP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_servicesPMouseReleased(evt);
            }
        });

        ind_services.setOpaque(false);
        ind_services.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_servicesLayout = new javax.swing.GroupLayout(ind_services);
        ind_services.setLayout(ind_servicesLayout);
        ind_servicesLayout.setHorizontalGroup(
            ind_servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_servicesLayout.setVerticalGroup(
            ind_servicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Services");

        javax.swing.GroupLayout btn_servicesPLayout = new javax.swing.GroupLayout(btn_servicesP);
        btn_servicesP.setLayout(btn_servicesPLayout);
        btn_servicesPLayout.setHorizontalGroup(
            btn_servicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_servicesPLayout.createSequentialGroup()
                .addComponent(ind_services, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel19)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        btn_servicesPLayout.setVerticalGroup(
            btn_servicesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_servicesPLayout.createSequentialGroup()
                .addComponent(ind_services, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_servicesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_servicesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, -1));

        btn_salesP.setBackground(new java.awt.Color(23, 35, 51));
        btn_salesP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salesP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_salesPMouseReleased(evt);
            }
        });

        ind_sales.setOpaque(false);
        ind_sales.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_salesLayout = new javax.swing.GroupLayout(ind_sales);
        ind_sales.setLayout(ind_salesLayout);
        ind_salesLayout.setHorizontalGroup(
            ind_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_salesLayout.setVerticalGroup(
            ind_salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Sales");

        javax.swing.GroupLayout btn_salesPLayout = new javax.swing.GroupLayout(btn_salesP);
        btn_salesP.setLayout(btn_salesPLayout);
        btn_salesPLayout.setHorizontalGroup(
            btn_salesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_salesPLayout.createSequentialGroup()
                .addComponent(ind_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel21)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        btn_salesPLayout.setVerticalGroup(
            btn_salesPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_salesPLayout.createSequentialGroup()
                .addComponent(ind_sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_salesPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_salesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 40));

        btn_spendingP.setBackground(new java.awt.Color(23, 35, 51));
        btn_spendingP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_spendingP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_spendingPMouseReleased(evt);
            }
        });

        ind_spending.setOpaque(false);
        ind_spending.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_spendingLayout = new javax.swing.GroupLayout(ind_spending);
        ind_spending.setLayout(ind_spendingLayout);
        ind_spendingLayout.setHorizontalGroup(
            ind_spendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_spendingLayout.setVerticalGroup(
            ind_spendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Spending");

        javax.swing.GroupLayout btn_spendingPLayout = new javax.swing.GroupLayout(btn_spendingP);
        btn_spendingP.setLayout(btn_spendingPLayout);
        btn_spendingPLayout.setHorizontalGroup(
            btn_spendingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_spendingPLayout.createSequentialGroup()
                .addComponent(ind_spending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        btn_spendingPLayout.setVerticalGroup(
            btn_spendingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_spendingPLayout.createSequentialGroup()
                .addComponent(ind_spending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_spendingPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_spendingP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, -1));

        btn_scheduleP.setBackground(new java.awt.Color(23, 35, 51));
        btn_scheduleP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_scheduleP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_schedulePMouseReleased(evt);
            }
        });

        ind_schedule.setOpaque(false);
        ind_schedule.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_scheduleLayout = new javax.swing.GroupLayout(ind_schedule);
        ind_schedule.setLayout(ind_scheduleLayout);
        ind_scheduleLayout.setHorizontalGroup(
            ind_scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_scheduleLayout.setVerticalGroup(
            ind_scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Schedule");

        javax.swing.GroupLayout btn_schedulePLayout = new javax.swing.GroupLayout(btn_scheduleP);
        btn_scheduleP.setLayout(btn_schedulePLayout);
        btn_schedulePLayout.setHorizontalGroup(
            btn_schedulePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_schedulePLayout.createSequentialGroup()
                .addComponent(ind_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        btn_schedulePLayout.setVerticalGroup(
            btn_schedulePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_schedulePLayout.createSequentialGroup()
                .addComponent(ind_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_schedulePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(btn_scheduleP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 140, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 590));

        Menu2.setBackground(new java.awt.Color(71, 120, 197));
        Menu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Menu2MouseDragged(evt);
            }
        });
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(123, 156, 225));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setPreferredSize(new java.awt.Dimension(2, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSearch.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap(737, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 940, 50));

        Menu3.setBackground(new java.awt.Color(192, 192, 192));
        Menu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(23, 35, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(71, 120, 197));

        btn_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconUser.png"))); // NOI18N
        btn_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_UserMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconCalendar.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconLock.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        btn_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSettings.png"))); // NOI18N
        btn_Settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SettingsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_Settings)
                .addGap(45, 45, 45)
                .addComponent(btn_User)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(39, 39, 39))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 310, 130));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconExit.png"))); // NOI18N
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        jPanel4.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 46));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconPlanetSmall.png"))); // NOI18N
        jLabel2.setText("  ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        lblNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("User");
        jPanel4.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

        Menu3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_records.setBackground(new java.awt.Color(23, 35, 51));
        btn_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_recordsMouseReleased(evt);
            }
        });

        ind_records.setOpaque(false);
        ind_records.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_recordsLayout = new javax.swing.GroupLayout(ind_records);
        ind_records.setLayout(ind_recordsLayout);
        ind_recordsLayout.setHorizontalGroup(
            ind_recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_recordsLayout.setVerticalGroup(
            ind_recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Records");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_recordsLayout = new javax.swing.GroupLayout(btn_records);
        btn_records.setLayout(btn_recordsLayout);
        btn_recordsLayout.setHorizontalGroup(
            btn_recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_recordsLayout.createSequentialGroup()
                .addComponent(ind_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel14)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        btn_recordsLayout.setVerticalGroup(
            btn_recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_recordsLayout.createSequentialGroup()
                .addComponent(ind_records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_recordsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu3.add(btn_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 269, -1, -1));

        MenuSafe.setBackground(new java.awt.Color(255, 255, 255));
        MenuSafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuSafeMousePressed(evt);
            }
        });
        MenuSafe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("<html><center>Totally safe and protected, <br>we guarantee every possible </br><br><center>security</center></br></center></html>");
        MenuSafe.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconPadLock.png"))); // NOI18N
        MenuSafe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 70, 50));

        Menu3.add(MenuSafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, 270, 173));

        MenuCalender.setBackground(new java.awt.Color(255, 255, 255));
        MenuCalender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuCalenderMousePressed(evt);
            }
        });
        MenuCalender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HoraCalender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HoraCalender.setText("Hora");
        MenuCalender.add(HoraCalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Current date and time");
        MenuCalender.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        DataCalender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DataCalender.setText("Data");
        MenuCalender.add(DataCalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        Menu3.add(MenuCalender, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, 270, 173));

        MenuUser.setBackground(new java.awt.Color(255, 255, 255));
        MenuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuUserMousePressed(evt);
            }
        });
        MenuUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Information About Such");
        MenuUser.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtIdadeUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtIdadeUser.setText("Idade");
        MenuUser.add(txtIdadeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeCompleto.setText("NomeCompleto");
        MenuUser.add(txtNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtNomeDeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNomeDeUsuario.setText("Nome De Usuario");
        MenuUser.add(txtNomeDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtTelefoneUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTelefoneUser.setText("Telefone");
        MenuUser.add(txtTelefoneUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtEmailUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmailUser.setText("Email");
        MenuUser.add(txtEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Menu3.add(MenuUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, 270, 173));

        MenuSettings.setBackground(new java.awt.Color(255, 255, 255));

        btn_MenuExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconLogout.png"))); // NOI18N
        btn_MenuExit.setText(" Exit");
        btn_MenuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_MenuExitMousePressed(evt);
            }
        });

        btn_MenuSwitchUsers.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_MenuSwitchUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconPeople.png"))); // NOI18N
        btn_MenuSwitchUsers.setText(" Switch Users");
        btn_MenuSwitchUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MenuSwitchUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_MenuSwitchUsersMousePressed(evt);
            }
        });

        btn_MenuReset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_MenuReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconStreamline.png"))); // NOI18N
        btn_MenuReset.setText(" Reset All");
        btn_MenuReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MenuReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuSettingsLayout = new javax.swing.GroupLayout(MenuSettings);
        MenuSettings.setLayout(MenuSettingsLayout);
        MenuSettingsLayout.setHorizontalGroup(
            MenuSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_MenuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MenuSwitchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MenuReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        MenuSettingsLayout.setVerticalGroup(
            MenuSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSettingsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_MenuExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_MenuSwitchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_MenuReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Menu3.add(MenuSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 345, -1, -1));

        getContentPane().add(Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 310, 540));

        MenuApresentacao.setBackground(new java.awt.Color(255, 255, 255));
        MenuApresentacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconWebSite.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Web Site");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(44, 44, 44))
        );

        MenuApresentacao.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 173, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconSuport.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("   Suport");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(47, 47, 47))
        );

        MenuApresentacao.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 160, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconLinkedIn.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setText("       LinkedIn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(46, 46, 46))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(50, 50, 50))
        );

        MenuApresentacao.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 160, 200));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconGitHub.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("      GitHub");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(39, 39, 39))
        );

        MenuApresentacao.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconMenu.jpg"))); // NOI18N
        MenuApresentacao.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        getContentPane().add(MenuApresentacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 630, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int xx, xy;

    TelaCadastroCustomers customers = new TelaCadastroCustomers();
    TelaCadastroProducts products = new TelaCadastroProducts();
    TelaCadastroEmployees employees = new TelaCadastroEmployees();
    TelaCadastroServices services = new TelaCadastroServices();
    TelaCadastroSales sales = new TelaCadastroSales();
    TelaCadastroSpending spending = new TelaCadastroSpending();
    TelaCadastroSchedule schedule = new TelaCadastroSchedule();

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed

    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_productsPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsPMouseReleased

        setColor(btn_productsP);
        ind_products.setOpaque(true);
        resetColor(new JPanel[]{btn_customersP, btn_EmployeesP, btn_servicesP, btn_records, btn_salesP, btn_spendingP, btn_scheduleP}, new JPanel[]{ind_customers, ind_employees, ind_services, ind_records, ind_spending, ind_sales, ind_schedule});

        customers.setVisible(false);

        products.setVisible(true);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_productsPMouseReleased

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed

        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_Menu2MousePressed

    private void Menu2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_Menu2MouseDragged

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed

        System.exit(0);

    }//GEN-LAST:event_btn_exitMousePressed

    private void btn_customersPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customersPMouseReleased

        setColor(btn_customersP);
        ind_customers.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_EmployeesP, btn_servicesP, btn_records, btn_salesP, btn_spendingP, btn_scheduleP}, new JPanel[]{ind_products, ind_employees, ind_services, ind_records, ind_spending, ind_sales, ind_schedule});

        customers.setVisible(true);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_customersPMouseReleased

    private void btn_EmployeesPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EmployeesPMouseReleased

        setColor(btn_EmployeesP);
        ind_employees.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_customersP, btn_servicesP, btn_records, btn_salesP, btn_spendingP, btn_scheduleP}, new JPanel[]{ind_products, ind_customers, ind_services, ind_records, ind_spending, ind_sales, ind_schedule});

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(true);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_EmployeesPMouseReleased

    private void btn_servicesPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicesPMouseReleased

        setColor(btn_servicesP);
        ind_services.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_EmployeesP, btn_customersP, btn_records, btn_salesP, btn_spendingP, btn_scheduleP}, new JPanel[]{ind_products, ind_employees, ind_customers, ind_records, ind_spending, ind_sales, ind_schedule});

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(true);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_servicesPMouseReleased

    private void btn_recordsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_recordsMouseReleased

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_recordsMouseReleased

    private void btn_salesPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salesPMouseReleased

        setColor(btn_salesP);
        ind_sales.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_customersP, btn_servicesP, btn_EmployeesP, btn_records, btn_spendingP, btn_scheduleP}, new JPanel[]{ind_products, ind_customers, ind_services, ind_employees, ind_records, ind_spending, ind_schedule});

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(true);

        spending.setVisible(false);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_salesPMouseReleased

    private void btn_spendingPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_spendingPMouseReleased

        setColor(btn_spendingP);
        ind_spending.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_customersP, btn_servicesP, btn_records, btn_EmployeesP, btn_salesP, btn_scheduleP}, new JPanel[]{ind_products, ind_customers, ind_services, ind_records, ind_employees, ind_sales, ind_schedule});

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(true);

        schedule.setVisible(false);
    }//GEN-LAST:event_btn_spendingPMouseReleased

    private void btn_SettingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SettingsMousePressed

        MenuSettings.setVisible(true);
        MenuSettings.setEnabled(true);

        MenuUser.setVisible(false);
        MenuUser.setEnabled(false);

        MenuCalender.setVisible(false);
        MenuCalender.setEnabled(false);

        MenuSafe.setVisible(false);
        MenuSafe.setEnabled(false);

    }//GEN-LAST:event_btn_SettingsMousePressed

    private void btn_UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMousePressed

        MenuSettings.setVisible(false);
        MenuSettings.setEnabled(false);

        MenuUser.setVisible(true);
        MenuUser.setEnabled(true);

        MenuCalender.setVisible(false);
        MenuCalender.setEnabled(false);

        MenuSafe.setVisible(false);
        MenuSafe.setEnabled(false);

    }//GEN-LAST:event_btn_UserMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        MenuSettings.setVisible(false);
        MenuSettings.setEnabled(false);

        MenuUser.setVisible(false);
        MenuUser.setEnabled(false);

        MenuCalender.setVisible(true);
        MenuCalender.setEnabled(true);

        MenuSafe.setVisible(false);
        MenuSafe.setEnabled(false);

        Calendar dataa = Calendar.getInstance();
        int horas = dataa.get(Calendar.HOUR_OF_DAY);
        int minutos = dataa.get(Calendar.MINUTE);
        int segundos = dataa.get(Calendar.SECOND);

        HoraCalender.setText(horas + ":" + minutos + ":" + segundos);

    }//GEN-LAST:event_jLabel3MousePressed

    private void btn_schedulePMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_schedulePMouseReleased

        setColor(btn_scheduleP);
        ind_schedule.setOpaque(true);
        resetColor(new JPanel[]{btn_productsP, btn_customersP, btn_servicesP, btn_EmployeesP, btn_records, btn_salesP, btn_spendingP}, new JPanel[]{ind_products, ind_customers, ind_services, ind_records, ind_employees, ind_sales, ind_spending});

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(true);
    }//GEN-LAST:event_btn_schedulePMouseReleased

    private void btn_MenuExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuExitMousePressed

        System.exit(0);

    }//GEN-LAST:event_btn_MenuExitMousePressed

    private void btn_MenuSwitchUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuSwitchUsersMousePressed

        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_MenuSwitchUsersMousePressed

    private void MenuUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUserMousePressed

    }//GEN-LAST:event_MenuUserMousePressed

    private void MenuCalenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCalenderMousePressed

    }//GEN-LAST:event_MenuCalenderMousePressed

    private void MenuSafeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSafeMousePressed

    }//GEN-LAST:event_MenuSafeMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed

        MenuSettings.setVisible(false);
        MenuSettings.setEnabled(false);

        MenuUser.setVisible(false);
        MenuUser.setEnabled(false);

        MenuSafe.setVisible(true);
        MenuSafe.setEnabled(true);

    }//GEN-LAST:event_jLabel4MousePressed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        try {
            URI link = new URI("www.xvideos.com");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed

        try {
            URI link = new URI("www.github.com/PauloHNDS");
            URI link2 = new URI("www.github.com/VitorBusnardo");
            Desktop.getDesktop().browse(link);
            Desktop.getDesktop().browse(link2);
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed

        try {
            URI link = new URI("www.youtube.com/?gl=BR");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed

        try {
            URI link = new URI("www.pornodoido.com/");
            Desktop.getDesktop().browse(link);
        } catch (Exception erro) {
            System.out.println(erro);
        }

    }//GEN-LAST:event_jPanel6MousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        TelaPrincipal principal = new TelaPrincipal();
        TelaRegistros registros = new TelaRegistros();

        registros.lblNomeDeUsuarioRegistro.setText(lblNomeUsuario.getText());

        customers.setVisible(false);

        products.setVisible(false);

        employees.setVisible(false);

        services.setVisible(false);

        sales.setVisible(false);

        spending.setVisible(false);

        schedule.setVisible(false);

        registros.setVisible(true);

        registros.criaGrafico();

        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btn_customersPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customersPMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_customersPMouseClicked

    private void btn_MenuResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuResetMouseClicked

        TelaDelete delete = new TelaDelete();
        delete.setVisible(true);

    }//GEN-LAST:event_btn_MenuResetMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {

        pane.setBackground(new Color(41, 57, 80));

    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {

        for (int i = 0; i < pane.length; i++) {

            pane[i].setBackground(new Color(23, 35, 51));

        }
        for (int i = 0; i < indicators.length; i++) {

            indicators[i].setOpaque(false);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataCalender;
    private javax.swing.JLabel HoraCalender;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Menu2;
    private javax.swing.JPanel Menu3;
    private javax.swing.JPanel MenuApresentacao;
    private javax.swing.JPanel MenuCalender;
    private javax.swing.JPanel MenuSafe;
    private javax.swing.JPanel MenuSettings;
    private javax.swing.JPanel MenuUser;
    private javax.swing.JPanel btn_EmployeesP;
    private javax.swing.JLabel btn_MenuExit;
    private javax.swing.JLabel btn_MenuReset;
    private javax.swing.JLabel btn_MenuSwitchUsers;
    private javax.swing.JLabel btn_Settings;
    private javax.swing.JLabel btn_User;
    private javax.swing.JPanel btn_customersP;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_productsP;
    private javax.swing.JPanel btn_records;
    private javax.swing.JPanel btn_salesP;
    private javax.swing.JPanel btn_scheduleP;
    private javax.swing.JPanel btn_servicesP;
    private javax.swing.JPanel btn_spendingP;
    private javax.swing.JPanel ind_customers;
    private javax.swing.JPanel ind_employees;
    private javax.swing.JPanel ind_home;
    private javax.swing.JPanel ind_products;
    private javax.swing.JPanel ind_records;
    private javax.swing.JPanel ind_sales;
    private javax.swing.JPanel ind_schedule;
    private javax.swing.JPanel ind_services;
    private javax.swing.JPanel ind_spending;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel txtEmailUser;
    private javax.swing.JLabel txtIdadeUser;
    private javax.swing.JLabel txtNomeCompleto;
    public javax.swing.JLabel txtNomeDeUsuario;
    private javax.swing.JLabel txtTelefoneUser;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {
    
    
    public void actionPerformed(ActionEvent e) {
    
    Calendar now = Calendar.getInstance();
    
    HoraCalender.setText(String.format("%1$tH:%1$tM:%1$tS", now));
    
    
    }
    
    }





}
