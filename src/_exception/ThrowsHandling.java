package _exception;

public class ThrowsHandling {

    public static  void main(String[] args)  {

        Calc calc = new Calc();
//        try{
//            int result = calc.divide(10,0);
//            System.out.println("result : " + result);
//        } catch (Exception e) {
//            System.out.println(e.getClass());
//            System.out.println("에러 발생");
//        }
        try {
            Calc.divide(10,0);
        } catch (Exception e) {
            System.out.println("인수로 0을 넣지마세요");
//            throw new RuntimeException(e);
        }


    }//end of main

}//end of class

class Calc{

    //예외가 발생할 수있는 코드에서 직접예외 처리 할수 있지만
    //사용하는 시점(사용하는 사람이)알아서 적절하게 예외처리 던질 수있다.
    public static int divide(int n1, int n2)throws ArithmeticException,Exception{
        return n1/n2;
    }

}

