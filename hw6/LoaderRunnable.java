import com.mirea.kt.example.Message;

import java.io.*;

public class LoaderRunnable implements Runnable {

    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        if (path != null && new File(path).exists()) {
            FileInputStream fis;
            try {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println(message);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка десериализации по пути: " + path);
                System.out.println(e.getMessage());
            }
        }
    }
}
