package modelo;
import javax.swing.JButton;
import java.awt.*;

public class BotonRedondeado extends JButton{
      private int radio = 70;
      public BotonRedondeado() 
      {
           setContentAreaFilled(false);
           setBorderPainted(false);
           setRolloverEnabled(true);
           setCursor(new Cursor(Cursor.HAND_CURSOR));
     }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // fondo normal: el color del menú
        g2.setColor(new Color(31, 42, 55));
        g2.fillRect(0, 0, getWidth(), getHeight());

        // al pasar el mouse: rosa redondeado
        if (getModel().isRollover()) {
            g2.setColor(new Color(255, 77, 141));
            g2.fillRoundRect(8, 2, getWidth() - 16, getHeight() - 4, radio, radio);
        }

        g2.dispose();
        super.paintComponent(g);
    }

}
