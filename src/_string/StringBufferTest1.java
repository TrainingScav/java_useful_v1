package _string;

public class StringBufferTest1 {

    // StringBuffer <-- 클래스를 이야기 하기 위해서 String 특징

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("World");

        // 새로 배우는 StringBuffer
        // 기존 String으로 객체 생성 후 값을 변경해버리면
        // 불변 법칙에 따라 기존값을 바꾸지 않고 새로운 객체로 따로 생성해 만든다.
        // StringBuffer는 위 같이 메모리를 낭비하는 현상이 생기지 않도록 하는 클래스이며
        // StringBuffer 참조 변수를 생성해준 후 값을 변경 시켜도 새로 생성하지 않고 기존의 값을 변경처리 한다.
        StringBuffer buffer1 = new StringBuffer(str1);

        System.out.println("수정 전 : " + buffer1);
        System.out.println("수정 전 고유 번호 : " + System.identityHashCode(buffer1));

        // buffer1 에 값을 수정해 보자. 문자열 변경
        buffer1.append(str2);

        System.out.println("수정 후 : " + buffer1);
        System.out.println("수정 후 고유 번호 : " + System.identityHashCode(buffer1));


    } // end of main
}
