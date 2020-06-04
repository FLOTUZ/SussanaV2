package bajaAusentismo;

import VO_Y_DAO.DAO.AlumnoDAO;
import VO_Y_DAO.DAO.BajaAusentismoDAO;
import VO_Y_DAO.VO.AlumnoVO;
import VO_Y_DAO.VO.BajaAusentismoVO;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class BajaAusentismo extends javax.swing.JPanel {

    private List<AlumnoVO> listaAlumnos;
    private String fecha;
    private List<String> listaAusentismos;

    public BajaAusentismo() throws SQLException {
        initComponents();
        llenarCbx();

        //Se crea fecha
        Date date = new Date();
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        fecha = fechaFormat.format(date);
        listaAusentismos = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_posibleCausa = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_ResultadoInvestigación = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        cbx_alumno = new javax.swing.JComboBox<>();
        tf_docente = new javax.swing.JTextField();
        tf_asignatura = new javax.swing.JTextField();
        tf_clave = new javax.swing.JTextField();
        tf_fechas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_fechas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Baja por ausentismo");

        jLabel8.setText("Seleccionar alumno");

        jLabel2.setText("Docente que reporta");

        jLabel3.setText("Asignatura");

        jLabel4.setText("Clave");

        jLabel5.setText("Fechas de inasistencias (Ejemplo: aaaa-mm-dd)");

        jLabel6.setText("Posible causa (50 caracteres)");

        jLabel7.setText("Resultado de investigación (255 caracteres)");

        ta_posibleCausa.setColumns(20);
        ta_posibleCausa.setRows(5);
        jScrollPane2.setViewportView(ta_posibleCausa);

        ta_ResultadoInvestigación.setColumns(20);
        ta_ResultadoInvestigación.setRows(5);
        jScrollPane3.setViewportView(ta_ResultadoInvestigación);

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_imprimir.setText("Imprimir");

        cbx_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccione]" }));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_fechas.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Fechas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_docente)
                                    .addComponent(tf_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(tf_asignatura)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tf_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addContainerGap(210, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_imprimir)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbx_alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_imprimir))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 0123 4 56 7 89
        // 2020 - 06 - 04
        try {
            String aaaa = tf_fechas.getText().substring(0, 4);
            String mm = tf_fechas.getText().substring(5, 7);
            String dd = tf_fechas.getText().substring(8, 10);

            //Si el lbl_fechas no esta vacio
            if (!"".equals(lbl_fechas.getText())) {
                //Se agrega a la lista de ausentismos
                String ausentismo = aaaa + "-" + mm + "-" + dd;
                listaAusentismos.add(ausentismo);

                //concatena a nueva fecha
                lbl_fechas.setText(
                        lbl_fechas.getText() + ","
                        + aaaa + "-" + mm + "-" + dd);
            } else {
                //Se agrega a la lista de ausentismos
                String ausentismo = aaaa + "-" + mm + "-" + dd;
                listaAusentismos.add(ausentismo);
                //se pone en el label
                lbl_fechas.setText(aaaa + "-" + mm + "-" + dd);
            }
            //Se limpia el campo de texto
            tf_fechas.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha en el formato correcto");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (cbx_alumno.getSelectedIndex() == 0
                || tf_docente.getText() == ""
                || tf_asignatura.getText() == ""
                || tf_clave.getText() == ""
                || ta_posibleCausa.getText() == "") {
            JOptionPane.showMessageDialog(this, "Error: Verifique los campos"
                    + "\n[alumno, docente, asignatura, clave, posible causa y "
                    + "de haber asignado fechas de ausentismo]"
                    + "\nSon obligatorios");
        } else {
            try {
                BajaAusentismoVO bavo = new BajaAusentismoVO();
                bavo.setAlumno_idAlumno(cbx_alumno.getSelectedIndex());
                bavo.setFecha(fecha);
                bavo.setDocenteReporta(tf_docente.getText());
                bavo.setAsignatura(tf_asignatura.getText());
                bavo.setClave(Integer.parseInt(tf_clave.getText()));
                bavo.setPosibleCausa(ta_posibleCausa.getText());

                //Se crea el JSON para ingresar un arreglo a la BD
                Gson g = new Gson();
                String ausent = g.toJson(listaAusentismos);
                bavo.setFechasInasistencia(ausent);
                
                //Se fa de alta en la BD
                Connection con = new Conector.Conector().conectarMySQL();
                BajaAusentismoDAO badao = new BajaAusentismoDAO(con);
                badao.altaBajaAusentismo(bavo);
                con.close();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Verifique los campos (clave es int)");
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JComboBox<String> cbx_alumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_fechas;
    private javax.swing.JTextArea ta_ResultadoInvestigación;
    private javax.swing.JTextArea ta_posibleCausa;
    private javax.swing.JTextField tf_asignatura;
    private javax.swing.JTextField tf_clave;
    private javax.swing.JTextField tf_docente;
    private javax.swing.JTextField tf_fechas;
    // End of variables declaration//GEN-END:variables

    private void llenarCbx() throws SQLException {
        //Conexion para trar alumnos de la BD
        Connection con = new Conector.Conector().conectarMySQL();
        AlumnoDAO adao = new AlumnoDAO(con);

        //Se llena la lista
        listaAlumnos = adao.consultaMasiva();

        for (AlumnoVO i : listaAlumnos) {
            cbx_alumno.addItem(i.getNombre() + " " + i.getApellidos() + " ");
        }
        con.close();
    }
}
