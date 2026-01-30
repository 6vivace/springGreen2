package ptManager;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.InputStream;

public class FontLoader {
    public static void loadFont(String path) {
        try {
            // src 폴더 내의 폰트 파일을 읽음
            InputStream is = FontLoader.class.getResourceAsStream(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            
            // 자바 그래픽 환경에 폰트 등록
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            
            System.out.println("폰트 등록 완료: " + font.getFontName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
