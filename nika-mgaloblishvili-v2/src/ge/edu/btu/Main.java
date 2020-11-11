package ge.edu.btu;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;


class SearchThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {
            File file = new File("/users/nika/desktop/java/");
            System.out.println(file.listFiles().length);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        SearchThread searchThread = new SearchThread();
        searchThread.start();

        while (true) {
            System.out.println("შეიყვანეთ ფაილის სახელი: ");
            Scanner sc = new Scanner(System.in);
            String val = sc.nextLine();
            logger.info("საძებნი სიტყვა: " + val);
            File file = new File("/users/nika/desktop/java/");
            File[] filesList = file.listFiles();
            for (File fileItem : filesList) {
                if (fileItem.getName().toLowerCase().contains(val.toLowerCase()))
                    logger.info("მოიძებნა : " + fileItem.getName());
            }
        }

    }
}


