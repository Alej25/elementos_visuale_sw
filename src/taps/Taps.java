/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package taps;

/**
 *
 * @author jorge
 */
public class Taps extends javax.swing.JFrame {

    /**
     * Creates new form Taps
     */
    public Taps() {
        initComponents();
        miInitComponents();
    }
public void miInitComponents(){
 tapPrincipal.setEnabledAt(0,  false);
 tapPrincipal.setEnabledAt(1, false);
 tapPrincipal.setSelectedIndex(2);
 tapPrincipal.setEnabledAt(2, true);

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tapPrincipal = new javax.swing.JTabbedPane();
        tapDocente = new javax.swing.JPanel();
        cnbdocente = new javax.swing.JCheckBox();
        cbxDocente = new javax.swing.JComboBox<>();
        scrDescripcion = new javax.swing.JScrollPane();
        txtDescripccion = new javax.swing.JTextArea();
        txtDocente = new javax.swing.JTextField();
        tapAlumno = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        rdbcarrera = new javax.swing.JRadioButton();
        tapDirectivo = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tapDocente.setBackground(new java.awt.Color(204, 255, 255));
        tapDocente.setLayout(new java.awt.BorderLayout());

        cnbdocente.setText("jCheckBox1");
        cnbdocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnbdocenteActionPerformed(evt);
            }
        });
        tapDocente.add(cnbdocente, java.awt.BorderLayout.PAGE_END);

        cbxDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDocenteActionPerformed(evt);
            }
        });
        tapDocente.add(cbxDocente, java.awt.BorderLayout.PAGE_START);

        txtDescripccion.setColumns(20);
        txtDescripccion.setRows(5);
        scrDescripcion.setViewportView(txtDescripccion);

        tapDocente.add(scrDescripcion, java.awt.BorderLayout.LINE_END);

        txtDocente.setText("jTextField1");
        txtDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocenteActionPerformed(evt);
            }
        });
        tapDocente.add(txtDocente, java.awt.BorderLayout.CENTER);

        tapPrincipal.addTab("Docente", tapDocente);

        tapAlumno.setBackground(new java.awt.Color(204, 255, 204));

        btnMostrar.setText("Mostrar");
        tapAlumno.add(btnMostrar);

        txtcodigo.setColumns(20);
        txtcodigo.setText(" ");
        tapAlumno.add(txtcodigo);

        rdbcarrera.setText("IDS");
        tapAlumno.add(rdbcarrera);

        tapPrincipal.addTab("Alumno", tapAlumno);

        tapDirectivo.setBackground(new java.awt.Color(204, 204, 255));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tapDirectivoLayout = new javax.swing.GroupLayout(tapDirectivo);
        tapDirectivo.setLayout(tapDirectivoLayout);
        tapDirectivoLayout.setHorizontalGroup(
            tapDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tapDirectivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        tapDirectivoLayout.setVerticalGroup(
            tapDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tapDirectivoLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        tapPrincipal.addTab("Directivo", tapDirectivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tapPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tapPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnbdocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnbdocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnbdocenteActionPerformed

    private void txtDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocenteActionPerformed

    private void cbxDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDocenteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
 tapPrincipal.setEnabledAt(0, true);
        tapPrincipal.setSelectedIndex(0 );
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Taps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxDocente;
    private javax.swing.JCheckBox cnbdocente;
    private javax.swing.JRadioButton rdbcarrera;
    private javax.swing.JScrollPane scrDescripcion;
    private javax.swing.JPanel tapAlumno;
    private javax.swing.JPanel tapDirectivo;
    private javax.swing.JPanel tapDocente;
    private javax.swing.JTabbedPane tapPrincipal;
    private javax.swing.JTextArea txtDescripccion;
    private javax.swing.JTextField txtDocente;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
