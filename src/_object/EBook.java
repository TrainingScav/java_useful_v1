package _object;

public class EBook {

    private int bookTypeId;
    private String title;
    private String author;

    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    // toString() 재정의


    @Override
    public String toString() {
        //return "title : " + title + ", " + "author : " + author;
        return "해당 객체의 주소값은 " + super.toString() + " 입니다.";
    }

    // equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // hashCode() 메서드 재정의
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // 테스트 코드
    public static void main(String[] args) {
        EBook eBook1 = new EBook(1,"검정고무신","이기철");
        EBook eBook2 = new EBook(2,"미움받을용기","이기영");
        EBook eBook3 = new EBook(3,"미움을줄용기","이기철");

        String eBookADress1 = eBook1.toString();
        String eBookADress2 = eBook2.toString();
        String eBookADress3 = eBook3.toString();

        System.out.println(eBookADress1);
        System.out.println(eBookADress2);
        System.out.println(eBookADress3);

        //boolean result1 = eBook1.equals(eBook2);
        //boolean result2 = eBook1.equals(eBook3);
        //boolean result3 = eBook1.hashCode(1);

        // 문자열에 있는 특정 단어를 찾아 변경해준다.
        // "가나다라마바사"
        // replace("찾을단어", "변경할단어")
        // 예상값 : 가나다라카차차
        String text1 = "가나다라마바사";
        text1 = text1.replace("마바사", "카차차");
        System.out.println(text1);

        // 문자열 안에 특정 위치부터 지정위치까지 글자를 잘라준다.
        // substring(시작위치, 끝낼위치)
        // substring(0,5) --> 시작위치부터(가) 끝낼위치(라) 전의 값들을 자른다.
        // 예상값 : 가나다라마
        // 또는 substring(시작위치) 만 지정하여 값을 잘라낼 수 있다.
        // substring(2) --> 2번 째 인덱스부터 자르기 시작
        // 예상값 : 다라마
        String text2 = "가나다라마바사";
        text2 = text2.substring(0,5);
        System.out.println(text2);
        text2 = text2.substring(2);
        System.out.println(text2);


    }
}
