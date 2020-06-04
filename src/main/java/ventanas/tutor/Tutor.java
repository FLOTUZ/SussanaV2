
package ventanas.tutor;

import VO_Y_DAO.DAO.TutorDAO;
import VO_Y_DAO.VO.TutorVO;
import java.sql.Connection;

public class Tutor extends javax.swing.JPanel {

    public Tutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pn_agregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nueNombre = new javax.swing.JTextField();
        rf_nueApellido = new javax.swing.JTextField();
        rf_nueNC = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        pn_editar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        li_ediTutores = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_ediNombre = new javax.swing.JTextField();
        tf_ediApellidos = new javax.swing.JTextField();
        tf_ediNC = new javax.swing.JTextField();
        btn_ediAceptar = new javax.swing.JButton();
        btn_ediCancelar = new javax.swing.JButton();
        pn_buscar = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pn_eliminar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        li_eliTutores = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        tf_eliConfirmacion = new javax.swing.JTextField();
        btn_eliEliminar = new javax.swing.JButton();
        btn_eliCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo tutor");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("NC");

        btn_limpiar.setText("Limpiar");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_agregarLayout = new javax.swing.GroupLayout(pn_agregar);
        pn_agregar.setLayout(pn_agregarLayout);
        pn_agregarLayout.setHorizontalGroup(
            pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_agregarLayout.createSequentialGroup()
                        .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nueNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(rf_nueNC)
                            .addComponent(rf_nueApellido)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_agregarLayout.createSequentialGroup()
                                .addComponent(btn_limpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_aceptar)))))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        pn_agregarLayout.setVerticalGroup(
            pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nueNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rf_nueApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rf_nueNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_aceptar))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo tutor", pn_agregar);

        li_ediTutores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(li_ediTutores);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Editar tutor");

        jLabel7.setText("Nombre");

        jLabel8.setText("Apellidos");

        jLabel9.setText("Numero de control");

        btn_ediAceptar.setText("Aceptar");

        btn_ediCancelar.setText("Cancelar");

        javax.swing.GroupLayout pn_editarLayout = new javax.swing.GroupLayout(pn_editar);
        pn_editar.setLayout(pn_editarLayout);
        pn_editarLayout.setHorizontalGroup(
            pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pn_editarLayout.createSequentialGroup()
                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pn_editarLayout.createSequentialGroup()
                                    .addComponent(btn_ediAceptar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_ediCancelar))
                                .addGroup(pn_editarLayout.createSequentialGroup()
                                    .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_ediNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_ediApellidos)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_ediNC)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_editarLayout.setVerticalGroup(
            pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ediNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ediApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ediNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ediAceptar)
                    .addComponent(btn_ediCancelar))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar tutor", pn_editar);

        jButton1.setText("Buscar");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Tutor");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Resultados");

        jButton2.setText("Ver");

        javax.swing.GroupLayout pn_buscarLayout = new javax.swing.GroupLayout(pn_buscar);
        pn_buscar.setLayout(pn_buscarLayout);
        pn_buscarLayout.setHorizontalGroup(
            pn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pn_buscarLayout.createSequentialGroup()
                        .addGroup(pn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_buscarLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_buscarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        pn_buscarLayout.setVerticalGroup(
            pn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar tutor", pn_buscar);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Eliminar");

        li_eliTutores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(li_eliTutores);

        jLabel12.setText("Escriba en numero de control del tutor para CONFIRMAR la eliminación");

        btn_eliEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btn_eliEliminar.setText("Eliminar");

        btn_eliCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_eliCancelar.setForeground(new java.awt.Color(0, 204, 0));
        btn_eliCancelar.setText("Verificar");

        javax.swing.GroupLayout pn_eliminarLayout = new javax.swing.GroupLayout(pn_eliminar);
        pn_eliminar.setLayout(pn_eliminarLayout);
        pn_eliminarLayout.setHorizontalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_eliminarLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_eliminarLayout.createSequentialGroup()
                        .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_eliminarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pn_eliminarLayout.createSequentialGroup()
                                        .addComponent(btn_eliEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_eliCancelar))
                                    .addGroup(pn_eliminarLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_eliConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(192, 192, 192))))
        );
        pn_eliminarLayout.setVerticalGroup(
            pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_eliConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliEliminar)
                    .addComponent(btn_eliCancelar))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar tutor", pn_eliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        Connection con = new Conector.Conector().conectarMySQL();
        TutorVO tvo= new TutorVO();
        tvo.setNombre(tf_nueNombre.getText());
        tvo.setApellidos(rf_nueApellido.getText());
        tvo.setNC(Integer.parseInt(rf_nueNC.getText()));
        
        TutorDAO tdao =new TutorDAO(con);
        
        
        
        
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_ediAceptar;
    private javax.swing.JButton btn_ediCancelar;
    private javax.swing.JButton btn_eliCancelar;
    private javax.swing.JButton btn_eliEliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> li_ediTutores;
    private javax.swing.JList<String> li_eliTutores;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_buscar;
    private javax.swing.JPanel pn_editar;
    private javax.swing.JPanel pn_eliminar;
    private javax.swing.JTextField rf_nueApellido;
    private javax.swing.JTextField rf_nueNC;
    private javax.swing.JTextField tf_ediApellidos;
    private javax.swing.JTextField tf_ediNC;
    private javax.swing.JTextField tf_ediNombre;
    private javax.swing.JTextField tf_eliConfirmacion;
    private javax.swing.JTextField tf_nueNombre;
    // End of variables declaration//GEN-END:variables
}
