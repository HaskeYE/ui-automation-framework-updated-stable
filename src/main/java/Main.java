import tasks.ConfigObjectProvider;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ConfigObjectProvider().collectAllToString());
    }
}
