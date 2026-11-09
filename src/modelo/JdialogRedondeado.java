package modelo;

import javax.swing.JDialog;
import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
public class JdialogRedondeado extends JDialog{
    private int radio = 30;

    public JdialogRedondeado(Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);   // sin barra de título

        // cada vez que cambia el tamaño, se recorta con esquinas redondeadas
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radio, radio));
            }
        });
    }
    
}
