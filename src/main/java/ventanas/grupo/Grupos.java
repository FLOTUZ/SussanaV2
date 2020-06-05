package ventanas.grupo;

import VO_Y_DAO.DAO.CarreraDAO;
import VO_Y_DAO.DAO.GrupoDAO;
import VO_Y_DAO.DAO.TutorDAO;
import VO_Y_DAO.VO.CarreraVO;
import VO_Y_DAO.VO.GrupoVO;
import VO_Y_DAO.VO.TutorVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class Grupos extends javax.swing.JPanel {

    private List<TutorVO> listaTutores;
    private List<CarreraVO> listaCarreras;

    public Grupos() {
        initComponents();

        llenarCbx();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tb_pane = new javax.swing.JTabbedPane();
        pn_añadirGrupos = new javax.swing.JPanel();
        lbl_tutor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_identificador = new javax.swing.JTextField();
        cbx_tutor = new javax.swing.JComboBox<>();
        btn_anadir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbx_carrera = new javax.swing.JComboBox<>();

        lbl_tutor.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        lbl_tutor.setText("Tutor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Añadir Grupo");

        jLabel1.setText("Identificador Ejemplo: (A,B,C)");

        cbx_tutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccione]" }));

        btn_anadir.setText("Añadir");
        btn_anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anadirActionPerformed(evt);
            }
        });

        jLabel3.setText("Carrera");

        cbx_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Seleccione]" }));

        javax.swing.GroupLayout pn_añadirGruposLayout = new javax.swing.GroupLayout(pn_añadirGrupos);
        pn_añadirGrupos.setLayout(pn_añadirGruposLayout);
        pn_añadirGruposLayout.setHorizontalGroup(
            pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_añadirGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_tutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_añadirGruposLayout.createSequentialGroup()
                        .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_tutor, 0, 294, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_añadirGruposLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_anadir)))
                        .addGap(220, 220, 220))
                    .addGroup(pn_añadirGruposLayout.createSequentialGroup()
                        .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_identificador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_carrera, javax.swing.GroupLayout.Alignment.LEADING, 0, 178, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pn_añadirGruposLayout.setVerticalGroup(
            pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_añadirGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn_añadirGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tutor)
                    .addComponent(cbx_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        tb_pane.addTab("Añadir Grupo", pn_añadirGrupos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tb_pane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tb_pane)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anadirActionPerformed

        if (tf_identificador.getText() != ""
                && cbx_tutor.getSelectedIndex() != 0
                && cbx_carrera.getSelectedIndex() != 0) {
            
            try {
                Connection con = new Conector.Conector().conectarMySQL();
                GrupoDAO gdao = new GrupoDAO(con);
                
                //Se crea el ojeto grupo
                GrupoVO gvo = new GrupoVO();
                gvo.setLetra(tf_identificador.getText());
                gvo.setTutor_iddocente(cbx_tutor.getSelectedIndex());
                
                //Se da de alta en la BD
                gdao.altaGrupo(gvo);
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: Verifique sus datos" + ex);
            }
        }

        
    }//GEN-LAST:event_btn_anadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anadir;
    private javax.swing.JComboBox<String> cbx_carrera;
    private javax.swing.JComboBox<String> cbx_tutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_tutor;
    private javax.swing.JPanel pn_añadirGrupos;
    private javax.swing.JTabbedPane tb_pane;
    private javax.swing.JTextField tf_identificador;
    // End of variables declaration//GEN-END:variables

    private void llenarCbx() {
        try {
            Connection con = new Conector.Conector().conectarMySQL();
            TutorDAO tdao = new TutorDAO(con);

            listaTutores = tdao.consultaMasiva();
            for (TutorVO i : listaTutores) {
                cbx_tutor.addItem(i.getNombre() + " " + i.getApellidos());
            }

            CarreraDAO cdao = new CarreraDAO(con);
            listaCarreras = cdao.consultaMasiva();
            for (CarreraVO i : listaCarreras) {
                cbx_carrera.addItem(i.getNombre());
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error desde Grupos.llenarCbx()");
        }
    }
}
