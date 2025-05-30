package _exception;

/**
 * 사용자 정의 예외 클래스만들기
 */
public class DivideByZeroException extends Exception{

    private String message;
    public DivideByZeroException(String message){
        super(message);
        this.message= message;
    }

    @Override// alt + insert키
    public String getMessage() {
        return message;
    }
}
