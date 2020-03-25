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
                int[] back_x = {189, 408, 437, 213};
				int[] back_y = {120, 80, 305, 361};
                Polygon back = new Polygon(back_x, back_y, back_x.length);
				int[] leg_f_l_x = {309, 356, 339, 337, 269, 276};
				int[] leg_f_l_y = {442, 446, 486, 630, 619, 507};
                Polygon leg_f_left = new Polygon(leg_f_l_x, leg_f_l_y, leg_f_l_x.length);
				int[] leg_f_r_x = {506, 547, 587, 544, 514, 473};
				int[] leg_f_r_y = {404, 435, 545, 586, 446, 427};
                Polygon leg_f_right = new Polygon(leg_f_r_x, leg_f_r_y, leg_f_r_x.length);
				int[] leg_b_l_x = {219, 229, 204, 171, 174};
				int[] leg_b_l_y = {367, 402, 475, 508, 415};
                Polygon leg_b_left = new Polygon(leg_b_l_x, leg_b_l_y, leg_b_l_x.length);
				int[] mc_x = {340, 381, 243, 263};
				int[] mc_y = {106, 144, 171, 119};
                Polygon mouth_cover = new Polygon(mc_x, mc_y, mc_x.length);
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
