package _exception;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        //배열 -5
        //인덱스 길이-4
        int[] arr = {1, 2, 3, 4, 5};

        //예외처리 try-catch 구문의 이해
        //예외 처리 try-catch-finally 구문의 이해

        try{
            //예외가 발생할 가능성 있는 코드를 넣어준다.
            for(int i =0; i < 10; i++){
                System.out.println("aee[" + "] = : " + arr[i]);}
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("배열의 범의를 넘었어요!");
        }
        catch (Exception e2){
            System.out.println(e2.getClass());
            //예외가 발생했다면 예외처리를 만들어 줄 수 있다.
           // System.out.println("나의 예외처리 : " + e.getMessage());
        }




        System.out.println("비정상 종료되지 않았습니다");

    }//end of main
}
