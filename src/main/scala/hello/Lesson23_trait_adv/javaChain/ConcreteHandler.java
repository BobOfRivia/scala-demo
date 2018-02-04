package hello.Lesson23_trait_adv.javaChain;

/**
 * 用JAVA实现职责链模式
 *
 * 思路：在有后者的情况下，把职责传递给下一位
 * 有共同的父类
 */
public class ConcreteHandler extends ChainHandler{

    private String name;

    public ConcreteHandler(String name){
        this.name=name;
    }

    @Override
    public void doHandler() {
        if(getHandler() == null){
            System.out.println(name+ "  It's Over!!!");
        }else{
            System.out.println(name+"  DEAL WITH IT!!");
            getHandler().doHandler();
        }
    }

    public static void main(String[] args) {
        ChainHandler h1 = new ConcreteHandler("h1");
        ChainHandler h2 = new ConcreteHandler("h2");
        ChainHandler h3 = new ConcreteHandler("h3");
        ChainHandler h4 = new ConcreteHandler("h4");

        h1.setHandler(h2);
        h2.setHandler(h3);
        h3.setHandler(h4);

        h1.doHandler();

    }

}
