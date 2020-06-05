package ventanas.tutor;

import VO_Y_DAO.DAO.TutorDAO;
import VO_Y_DAO.VO.TutorVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Tutor extends javax.swing.JPanel {

    private List<TutorVO> listaTutores;

    public Tutor() {
        initComponents();
        llenarListaTutores();
        llenarComponentes();

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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_nueNombre = new javax.swing.JTextField();
        tf_nueApellido = new javax.swing.JTextField();
        tf_nueNC = new javax.swing.JTextField();
        tf_nueDepa = new javax.swing.JTextField();
        tf_nuePuesto = new javax.swing.JTextField();
        tf_nueCorreo = new javax.swing.JTextField();
        tf_nueTelefono = new javax.swing.JTextField();
        tf_nueExt = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        pn_editar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        li_ediTutores = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf_ediNombre = new javax.swing.JTextField();
        tf_ediApellidos = new javax.swing.JTextField();
        tf_ediNC = new javax.swing.JTextField();
        tf_ediDepa = new javax.swing.JTextField();
        tf_ediPuesto = new javax.swing.JTextField();
        tf_ediCorreo = new javax.swing.JTextField();
        tf_ediTelefono = new javax.swing.JTextField();
        tf_ediExt = new javax.swing.JTextField();
        tf_ediIdTutor = new javax.swing.JTextField();
        btn_ediAceptar = new javax.swing.JButton();
        btn_ediEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tf_idPersona = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo tutor");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("NC");

        jLabel13.setText("Departamento");

        jLabel14.setText("Puesto");

        jLabel15.setText("Correo");

        jLabel16.setText("Telefono");

        jLabel17.setText("Extensión");

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

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
                        .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nueNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(tf_nueNC)
                            .addComponent(tf_nueApellido)
                            .addComponent(tf_nueDepa)
                            .addComponent(tf_nuePuesto)
                            .addComponent(tf_nueCorreo)
                            .addComponent(tf_nueTelefono)
                            .addComponent(tf_nueExt)))
                    .addGroup(pn_agregarLayout.createSequentialGroup()
                        .addComponent(btn_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_aceptar)))
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
                    .addComponent(tf_nueApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nueNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_nueDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_nuePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nueCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_nueTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_nueExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_aceptar))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo tutor", pn_agregar);

        li_ediTutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                li_ediTutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(li_ediTutores);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Editar tutor");

        jLabel7.setText("Nombre");

        jLabel8.setText("Apellidos");

        jLabel9.setText("Numero de control");

        jLabel18.setText("Departamento");

        jLabel19.setText("Puesto");

        jLabel20.setText("Correo");

        jLabel21.setText("Telefono");

        jLabel22.setText("Extensión");

        jLabel23.setText("IdPersona");

        jLabel24.setText("idTutor");

        tf_ediNombre.setEnabled(false);

        tf_ediApellidos.setEnabled(false);

        tf_ediNC.setEnabled(false);

        tf_ediDepa.setEnabled(false);

        tf_ediPuesto.setEnabled(false);

        tf_ediCorreo.setEnabled(false);

        tf_ediTelefono.setEnabled(false);

        tf_ediExt.setEnabled(false);

        tf_ediIdTutor.setEnabled(false);

        btn_ediAceptar.setText("Actualizar");
        btn_ediAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ediAceptarActionPerformed(evt);
            }
        });

        btn_ediEditar.setText("Editar");
        btn_ediEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ediEditarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tf_idPersona.setEnabled(false);

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
                            .addGroup(pn_editarLayout.createSequentialGroup()
                                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ediDepa)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_ediNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel21)
                                    .addComponent(tf_ediTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ediApellidos)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(jLabel19)
                                    .addComponent(tf_ediPuesto)
                                    .addComponent(jLabel22)
                                    .addComponent(tf_ediExt))
                                .addGap(18, 18, 18)
                                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20)
                                    .addComponent(tf_ediNC)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(tf_ediCorreo)
                                    .addGroup(pn_editarLayout.createSequentialGroup()
                                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_idPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGap(24, 24, 24)
                                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tf_ediIdTutor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(pn_editarLayout.createSequentialGroup()
                                .addComponent(btn_ediEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ediAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_editarLayout.setVerticalGroup(
            pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_editarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
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
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ediDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ediPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ediCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_editarLayout.createSequentialGroup()
                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ediTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ediExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_editarLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ediIdTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_idPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pn_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ediAceptar)
                    .addComponent(btn_ediEditar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar tutor", pn_editar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se deshabilitan los campos
        tf_ediNombre.setEnabled(false);
        tf_ediApellidos.setEnabled(false);
        tf_ediNC.setEnabled(false);
        tf_ediDepa.setEnabled(false);
        tf_ediPuesto.setEnabled(false);
        tf_ediCorreo.setEnabled(false);
        tf_ediTelefono.setEnabled(false);
        tf_ediExt.setEnabled(false);
        //Se vacian los campos
        tf_ediNombre.setText("");
        tf_ediApellidos.setText("");
        tf_ediNC.setText("");
        tf_ediDepa.setText("");
        tf_ediPuesto.setText("");
        tf_ediCorreo.setText("");
        tf_ediTelefono.setText("");
        tf_ediExt.setText("");
        tf_ediIdTutor.setText("");
        tf_idPersona.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ediEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ediEditarActionPerformed
        tf_ediNombre.setEnabled(true);
        tf_ediApellidos.setEnabled(true);
        tf_ediNC.setEnabled(true);
        tf_ediDepa.setEnabled(true);
        tf_ediPuesto.setEnabled(true);
        tf_ediCorreo.setEnabled(true);
        tf_ediTelefono.setEnabled(true);
        tf_ediExt.setEnabled(true);
    }//GEN-LAST:event_btn_ediEditarActionPerformed

    private void btn_ediAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ediAceptarActionPerformed
        try {
            Connection con = new Conector.Conector().conectarMySQL();
            TutorDAO tdao = new TutorDAO(con);

            TutorVO tuvo = new TutorVO();
            tuvo.setNombre(tf_ediNombre.getText());
            tuvo.setApellidos(tf_ediApellidos.getText());
            tuvo.setNC(Integer.parseInt(tf_ediNC.getText()));
            tuvo.setDepartamento(tf_ediDepa.getText());
            tuvo.setPuesto(tf_ediPuesto.getText());
            tuvo.setCorreo(tf_ediCorreo.getText());
            tuvo.setTelefono(Integer.parseInt(tf_ediTelefono.getText()));
            tuvo.setExtension(Integer.parseInt(tf_ediExt.getText()));
            tuvo.setIdTutor(Integer.parseInt(tf_ediIdTutor.getText()));
            tuvo.setIdPersona(Integer.parseInt(tf_idPersona.getText()));

            tdao.actualizarTutor(tuvo);

            con.close();
            llenarListaTutores();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error desde la clase Tutor.ediAcepatar()" + ex);
        }
    }//GEN-LAST:event_btn_ediAceptarActionPerformed

    private void li_ediTutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_li_ediTutoresMouseClicked
        //Se obtiene el indice seleccionado de la tabla
        int indice = li_ediTutores.getSelectedIndex();
        TutorVO selecc = listaTutores.get(indice);

        //Se llenan los campos con el indice de la tabla seleccionado
        tf_ediNombre.setText(selecc.getNombre());
        tf_ediApellidos.setText(selecc.getApellidos());
        tf_ediNC.setText(String.valueOf(selecc.getNC()));
        tf_ediDepa.setText(selecc.getDepartamento());
        tf_ediPuesto.setText(selecc.getPuesto());
        tf_ediCorreo.setText(selecc.getCorreo());
        tf_ediTelefono.setText(String.valueOf(selecc.getTelefono()));
        tf_ediExt.setText(String.valueOf((selecc.getExtension())));
        tf_idPersona.setText(String.valueOf(selecc.getIdPersona()));
        tf_ediIdTutor.setText(String.valueOf(selecc.getIdTutor()));
    }//GEN-LAST:event_li_ediTutoresMouseClicked

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        //Nuevo tutor
        try {
            Connection con = new Conector.Conector().conectarMySQL();
            TutorVO tvo = new TutorVO();
            tvo.setNombre(tf_nueNombre.getText());
            tvo.setApellidos(tf_nueApellido.getText());
            tvo.setNC(Integer.parseInt(tf_nueNC.getText()));
            tvo.setDepartamento(tf_nueDepa.getText());
            tvo.setPuesto(tf_nuePuesto.getText());
            tvo.setCorreo(tf_nueCorreo.getText());
            tvo.setTelefono(Integer.parseInt(tf_nueTelefono.getText()));
            tvo.setExtension(Integer.parseInt(tf_nueExt.getText()));

            TutorDAO tdao = new TutorDAO(con);
            tdao.altaTutor(tvo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error en Tutor.btn_acepatar()" + ex);
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        //Se vacian los campos
        tf_nueNombre.setText("");
        tf_nueApellido.setText("");
        tf_nueNC.setText("");
        tf_nueDepa.setText("");
        tf_nuePuesto.setText("");
        tf_nueCorreo.setText("");
        tf_nueTelefono.setText("");
        tf_nueExt.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_ediAceptar;
    private javax.swing.JButton btn_ediEditar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> li_ediTutores;
    private javax.swing.JPanel pn_agregar;
    private javax.swing.JPanel pn_editar;
    private javax.swing.JTextField tf_ediApellidos;
    private javax.swing.JTextField tf_ediCorreo;
    private javax.swing.JTextField tf_ediDepa;
    private javax.swing.JTextField tf_ediExt;
    private javax.swing.JTextField tf_ediIdTutor;
    private javax.swing.JTextField tf_ediNC;
    private javax.swing.JTextField tf_ediNombre;
    private javax.swing.JTextField tf_ediPuesto;
    private javax.swing.JTextField tf_ediTelefono;
    private javax.swing.JTextField tf_idPersona;
    private javax.swing.JTextField tf_nueApellido;
    private javax.swing.JTextField tf_nueCorreo;
    private javax.swing.JTextField tf_nueDepa;
    private javax.swing.JTextField tf_nueExt;
    private javax.swing.JTextField tf_nueNC;
    private javax.swing.JTextField tf_nueNombre;
    private javax.swing.JTextField tf_nuePuesto;
    private javax.swing.JTextField tf_nueTelefono;
    // End of variables declaration//GEN-END:variables

    private void llenarListaTutores() {
        Connection con = new Conector.Conector().conectarMySQL();
        TutorDAO tdao = new TutorDAO(con);
        listaTutores = tdao.consultaMasiva();
    }

    private void llenarComponentes() {
        DefaultListModel modelo = new DefaultListModel();

        for (TutorVO i : listaTutores) {
            modelo.addElement(i.getNC()
                    + "\t " + i.getNombre()
                    + "\t " + i.getApellidos()
            );
        }
        li_ediTutores.setModel(modelo);
        li_ediTutores.repaint();
    }
}
