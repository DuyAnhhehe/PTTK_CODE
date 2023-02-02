/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package huce.View;

import huce.Model.ApplyPanel;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class WarehousePanel extends javax.swing.JPanel {
    /**
     * Creates new form WarehousePanel
     */
    public static OptionImportPanel helloPanel;
    public WarehousePanel() {
        initComponents();
        helloPanel = new OptionImportPanel(this.jMainPanel);
        this.addImportBtnListener( (e) -> {
            ApplyPanel.apply(this.jMainPanel, helloPanel);
        } );
        this.addRequestBtnListener((e) -> {
            System.out.println("Hello");
            ApplyPanel.apply(this.jMainPanel, new ListRequestsPanel(this.jMainPanel));
        });
        this.addViewLocationBtnListener((e) -> {
            ApplyPanel.apply(this.jMainPanel, new LocationPanel());
        });
        this.addViewProductsBtnListener((e) -> {
            ApplyPanel.apply(this.jMainPanel, new ListProducts(this.jMainPanel));
        });
        this.jViewReport.addActionListener((e) -> {
            ApplyPanel.apply(this.jMainPanel, new Report());
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jImportBtn = new javax.swing.JButton();
        jViewProductsBtn = new javax.swing.JButton();
        jRequestBtn = new javax.swing.JButton();
        jLogoutBtn = new javax.swing.JButton();
        jViewLocationBtn = new javax.swing.JButton();
        jViewReport = new javax.swing.JButton();
        jMainPanel = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 51, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jImportBtn.setText("Nhập hàng");

        jViewProductsBtn.setText("Xem sản phẩm");

        jRequestBtn.setText("Xem yêu cầu xuất hàng");

        jLogoutBtn.setText("Đăng xuất");

        jViewLocationBtn.setText("Xem phân khu");

        jViewReport.setText("Thống kê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jViewProductsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jImportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRequestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jViewLocationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jViewReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jImportBtn)
                .addGap(18, 18, 18)
                .addComponent(jRequestBtn)
                .addGap(18, 18, 18)
                .addComponent(jViewProductsBtn)
                .addGap(18, 18, 18)
                .addComponent(jViewLocationBtn)
                .addGap(18, 18, 18)
                .addComponent(jViewReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jLogoutBtn)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jMainPanel.setLayout(new javax.swing.BoxLayout(jMainPanel, javax.swing.BoxLayout.X_AXIS));

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO OUR WAREHOUSE MANAGEMENT APPLICATION");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please choose one of the options on the left side to continue...");
        jPanel2.add(jLabel2);

        jMainPanel.add(jPanel2);

        add(jMainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void addLogoutListener(ActionListener actionListener) {
        this.jLogoutBtn.addActionListener(actionListener);
    }
    public void addRequestBtnListener(ActionListener actionListener) {
        this.jRequestBtn.addActionListener(actionListener);
    }

    public void addImportBtnListener(ActionListener actionListener) {
        this.jImportBtn.addActionListener(actionListener);
    }

    public void addViewProductsBtnListener(ActionListener actionListener) {
        this.jViewProductsBtn.addActionListener(actionListener);
    }
    public void addViewLocationBtnListener(ActionListener actionListener) {
        this.jViewLocationBtn.addActionListener(actionListener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jImportBtn;
    private javax.swing.JButton jLogoutBtn;
    public javax.swing.JPanel jMainPanel;
    private javax.swing.JButton jRequestBtn;
    private javax.swing.JButton jViewLocationBtn;
    private javax.swing.JButton jViewProductsBtn;
    private javax.swing.JButton jViewReport;
    // End of variables declaration//GEN-END:variables
}
