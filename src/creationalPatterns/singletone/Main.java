package creationalPatterns.singletone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (correct)" + "\n" +
                "If you see different values, then multiple singletons were created (bugged)" + "\n\n" +
                "RESULT:");

        List<Thread> threadList = new ArrayList<>(100);

        for (int i = 0; i < 50; i++) {

            threadList.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstanceMultiThread("First singletone");
                    System.out.println(singleton.value);
                }
            }));

            threadList.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstanceMultiThread("Second singletone");
                    System.out.println(singleton.value);
                }
            }));

        }

        for (Thread thread : threadList)
            thread.run();

    }

}
