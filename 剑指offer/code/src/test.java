import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.rmi.server.ExportException;
import java.util.*;

//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }

public class test {
    public static void main(String[] args) {
        Person p = new Person("阿大");
        change(p);
        System.out.println(p.name);
    }
    public static void change(Person p) {
        Person person = new Person("阿小");
        p = person;
    }

    public void deleteAll(File rootFilePath) {
        File[] deleteFiles = rootFilePath.listFiles();
        if (deleteFiles == null) {
            return;
        }

        for (int i = 0; i < deleteFiles.length; i++) {
            if (deleteFiles[i].isDirectory()) {
                deleteAll(deleteFiles[i]);
            }

            try {
                Files.delete(deleteFiles[i].toPath());
            } catch (IOException e) {
                return;
            }
        }
    }

}



 class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class ObjectLock {
    private static Object lock = new Object();

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread A " + i);
                }
            }
        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread B " + i);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadA()).start();
        Thread.sleep(10);
        new Thread(new ThreadB()).start();
    }
}