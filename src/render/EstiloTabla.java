
package render;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
public class EstiloTabla {
private static final Color PAR = Color.WHITE;
private static final Color IMPAR = new Color(245, 246, 250);
private static final Color SELECCION = new Color(219, 232, 255);
private static final Color TEXTO = new Color(45, 52, 65);
private static final Color CABECERA = new Color(39, 45, 61);

public static void aplicar(JTable tabla) {

    // Tabla
    tabla.setRowHeight(40);
    tabla.setFont(new Font("Segoe UI", Font.PLAIN, 13));
    tabla.setForeground(TEXTO);
    tabla.setBackground(Color.WHITE);
    tabla.setSelectionBackground(SELECCION);
    tabla.setSelectionForeground(TEXTO);
    tabla.setShowVerticalLines(false);
    tabla.setShowHorizontalLines(true);
    tabla.setGridColor(new Color(230, 233, 240));
    tabla.setIntercellSpacing(new Dimension(0, 1));
    tabla.setFillsViewportHeight(true);

    // Cabecera
    JTableHeader header = tabla.getTableHeader();
    header.setPreferredSize(new Dimension(0, 43));
    header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(
                JTable t, Object valor, boolean sel,
                boolean foco, int fila, int columna) {
            super.getTableCellRendererComponent(
                    t, valor, false, false, fila, columna);

            setHorizontalAlignment(SwingConstants.CENTER);
            setBackground(CABECERA);
            setForeground(Color.WHITE);
            setFont(new Font("Segoe UI", Font.BOLD, 13));
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

            return this;
        }
    });

    // Celdas
    tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(
                JTable t, Object valor, boolean sel,
                boolean foco, int fila, int columna) {

            super.getTableCellRendererComponent(
                    t, valor, sel, false, fila, columna);

            setHorizontalAlignment(SwingConstants.CENTER);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

            setBackground(sel ? SELECCION : (fila % 2 == 0 ? PAR : IMPAR));
            setForeground(TEXTO);
            setFont(new Font("Segoe UI", Font.PLAIN, 13));

            if ("Estado".equals(t.getColumnName(columna)) && valor != null) {
                boolean activo = "ACTIVO".equals(valor.toString());

                setForeground(activo
                        ? new Color(0, 145, 100)
                        : new Color(210, 55, 65));

                setFont(getFont().deriveFont(Font.BOLD));
            }

            return this;
        }
    });
}

}
