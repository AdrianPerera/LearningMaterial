package src.designPatterns.creational.singleton;

public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        SingletonThreadSafe singletonLazy1= SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonLazy2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);
    }

}
