/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalizacion;

import VO_Y_DAO.DAO.AlumnoDAO;
import VO_Y_DAO.DAO.CanalizacionDAO;
import VO_Y_DAO.DAO.CarreraDAO;
import VO_Y_DAO.DAO.TutorDAO;
import VO_Y_DAO.VO.AlumnoVO;
import VO_Y_DAO.VO.CanalizacionVO;
import VO_Y_DAO.VO.CarreraVO;
import VO_Y_DAO.VO.TutorVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Canalizacion extends javax.swing.JPanel {

    private int matricula;
    private String fecha;
    private AlumnoVO alumno;
    private List<TutorVO> listaTutores;
    private List<CarreraVO> listaCarreras;

    public Canalizacion() throws SQLException {
        initComponents();
        llenarCombobox();
        tf_nucaFecha.setText(fecha);
    }

    public Canalizacion(int matricula) throws SQLException {
        initComponents();
        this.matricula = matricula;

        //Obtener la fecha y formatearlo:
        Date date = new Date();
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        fecha = fechaFormat.format(date);

        //Se forma el alumno para la canalización
        Connection con = new Conector.Conector().conectarMySQL();
        AlumnoDAO aldao = new AlumnoDAO(con);
        alumno = aldao.getAlumnoByNC(matricula);

        //Se llenan los campos
        tf_nucaFecha.setText(fecha);
        tf_nucaNC.setText(String.valueOf(alumno.getNC()));

        //Se llenan los combobox
        llenarCombobox();
        con.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pn_nuevaCanalizacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nucaFecha = new javax.swing.JTextField();
        tf_nucaNC = new javax.swing.JTextField();
        cbx_tutor = new javax.swing.JComboBox<>();
        cbx_carrera = new javax.swing.JComboBox<>();
        cbx_semestre = new javax.swing.JComboBox<>();
        ch_nucaTristeza = new javax.swing.JCheckBox();
        ch_nucaAngustia = new javax.swing.JCheckBox();
        ch_nucaAnsiedad = new javax.swing.JCheckBox();
        ch_nucaDesesperacion = new javax.swing.JCheckBox();
        ch_nucaLlanto = new javax.swing.JCheckBox();
        ch_nucaConducta = new javax.swing.JCheckBox();
        ch_nucaEstadoAnimo = new javax.swing.JCheckBox();
        ch_nucaExitación = new javax.swing.JCheckBox();
        ch_nucaIrritabilidad = new javax.swing.JCheckBox();
        ch_nucaDrogas = new javax.swing.JCheckBox();
        ch_nucaAprendizaje = new javax.swing.JCheckBox();
        ch_nucaAgresiones = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        tf_nucaOtros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_nucaDescripcion = new javax.swing.JTextArea();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_verImprimir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nueva Canalización");

        jLabel2.setText("Fecha");

        jLabel4.setText("NC alumno");

        jLabel5.setText("Tutor");

        jLabel6.setText("Carrera");

        jLabel7.setText("Semestre");

        tf_nucaFecha.setEditable(false);

        cbx_tutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccione]" }));

        cbx_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccionar]" }));

        cbx_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccionar]", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ch_nucaTristeza.setText("Tristeza profunda o constante");

        ch_nucaAngustia.setText("Angustia");

        ch_nucaAnsiedad.setText("Ansiedad");

        ch_nucaDesesperacion.setText("Desesperación constante");

        ch_nucaLlanto.setText("Llanto súbito continuo");

        ch_nucaConducta.setText("Cambios bruscos de conducta");

        ch_nucaEstadoAnimo.setText("Cambios subitos de estado de animo");

        ch_nucaExitación.setText("Excitación o alteración psicomotriz");

        ch_nucaIrritabilidad.setText("Irritabilidad constante sin motivo aparente");

        ch_nucaDrogas.setText("Consumo de drogas");

        ch_nucaAprendizaje.setText("Dificultades severas de aprendizaje");

        ch_nucaAgresiones.setText("Auto agresiones");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Otros:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Desarrollo del problema (Si conoce la situación de origen describala brevemente)");

        ta_nucaDescripcion.setColumns(20);
        ta_nucaDescripcion.setRows(5);
        jScrollPane1.setViewportView(ta_nucaDescripcion);

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");

        btn_verImprimir.setText("Ver e imprimir");

        javax.swing.GroupLayout pn_nuevaCanalizacionLayout = new javax.swing.GroupLayout(pn_nuevaCanalizacion);
        pn_nuevaCanalizacion.setLayout(pn_nuevaCanalizacionLayout);
        pn_nuevaCanalizacionLayout.setHorizontalGroup(
            pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_nuevaCanalizacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_verImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_nucaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(97, 97, 97))
                                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_nucaNC))
                                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbx_tutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbx_carrera, 0, 142, Short.MAX_VALUE))
                                            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbx_semestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(95, 95, 95)))
                                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ch_nucaTristeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaAngustia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaAnsiedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaDesesperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaLlanto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaConducta, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ch_nucaEstadoAnimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaExitación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaIrritabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaDrogas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaAprendizaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ch_nucaAgresiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_nucaOtros))))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_nuevaCanalizacionLayout.setVerticalGroup(
            pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nucaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_nucaTristeza)
                    .addComponent(ch_nucaEstadoAnimo))
                .addGap(18, 18, 18)
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch_nucaAngustia)
                            .addComponent(ch_nucaExitación))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch_nucaAnsiedad)
                            .addComponent(ch_nucaIrritabilidad))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch_nucaDesesperacion)
                            .addComponent(ch_nucaDrogas))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ch_nucaLlanto)
                            .addComponent(ch_nucaAprendizaje)))
                    .addGroup(pn_nuevaCanalizacionLayout.createSequentialGroup()
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_nucaNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbx_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbx_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_nucaConducta)
                    .addComponent(ch_nucaAgresiones))
                .addGap(18, 18, 18)
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nucaOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_nuevaCanalizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_verImprimir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(pn_nuevaCanalizacion);

        jTabbedPane1.addTab("Nueva Canalizacion", jScrollPane2);

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

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        try {
            //Datos alumno
            String date = tf_nucaFecha.getText();
            int alum = Integer.valueOf(alumno.getIdAlumno());
            //Combobox
            String tutor = (String) cbx_tutor.getSelectedItem();
            int carrera = cbx_carrera.getSelectedIndex();
            int semestre = cbx_semestre.getSelectedIndex();
            //checkboxe's
            boolean tristeza = ch_nucaTristeza.isSelected();
            boolean angustia = ch_nucaAngustia.isSelected();
            boolean ansiedad = ch_nucaAnsiedad.isSelected();
            boolean desesperacion = ch_nucaDesesperacion.isSelected();
            boolean llanto = ch_nucaLlanto.isSelected();
            boolean conducta = ch_nucaConducta.isSelected();
            boolean animo = ch_nucaEstadoAnimo.isSelected();
            boolean exitacion = ch_nucaExitación.isSelected();
            boolean irritabilidad = ch_nucaIrritabilidad.isSelected();
            boolean drogas = ch_nucaDrogas.isSelected();
            boolean aprendizaje = ch_nucaAprendizaje.isSelected();
            boolean agresiones = ch_nucaAgresiones.isSelected();
            //Detalles y especificacion
            String otros = tf_nucaOtros.getText();
            String descripcion = ta_nucaDescripcion.getText();

            //Se enpaqueta
            CanalizacionVO canvo = new CanalizacionVO();
            canvo.setFecha(date);
            canvo.setAlumno_idAlumno(alum);
            canvo.setTutor(tutor);
            canvo.setCarrera_idCarrera(carrera);
            canvo.setSemstre(semestre);
            canvo.setTrizteza(tristeza);
            canvo.setAnimo(angustia);
            canvo.setAnsiedad(ansiedad);
            canvo.setDesesperacion(desesperacion);
            canvo.setLlanto(llanto);
            canvo.setConduta(conducta);
            canvo.setAnimo(animo);
            canvo.setExitacion(exitacion);
            canvo.setIrritabilidad(irritabilidad);
            canvo.setDrogas(drogas);
            canvo.setAprendizaje(aprendizaje);
            canvo.setAutoAgresiones(agresiones);
            canvo.setOtro(otros);
            canvo.setDescripcion(descripcion);

            //Si los los campos estan en su estado por defecto...
            if (    tf_nucaNC.getText() == null
                    ||cbx_tutor.getSelectedIndex() == 0
                    || cbx_carrera.getSelectedIndex() == 0
                    || cbx_semestre.getSelectedIndex() == 0) {
                
                JOptionPane.showMessageDialog(this, "error: Verifique los datos ingresados");
            } else {
                //Se crea nueva conexión
                Connection con = new Conector.Conector().conectarMySQL();
                CanalizacionDAO cdao = new CanalizacionDAO(con);
                //Se da de alta la canalización
                cdao.altaCanalización(canvo);
                con.close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salió mal en Canalizacion.btn_aceptarActionPerformed()\n"
                    + e.toString() + "Revise los datos ingresados");
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_verImprimir;
    private javax.swing.JComboBox<String> cbx_carrera;
    private javax.swing.JComboBox<String> cbx_semestre;
    private javax.swing.JComboBox<String> cbx_tutor;
    private javax.swing.JCheckBox ch_nucaAgresiones;
    private javax.swing.JCheckBox ch_nucaAngustia;
    private javax.swing.JCheckBox ch_nucaAnsiedad;
    private javax.swing.JCheckBox ch_nucaAprendizaje;
    private javax.swing.JCheckBox ch_nucaConducta;
    private javax.swing.JCheckBox ch_nucaDesesperacion;
    private javax.swing.JCheckBox ch_nucaDrogas;
    private javax.swing.JCheckBox ch_nucaEstadoAnimo;
    private javax.swing.JCheckBox ch_nucaExitación;
    private javax.swing.JCheckBox ch_nucaIrritabilidad;
    private javax.swing.JCheckBox ch_nucaLlanto;
    private javax.swing.JCheckBox ch_nucaTristeza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pn_nuevaCanalizacion;
    private javax.swing.JTextArea ta_nucaDescripcion;
    private javax.swing.JTextField tf_nucaFecha;
    private javax.swing.JTextField tf_nucaNC;
    private javax.swing.JTextField tf_nucaOtros;
    // End of variables declaration//GEN-END:variables

    private void llenarCombobox() throws SQLException {
        Connection cone = new Conector.Conector().conectarMySQL();
        TutorDAO tdao = new TutorDAO(cone);

        //Se consultan los tutores y se guardan en una lista
        listaTutores = tdao.consultaMasiva();

        //Se recorre la lista
        for (TutorVO i : listaTutores) {
            cbx_tutor.addItem(i.getNombre() + i.getApellidos());
        }

        CarreraDAO cdao = new CarreraDAO(cone);
        //Se consultan las carreras y se guardan en una lista
        listaCarreras = cdao.consultaMasiva();

        for (CarreraVO i : listaCarreras) {
            cbx_carrera.addItem(i.getNombre());
        }

        cone.close();
    }
}
