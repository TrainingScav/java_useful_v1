package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRainbowFrame extends JFrame implements ActionListener {


    // 무지개 색 버튼 배치
    // 빨주노초파남보
    private JButton[] rainbowButtons;

    // 버튼들을 담아줄 패널 변수 선언
    private JPanel buttonPanel;
    // 위 버튼에 따라 색상이 바뀌는 패널 변수 선언
    private JPanel colorPanel;


    //생성자
    public MyRainbowFrame() {
        initData();
        setInitLayout();
        addActionListener();
    }

    // 멤버 변수 및 사이즈 관련 초기화 메서드
    private void initData() {
        setTitle("무지개를 무지무지 보고싶어");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rainbowButtons = new JButton[]{
                new JButton("red"), new JButton("orange"),
                new JButton("yellow"), new JButton("green"),
                new JButton("blue"), new JButton("indigo"),
                new JButton("violet")
        };

        // 버튼들이 담긴 패널 인스턴스 화
        buttonPanel = new JPanel();

        // 컬러를 표시해 줄 패널 인스턴스 화
        colorPanel = new JPanel();
    }

    // 레이아웃 관련 초기화 메서드
    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));

        // 버튼 담긴 패널 add
        add(buttonPanel);

        // FOR문을 돌아 rainbowButtons 배열의 길이만큼 버튼 패널에 add
        for (int i = 0; i < rainbowButtons.length; i++) {
            buttonPanel.add(rainbowButtons[i]);
        }

        // 컬러 패널 add
        add(colorPanel);

        // 화면 표시
        setVisible(true);
    }

    // 버튼들의 액션체크를 위한 메서드
    private void addActionListener() {
        // rainbowButtons 버튼들에 ActionListener 처리
        for (int i = 0; i < rainbowButtons.length; i++) {
            rainbowButtons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 각 버튼의 값 확인 (red, orange, yellow .....etc)
        String selectedButton = ((JButton) e.getSource()).getText();

        // selectedButton의 값에 따라 colorPanel 백그라운드 색 설정
        if (selectedButton.equals("red")) {
            colorPanel.setBackground(new Color(255, 0, 0));
        } else if (selectedButton.equals("orange")) {
            colorPanel.setBackground(new Color(255, 128, 0));
        } else if (selectedButton.equals("yellow")) {
            colorPanel.setBackground(new Color(255, 255, 0));
        } else if (selectedButton.equals("green")) {
            colorPanel.setBackground(new Color(0, 128, 0));
        } else if (selectedButton.equals("blue")) {
            colorPanel.setBackground(new Color(0, 0, 255));
        } else if (selectedButton.equals("indigo")) {
            colorPanel.setBackground(new Color(0, 0, 128));
        } else if (selectedButton.equals("violet")) {
            colorPanel.setBackground(new Color(128, 0, 128));
        }
    }

    // 테스트 코드 작성 (메인 함수)
    public static void main(String[] args) {
        new MyRainbowFrame();
    }
}
