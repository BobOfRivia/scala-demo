package hello.Lession9_function;

/**
 * Created by JACK on 2018/1/30.
 */
public class JavaFib {

    public static int fib(int n){
        if(n<=2){
            return 1;
        }else{
            return fib(n-1) +fib(n-2);
        }
    }


    public static void main(String[] args) {

        System.out.print(JavaFib.fib(45));
    }

}
