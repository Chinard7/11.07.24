import java.awt.*;
import javax.swing.*;

public class Desafio extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    //Set para o desenho
    g.fillRect(20, 40, 100,50);

    g.setFont(new Font("Arial", Font.ITALIC, 22));
    g.setColor(Color.BLUE);
    g.drawString("Senac",22, 70);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.add(new Desafio());
        frame.setVisible(true);
    }
}