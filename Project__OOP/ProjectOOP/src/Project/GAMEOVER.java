package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GAMEOVER extends JPanel {
    private ImageIcon background = new ImageIcon(this.getClass().getResource("GAM.png"));
    private ImageIcon exit = new ImageIcon(this.getClass().getResource("edit.png"));
    private ImageIcon restart = new ImageIcon(this.getClass().getResource("BaK.png"));
    public int last = 0;  // คะแนนสุดท้าย
    public int x = 0;
    public int y = 0;

    GAMEOVER() {
        setLayout(null);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX() >= 425 && e.getX() <= 575 && e.getY() >= 225 && e.getY() <= 375) {
                    x = e.getX();
                    y = e.getY();
                    // เพิ่มการกระทำที่นี่ถ้าต้องการ
                } else if (e.getX() >= 850 && e.getX() <= 940 && e.getY() >= 450 && e.getY() <= 540) {
                    System.exit(0);
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 0, 1000, 600, this);
        g.drawImage(restart.getImage(), 425, 300, 150, 150, this); 
        g.drawImage(exit.getImage(), 850, 450, 90, 90, this);

        // ตั้งสีและฟอนต์สำหรับการแสดงคะแนน
        g.setColor(Color.black);
        g.setFont(new Font("2005_iannnnnTKO", Font.CENTER_BASELINE, 60));

        // วาดคะแนนที่ด้านล่างของหน้าจอ (เช่น y = 550)
        g.drawString("SCORE : " + last, 340, 50);
    }
}
