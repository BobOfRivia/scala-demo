package hello.Lesson23_trait_adv.javaChain;

/**
 * 职责链模式
 */
public abstract class ChainHandler {
    protected  ChainHandler handler;

    public abstract void doHandler();

    public ChainHandler getHandler(){
        return handler;
    }

    public void setHandler(ChainHandler handler){
        this.handler=handler;
    }
}

