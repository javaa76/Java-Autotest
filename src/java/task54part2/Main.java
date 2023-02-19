package task54part2;

public class Main {
    public static void main(String[] args) {
        String samplePath = args[0];
        if (samplePath.endsWith("\\") || samplePath.endsWith("/") ||
        !samplePath.matches("^(([A-Z]:)|/[a-zA-Z]+).*")) {
            System.out.println("Введен некорректный путь до файла.");
            System.exit(0);

        }
        int demiler = 0;
        if (samplePath.lastIndexOf("\\") >= 0)
            demiler = samplePath.lastIndexOf("\\");
        else if (samplePath.lastIndexOf("/") >= 0) {
            demiler = samplePath.lastIndexOf("/");
        }
        else {
            System.out.println("Путь некорректен!");
            System.exit(0);
        }
        System.out.println("Путь: " + samplePath.substring(0, demiler + 1));
        System.out.println("Имя файла: " + samplePath.substring(demiler + 1));
    }
}
