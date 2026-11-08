package modelo;
import javax.swing.JButton;
import java.awt.*;

public class BotonRedondeado extends JButton{
    private int radio = 12;

    public BotonRedondeado() {
        this("", new Color(255, 77, 141));
    }

    // Constructor con texto y color
    public BotonRedondeado(String texto, Color color) {
        super(texto);
        setBackground(color);
        setForeground(Color.WHITE);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setRolloverEnabled(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void setRadio(int radio) 
    {
        this.radio = radio;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color base = getBackground();
        g2.setColor(getModel().isRollover() ? base.darker() : base);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radio, radio);

        g2.dispose();
        super.paintComponent(g);
    }
}
