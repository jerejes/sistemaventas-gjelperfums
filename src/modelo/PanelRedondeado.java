package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
public class PanelRedondeado extends JPanel {
    private int radio = 20;

    public PanelRedondeado() {
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radio, radio);

        g2.setColor(Color.GRAY); // color del borde
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radio, radio);

        g2.dispose();
        super.paintComponent(g);
    }
}
