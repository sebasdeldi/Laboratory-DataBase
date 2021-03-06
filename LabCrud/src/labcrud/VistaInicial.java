/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcrud;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARITO
 */
public class VistaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicial
     */
    public VistaInicial() throws Exception {
        initComponents();
        Funciones f = new Funciones();
        f.conectarse();
        
        
        String select = "select * from solicitud order by estado;";
        f.poblarTabla(select,VistaInicial.getTabla());   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bevelBorder1 = (javax.swing.border.BevelBorder)javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED);
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pendientesBtn = new javax.swing.JButton();
        listosBtn = new javax.swing.JButton();
        promedioBtn = new javax.swing.JButton();
        masBtn = new javax.swing.JButton();
        todasBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        irAClientes = new javax.swing.JButton();
        ExamenesBtn = new javax.swing.JButton();
        InventarioBtn = new javax.swing.JButton();
        solicitudesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pendientesBtn.setText("Pendientes");
        pendientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendientesBtnActionPerformed(evt);
            }
        });

        listosBtn.setText("Listas");
        listosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listosBtnActionPerformed(evt);
            }
        });

        promedioBtn.setText("Promedio");
        promedioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioBtnActionPerformed(evt);
            }
        });

        masBtn.setText("Más de 2");
        masBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBtnActionPerformed(evt);
            }
        });

        todasBtn.setText("Todas");
        todasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(promedioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(masBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pendientesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(todasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(todasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(promedioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ir a:"));

        irAClientes.setText("Clientes");
        irAClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAClientesActionPerformed(evt);
            }
        });

        ExamenesBtn.setText("Examenes");
        ExamenesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamenesBtnActionPerformed(evt);
            }
        });

        InventarioBtn.setText("Inventario");
        InventarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioBtnActionPerformed(evt);
            }
        });

        solicitudesBtn.setText("Solicitudes");
        solicitudesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(irAClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(104, 104, 104)
                        .addComponent(ExamenesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(103, 103, 103)
                        .addComponent(InventarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(solicitudesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(irAClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExamenesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InventarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitudesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void irAClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAClientesActionPerformed
        // TODO add your handling code here:
        Funciones f = new Funciones();
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        String select = "SELECT * FROM cliente;";
        f.poblarTabla(select,Clientes.getTabla());
    }//GEN-LAST:event_irAClientesActionPerformed

    private void InventarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioBtnActionPerformed
        // TODO add your handling code here:
        
        

        Inventario inventario = null;
        try {
            inventario = new Inventario();
            Funciones f = new Funciones();
            String select = "SELECT * FROM inventario;";
            f.poblarTabla(select,Inventario.getTabla());
        } 
        
        catch (Exception ex) {
            Logger.getLogger(VistaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        inventario.setVisible(true);
    }//GEN-LAST:event_InventarioBtnActionPerformed

    private void solicitudesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesBtnActionPerformed
        // TODO add your handling code here: 
        Funciones f = new Funciones();
        
        Solicitudes s = new Solicitudes();
        s.setVisible(true);
        
        String select = "SELECT * FROM solicitud;";
        f.poblarTabla(select,Solicitudes.getTabla());
        
    }//GEN-LAST:event_solicitudesBtnActionPerformed

    private void ExamenesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamenesBtnActionPerformed
        // TODO add your handling code here:
        Examenes e = new Examenes();
        e.setVisible(true);
        
    }//GEN-LAST:event_ExamenesBtnActionPerformed

    private void pendientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendientesBtnActionPerformed
       // TODO add your handling code here:
       Funciones f = new Funciones();
       String select = "select * from solicitud where estado = 'pendiente';";
       f.poblarTabla(select,VistaInicial.getTabla());
    }//GEN-LAST:event_pendientesBtnActionPerformed

    private void listosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listosBtnActionPerformed
        // TODO add your handling code here:
       Funciones f = new Funciones();
       String select = "select * from solicitud where estado = 'listo';";
       f.poblarTabla(select,VistaInicial.getTabla());
    }//GEN-LAST:event_listosBtnActionPerformed

    private void promedioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioBtnActionPerformed
        // TODO add your handling code here:
        Funciones f = new Funciones ();
        String select = "select avg(numExams)\n" +
        "from (select solicitud_id_solicitud,count(id_examen) as numExams\n" +
        "from examenes\n" +
        "group by solicitud_id_solicitud) t";
        f.poblarTabla(select,VistaInicial.getTabla());
    }//GEN-LAST:event_promedioBtnActionPerformed

    private void masBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBtnActionPerformed
        // TODO add your handling code here:
        Funciones f = new Funciones ();
        String select = "select solicitud_id_solicitud,count(id_examen) as numExams\n" +
        "from examenes\n" +
        "group by solicitud_id_solicitud\n" +
        "having count(id_examen)>2";
        f.poblarTabla(select,VistaInicial.getTabla());
    }//GEN-LAST:event_masBtnActionPerformed

    private void todasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todasBtnActionPerformed
        // TODO add your handling code here:
        Funciones f = new Funciones ();
        String select = "select * from solicitud order by estado;";
        f.poblarTabla(select,VistaInicial.getTabla()); 
    }//GEN-LAST:event_todasBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VistaInicial().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(VistaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }
    
     public static javax.swing.JTable getTabla (){
        
        return jTable1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExamenesBtn;
    private javax.swing.JButton InventarioBtn;
    private javax.swing.border.BevelBorder bevelBorder1;
    private javax.swing.JButton irAClientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JButton listosBtn;
    private javax.swing.JButton masBtn;
    private javax.swing.JButton pendientesBtn;
    private javax.swing.JButton promedioBtn;
    private javax.swing.JButton solicitudesBtn;
    private javax.swing.JButton todasBtn;
    // End of variables declaration//GEN-END:variables
}
