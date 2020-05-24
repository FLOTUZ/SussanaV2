package com.sussana.sussanav2;


import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;

public class main extends javax.swing.JFrame {

    public main() {
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
        m_tutores = new javax.swing.JMenu();
        mi_consultarTutor = new javax.swing.JMenuItem();
        mi_altaTutor = new javax.swing.JMenuItem();
        mi_bajaTutor = new javax.swing.JMenuItem();
        m_alumnos = new javax.swing.JMenu();
        mi_consultarActualizarAlumno = new javax.swing.JMenuItem();
        mi_altaAlumno = new javax.swing.JMenuItem();
        mi_bajaAlumno = new javax.swing.JMenuItem();

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
        pn_menuBotones.add(btn_tutores);

        btn_alumnos.setText("Alumnos");
        pn_menuBotones.add(btn_alumnos);

        pn_extras.setLayout(new java.awt.GridLayout(5, 1));

        btn_mant.setText("jButton5");
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

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_contenedorLayout = new javax.swing.GroupLayout(pn_contenedor);
        pn_contenedor.setLayout(pn_contenedorLayout);
        pn_contenedorLayout.setHorizontalGroup(
            pn_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        pn_contenedorLayout.setVerticalGroup(
            pn_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        archivo.setText("Archivo");

        mi_cerrar.setText("Cerrar");
        archivo.add(mi_cerrar);

        jMenuBar1.add(archivo);

        m_Grupios.setText("Grupos");
        jMenuBar1.add(m_Grupios);

        m_tutores.setText("Tutores");

        mi_consultarTutor.setText("Consultar/Actualizar Tutor");
        m_tutores.add(mi_consultarTutor);

        mi_altaTutor.setText("Alta de tutor");
        m_tutores.add(mi_altaTutor);

        mi_bajaTutor.setText("Baja tutor");
        m_tutores.add(mi_bajaTutor);

        jMenuBar1.add(m_tutores);

        m_alumnos.setText("Alumnos");

        mi_consultarActualizarAlumno.setText("Consultar/Actualizar alumno por NC");
        m_alumnos.add(mi_consultarActualizarAlumno);

        mi_altaAlumno.setText("Alta alumno");
        m_alumnos.add(mi_altaAlumno);

        mi_bajaAlumno.setText("Baja alumno");
        m_alumnos.add(mi_bajaAlumno);

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
        //Obtengo el tamaño del desktopPane

        JInternalFrame vHija = new JInternalFrame("Grupos", true, true, true, true);
        Grupos hijo = new Grupos();

        vHija.add(hijo);
        vHija.pack();
        vHija.setVisible(true);
        escritorio.add(vHija);
        escritorio.getDesktopManager().activateFrame(vHija);

    }//GEN-LAST:event_btn_gruposActionPerformed

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
            MaterialLookAndFeel.changeTheme(new MaterialLiteTheme());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
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
    private javax.swing.JMenuItem mi_altaAlumno;
    private javax.swing.JMenuItem mi_altaTutor;
    private javax.swing.JMenuItem mi_bajaAlumno;
    private javax.swing.JMenuItem mi_bajaTutor;
    private javax.swing.JMenuItem mi_cerrar;
    private javax.swing.JMenuItem mi_consultarActualizarAlumno;
    private javax.swing.JMenuItem mi_consultarTutor;
    private javax.swing.JPanel pn_contenedor;
    private org.jdesktop.swingx.JXPanel pn_extras;
    private org.jdesktop.swingx.JXPanel pn_lateral;
    private org.jdesktop.swingx.JXPanel pn_menuBotones;
    private org.jdesktop.swingx.JXPanel pn_usuario;
    // End of variables declaration//GEN-END:variables
}
