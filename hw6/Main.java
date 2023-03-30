import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Куманцов Максим Александрович");
        System.out.println("Группа РИБО-01-21");

        String path;
        File file;
        while (true) {
            System.out.println();
            System.out.println("Введите полный путь к файлу, откуда неободимо десериализовать объект:");
            path = new Scanner(System.in).nextLine();
            if (path.isEmpty() || path.isBlank()) {
                System.out.println("Путь должен быть заполнен");
                continue;
            }
            file = new File(path);
            if (!file.exists() || file.isDirectory()) {
                System.out.println("Не удалось найти файл по пути: " + path);
            }
            break;
        }

        LoaderRunnable loader = new LoaderRunnable(path);

        Thread thread = new Thread(loader);
        thread.start();
    }
}