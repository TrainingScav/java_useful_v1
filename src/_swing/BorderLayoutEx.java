package _swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {

    // 멤버 변수
    JButton[] buttons;
    String[] dirrection = {BorderLayout.EAST, BorderLayout.WEST, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.CENTER};

    // 생성자
    public BorderLayoutEx() {
        setTitle("borderLayout연습");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();
    }

    // 메서드
    private void initData() {
        buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
    }

    private void setInitLayout() {
        // 배치 관리자 (보더레이아웃)
        // BorderLayout 은 컴포넌트들을 동,서,남,북,가운데 로 배치 시켜주는 레이아웃이다.
        setLayout(new BorderLayout());

        // 프레임(패널)
        // 우리가 생성한 JButton 객체를 프레임에 붙인다.
        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], dirrection[i]);
        }
    }


}
