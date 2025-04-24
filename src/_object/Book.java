package _object;

//import java.lang.Object;
//import java.lang.*;

// java.lang.* 패키지도 자동으로 넣어준다.

/**
 * Object 최상위 클래스 대한 이해
 * 기본적으로 Object 클래스 상속을 받는다.
 * 자바는 Object 클래스(모든 클래스의 최상위 클래스) 를 제외하고
 * 단일 상속만을 제공한다.
 */

//public class Book extends Object {
public class Book extends Object {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // showInfo();
    @Override
    public String toString() {
        return "title : " + title + ", " + "author : " + author;
    }

    // 테스트 코드
    public static void main(String[] args) {
        Book book1 = new Book("데미안", "헤르만헤세");
        System.out.println(book1.toString());
    }

}
