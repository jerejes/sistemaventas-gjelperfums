package principal;
import Vista.formGeneral;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Principal {
    public static void main(String[] args) {
        try 
        {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        }catch (Exception x)
        {
            JOptionPane.showMessageDialog(null,"ERROR ");
        }
        
        formGeneral form1 = new formGeneral();
        form1.setTitle("Principal");
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
        
        
    }
    
}
