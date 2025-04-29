package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel;

    public MyImageFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("이미지 넣어보는 연습");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myImagePanel = new MyImagePanel();
    }

    private void setInitLayout() {
        add(myImagePanel);
    }

    // 정적 내부 클래스
    static class MyImagePanel extends JPanel {
        // 내부 클래스의 멤버 변수 선언
        private Image image1;
        private Image image2;

        // 내부 클래스 생성자
        public MyImagePanel() {
            // imageIcon 데이터 타입을 .getImage() 메서드를 호출해서 형 변환 --> Image
            image1 = new ImageIcon("image3.jpg").getImage();
            image2 = new ImageIcon("image4.jpg").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 이미지를 올려보자.
            g.drawImage(image1, 100, 100, 300, 300, null);
            g.drawImage(image2, 400, 100, 300, 300, null);

        }
    } // end of static inner class

    public static void main(String[] args) {
        new MyImageFrame();
    }
}
