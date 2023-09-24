package src.designPatterns.creational.singleton;

public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager eager1 = SingletonEager.getEagerInstance();
        SingletonEager eager2 = SingletonEager.getEagerInstance();
        System.out.println(eager1);
        System.out.println(eager2);
    }
}
