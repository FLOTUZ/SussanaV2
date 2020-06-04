package com.sussana.sussanav2;

import bajaAusentismo.BajaAusentismo;
import canalizacion.Canalizacion;
import credito.Credito;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.grupo.Grupos;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mantenimiento.Mantenimiento;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialOceanicTheme;
import ventanas.alumno.Alumno;
import ventanas.tutor.Tutor;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Sussana");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_lateral = new org.jdesktop.swingx.JXPanel();
        pn_usuario = new org.jdesktop.swingx.JXPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_menuBotones = new org.jdesktop.swingx.JXPanel();
        btn_grupos = new javax.swing.JButton();
        btn_tutores = new javax.swing.JButton();
        btn_alumnos = new javax.swing.JButton();
        pn_extras = new org.jdesktop.swingx.JXPanel();
        btn_mant = new javax.swing.JButton();
        pn_contenedor = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        mi_cerrar = new javax.swing.JMenuItem();
        m_Grupios = new javax.swing.JMenu();
        mi_grupoReportes = new javax.swing.JMenuItem();
        m_tutores = new javax.swing.JMenu();
        mi_tutoresReportes = new javax.swing.JMenuItem();
        m_alumnos = new javax.swing.JMenu();
        mi_reporteAlumnos = new javax.swing.JMenuItem();
        mi_canalizacionPsicologica = new javax.swing.JMenuItem();
        mi_solicitudCreditos = new javax.swing.JMenuItem();
        mi_bajaAusentismo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_lateral.setBackground(new java.awt.Color(255, 255, 255));
        pn_lateral.setMinimumSize(new java.awt.Dimension(276, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUSSANA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout pn_usuarioLayout = new javax.swing.GroupLayout(pn_usuario);
        pn_usuario.setLayout(pn_usuarioLayout);
        pn_usuarioLayout.setHorizontalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_usuarioLayout.setVerticalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        pn_menuBotones.setLayout(new java.awt.GridLayout(0, 1));

        btn_grupos.setText("Grupos");
        btn_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gruposActionPerformed(evt);
            }
        });
        pn_menuBotones.add(btn_grupos);

        btn_tutores.setText("Tutores");
        btn_tutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutoresActionPerformed(evt);
            }
        });
        pn_menuBotones.add(btn_tutores);

        btn_alumnos.setText("Alumnos");
        btn_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alumnosActionPerformed(evt);
            }
        });
        pn_menuBotones.add(btn_alumnos);

        pn_extras.setLayout(new java.awt.GridLayout(5, 1));

        btn_mant.setText("Mantenimiento");
        btn_mant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mantActionPerformed(evt);
            }
        });
        pn_extras.add(btn_mant);

        javax.swing.GroupLayout pn_lateralLayout = new javax.swing.GroupLayout(pn_lateral);
        pn_lateral.setLayout(pn_lateralLayout);
        pn_lateralLayout.setHorizontalGroup(
            pn_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_menuBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_extras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_lateralLayout.createSequentialGroup()
                .addComponent(pn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_lateralLayout.setVerticalGroup(
            pn_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_lateralLayout.createSequentialGroup()
                .addComponent(pn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_menuBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_extras, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        );

        pn_contenedor.setBackground(new java.awt.Color(0, 0, 102));

        escritorio.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout pn_contenedorLayout = new javax.swing.GroupLayout(pn_contenedor);
        pn_contenedor.setLayout(pn_contenedorLayout);
        pn_contenedorLayout.setHorizontalGroup(
            pn_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        pn_contenedorLayout.setVerticalGroup(
            pn_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        archivo.setText("Archivo");

        mi_cerrar.setText("Cerrar");
        mi_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cerrarActionPerformed(evt);
            }
        });
        archivo.add(mi_cerrar);

        jMenuBar1.add(archivo);

        m_Grupios.setText("Grupos");

        mi_grupoReportes.setText("Reportes");
        m_Grupios.add(mi_grupoReportes);

        jMenuBar1.add(m_Grupios);

        m_tutores.setText("Tutores");

        mi_tutoresReportes.setText("Reportes");
        m_tutores.add(mi_tutoresReportes);

        jMenuBar1.add(m_tutores);

        m_alumnos.setText("Alumnos");

        mi_reporteAlumnos.setText("Reporte");
        m_alumnos.add(mi_reporteAlumnos);

        mi_canalizacionPsicologica.setText("Canalización psicologica");
        mi_canalizacionPsicologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_canalizacionPsicologicaActionPerformed(evt);
            }
        });
        m_alumnos.add(mi_canalizacionPsicologica);

        mi_solicitudCreditos.setText("Solicitud credito");
        mi_solicitudCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_solicitudCreditosActionPerformed(evt);
            }
        });
        m_alumnos.add(mi_solicitudCreditos);

        mi_bajaAusentismo.setText("Baja por ausentismo");
        mi_bajaAusentismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_bajaAusentismoActionPerformed(evt);
            }
        });
        m_alumnos.add(mi_bajaAusentismo);

        jMenuBar1.add(m_alumnos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pn_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gruposActionPerformed

        //Si hay una ventana de tipo grupos, entonces no crea una nueva
        String titulo = "Grupos";
        for (JInternalFrame i : escritorio.getAllFrames()) {
            i.dispose();
        }

        //Pero si no existe, crea una nueva ventana
        JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
        Grupos hijo = new Grupos();
        vHija.add(hijo);
        vHija.pack();
        vHija.setVisible(true);
        escritorio.add(vHija);
        escritorio.getDesktopManager().activateFrame(vHija);

    }//GEN-LAST:event_btn_gruposActionPerformed

    private void btn_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alumnosActionPerformed
        try {
            //Si hay una ventana de tipo grupos, entonces no crea una nueva
            String titulo = "Alumnos";
            for (JInternalFrame i : escritorio.getAllFrames()) {
                i.dispose();
            }
            
            //Pero si no existe, crea una nueva ventana
            JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
            Alumno hijo = new Alumno(escritorio);
            vHija.add(hijo);
            vHija.pack();
            vHija.setVisible(true);
            escritorio.add(vHija);
            escritorio.getDesktopManager().activateFrame(vHija);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_alumnosActionPerformed

    private void btn_tutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutoresActionPerformed
        String titulo = "Tutores";
        for (JInternalFrame i : escritorio.getAllFrames()) {
            i.dispose();
        }

        //Pero si no existe, crea una nueva ventana
        JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
        Tutor hijo = new Tutor();
        vHija.add(hijo);
        vHija.pack();
        vHija.setVisible(true);
        escritorio.add(vHija);
        escritorio.getDesktopManager().activateFrame(vHija);
    }//GEN-LAST:event_btn_tutoresActionPerformed

    private void mi_canalizacionPsicologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_canalizacionPsicologicaActionPerformed
        try {
            String titulo = "Canalización psicologica";
            for (JInternalFrame i : escritorio.getAllFrames()) {
                i.dispose();
            }
            
            //Pero si no existe, crea una nueva ventana
            JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
            Canalizacion hijo = new Canalizacion();
            vHija.add(hijo);
            vHija.pack();
            vHija.setVisible(true);
            escritorio.add(vHija);
            escritorio.getDesktopManager().activateFrame(vHija);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al abrir panel canalizacion "+ex.toString());
        }
    }//GEN-LAST:event_mi_canalizacionPsicologicaActionPerformed

    private void mi_solicitudCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_solicitudCreditosActionPerformed
        String titulo = "Solicitud del credito";
        for (JInternalFrame i : escritorio.getAllFrames()) {
            i.dispose();
        }

        //Pero si no existe, crea una nueva ventana
        JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
        Credito hijo = new Credito();
        vHija.add(hijo);
        vHija.pack();
        vHija.setVisible(true);
        escritorio.add(vHija);
        escritorio.getDesktopManager().activateFrame(vHija);
    }//GEN-LAST:event_mi_solicitudCreditosActionPerformed

    private void btn_mantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mantActionPerformed
        String titulo = "Mantenimiento";
        for (JInternalFrame i : escritorio.getAllFrames()) {
            i.dispose();
        }

        //Pero si no existe, crea una nueva ventana
        JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
        Mantenimiento hijo = new Mantenimiento();
        vHija.add(hijo);
        vHija.pack();
        vHija.setVisible(true);
        escritorio.add(vHija);
        escritorio.getDesktopManager().activateFrame(vHija);
    }//GEN-LAST:event_btn_mantActionPerformed

    private void mi_bajaAusentismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_bajaAusentismoActionPerformed
        try {
            String titulo = "Baja Ausentismo";
            for (JInternalFrame i : escritorio.getAllFrames()) {
                i.dispose();
            }
            
            //Pero si no existe, crea una nueva ventana
            JInternalFrame vHija = new JInternalFrame(titulo, true, true, true, false);
            BajaAusentismo hijo = new BajaAusentismo();
            vHija.add(hijo);
            vHija.pack();
            vHija.setVisible(true);
            escritorio.add(vHija);
            escritorio.getDesktopManager().activateFrame(vHija);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear ventana baja por ausentismo" + ex);
        }
    }//GEN-LAST:event_mi_bajaAusentismoActionPerformed

    private void mi_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_mi_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        if (UIManager.getLookAndFeel() instanceof MaterialLookAndFeel) {
            MaterialLookAndFeel.changeTheme(new MaterialOceanicTheme());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivo;
    private javax.swing.JButton btn_alumnos;
    private javax.swing.JButton btn_grupos;
    private javax.swing.JButton btn_mant;
    private javax.swing.JButton btn_tutores;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu m_Grupios;
    private javax.swing.JMenu m_alumnos;
    private javax.swing.JMenu m_tutores;
    private javax.swing.JMenuItem mi_bajaAusentismo;
    private javax.swing.JMenuItem mi_canalizacionPsicologica;
    private javax.swing.JMenuItem mi_cerrar;
    private javax.swing.JMenuItem mi_grupoReportes;
    private javax.swing.JMenuItem mi_reporteAlumnos;
    private javax.swing.JMenuItem mi_solicitudCreditos;
    private javax.swing.JMenuItem mi_tutoresReportes;
    private javax.swing.JPanel pn_contenedor;
    private org.jdesktop.swingx.JXPanel pn_extras;
    private org.jdesktop.swingx.JXPanel pn_lateral;
    private org.jdesktop.swingx.JXPanel pn_menuBotones;
    private org.jdesktop.swingx.JXPanel pn_usuario;
    // End of variables declaration//GEN-END:variables
}
