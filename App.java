import javax.swing.*;
import java.awt.*;

class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Alcohol Marble");
        // When we close the window, stop the app.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas canvas = new MyCanvas();
        window.add(canvas);

        // fit the window size arround the components (just our canvas)
        window.pack();
        window.setResizable(true);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

class MyCanvas extends JPanel {

    public MyCanvas() {
        setPreferredSize(new Dimension(900, 600));
        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(157, 233, 245));
        g.fillRect(0, 0, 900, 220);

        g.setColor(Color.yellow);
        g.fillOval(680, 30, 60, 60);


        g.setColor(Color.green);
        g.fillOval(280, 30, 60, 60);

    }

}
