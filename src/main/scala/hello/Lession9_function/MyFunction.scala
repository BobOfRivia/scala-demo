package hello.Lession9_function

/**
  * Created by JACK on 2018/1/29.
  */
class MyFunction {

  def sayHello(name:String,age:Int)={
    if(age>18) {
      printf("Hi,%s,you are a big boy!!!\n",name)
      age
    }else {
      printf("Hi,%s,you are a children!!!\n",name)
      age
    }
  }

  def sum(n:Int)={
    var result=0
    for(i <- 1 to n){
      println(result)
      result+=i
    }
    result
  }

  import scala.math._
  def binMulti(n:Int)={
    var result=2
    pow(2,n)
  }

  //斐波那契数列
  //1,1,2,3,5,8
  def fib(n:Int):Int={
    if(n<=2 ){
      1
    }else{
      fib(n-1)+fib(n-2)
    }
  }
}
