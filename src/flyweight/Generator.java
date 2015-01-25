package flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Generator extends JFrame {

    private static final long serialVersionUID = 1L;

    JButton startDrawing;

    int winW = 1750;
    int winH = 1000;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow, Color.blue,
            Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public Generator() {
        this.setSize(winW, winH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        
        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Button 1");
        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);
        startDrawing.addActionListener(event -> {
            Graphics g = drawingPanel.getGraphics();
            long startTime = System.currentTimeMillis();
            
            for (int i = 0; i < 100000; ++i) {
                Rectangle rect = RectangleFactory.getRectangle(getRandColor());
                rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }

            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private int getRandX() {
        return (int) (Math.random() * winW);
    }

    private int getRandY() {
        return (int) (Math.random() * winH);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        
        return shapeColor[randomGenerator.nextInt(9)];

    }

    /**
     * Flyweight, similar objects are shared rather than creating new ones.
     * @param args
     */
    public static void main(String[] args) {
        new Generator();
    }

}