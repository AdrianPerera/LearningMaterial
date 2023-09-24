package src.designPatterns.creational.singleton;

public class SingletonStaticBlockTest {
    public static void main(String[] args) {
        SingletonStaticBlock eager1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock eager2 = SingletonStaticBlock.getInstance();
        System.out.println(eager1);
        System.out.println(eager2);
    }
}
