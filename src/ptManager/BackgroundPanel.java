package ptManager;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BackgroundPanel extends JPanel {
    private Image bgImage;

    public BackgroundPanel(String path) {
        // src 폴더 내의 경로를 읽어옵니다.
        this.bgImage = new ImageIcon(getClass().getResource(path)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 패널 크기에 맞춰 배경 이미지를 그림
        g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
    }
}