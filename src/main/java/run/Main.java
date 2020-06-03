package run;

import VO_Y_DAO.DAO.AlumnoDAO;
import com.sussana.sussanav2.VentanaPrincipal;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        if (UIManager.getLookAndFeel() instanceof MaterialLookAndFeel) {
            MaterialLookAndFeel.changeTheme(new MaterialLiteTheme());
        }
        
        AlumnoDAO aldao = new AlumnoDAO(new Conector.Conector().conectarMySQL());
        
        System.out.println(aldao.getAlumnoByNC(18120215));
        
        VentanaPrincipal v = new VentanaPrincipal();
        v.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
}
