import java.awt.*;
import javax.swing.*;

public class Chair extends JFrame {
    ImageIcon icon;
    Image bgImg;
    public Chair() {
        icon = new ImageIcon("froggychairbg.jpg");
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(),0,0,null);
                super.paintComponent(g);
                Color frogGreen1 = new Color(36,231,27);
                Color frogGreen2 = new Color(147,255,86);
                Color frogRed = new Color(221,27,27);
                Color frogBlue = new Color(27,82,232);
                g.setColor(frogGreen1);
                Polygon back = new Polygon();
                back.addPoint(189,120);
                back.addPoint(408,80);
                back.addPoint(437,305);
                back.addPoint(213,361);
                Polygon leg_f_left = new Polygon();
                leg_f_left.addPoint(309,442);
                leg_f_left.addPoint(356,446);
                leg_f_left.addPoint(339,486);
                leg_f_left.addPoint(337,630);
                leg_f_left.addPoint(269,619);
                leg_f_left.addPoint(276,507);
                Polygon leg_f_right = new Polygon();
                leg_f_right.addPoint(506,404);
                leg_f_right.addPoint(547,435);
                leg_f_right.addPoint(587,545);
                leg_f_right.addPoint(544,586);
                leg_f_right.addPoint(514,446);
                leg_f_right.addPoint(473,427);
                Polygon leg_b_left = new Polygon();
                leg_b_left.addPoint(219,367);
                leg_b_left.addPoint(229,402);
                leg_b_left.addPoint(204,475);
                leg_b_left.addPoint(171,508);
                leg_b_left.addPoint(174,415);
                Polygon mouth_cover = new Polygon();
                mouth_cover.addPoint(340,106);
                mouth_cover.addPoint(381,144);
                mouth_cover.addPoint(243,171);
                mouth_cover.addPoint(263,119);
                g.fillPolygon(back);
                g.fillOval(181,100,93,94);
                g.fillOval(347,73,84,102);
                g.fillOval(213,293,311,159);
                g.fillPolygon(leg_b_left);
                g.fillPolygon(leg_f_left);
                g.fillPolygon(leg_f_right);
                g.setColor(frogRed);
                g.fillOval(289,120,86,63);
                g.fillOval(275,125,97,64);
                g.fillOval(267,139,96,54);
                g.fillOval(258,127,102,66);
                g.fillOval(253,125,94,67);
                g.setColor(frogGreen1);
                g.fillPolygon(mouth_cover);
                g.setColor(frogGreen2);
                g.fillOval(249,317,238,96);
                g.setColor(frogBlue);
                g.fillOval(213,126,36,37);
                g.fillOval(369,100,36,37);
            }
        };
        
        panel.setOpaque(false);
        panel.setPreferredSize(new Dimension(690,690));
        getContentPane().add(panel);
        panel.setLayout(new BorderLayout());

    }
    public static void main(String[] args) {
        Chair frame = new Chair();
        frame.setTitle("Froggy Chair");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(690,730);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}