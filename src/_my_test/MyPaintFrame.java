package _my_test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    MyPanel housePanel;

    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("영끌해서 산 내집");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        housePanel = new MyPanel();
    }

    private void setInitLayout() {
        add(housePanel);
    }

    // 내부 클래스
    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 지붕
            g.drawLine(400, 0, 250, 150);
            g.drawLine(400, 0, 550, 150);
            // 집
            g.drawRect(250, 150, 300, 300);
            // 문
            g.drawRect(270, 300, 100, 150);
            // 문 손잡이
            g.drawArc(345, 390, 20, 20, 0, 600);
            // 창문
            g.drawRect(420, 200, 100, 50);
            // 나 (슬픔과 기쁨이 공존함)
            g.drawArc(100, 290, 50, 50, 0, 600);
            g.drawLine(125, 340, 125, 420);
            g.drawLine(125, 340, 100, 400);
            g.drawLine(125, 340, 145, 400);
            g.drawLine(125, 420, 100, 450);
            g.drawLine(125, 420, 145, 450);

        }
    } // end of static innerClass

    public static void main(String[] args) {
        new MyPaintFrame();
    }


}
