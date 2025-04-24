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

    }
}
