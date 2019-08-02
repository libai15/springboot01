package vo;

public class Sin {
    private static Sin ourInstance = new Sin();

    public static Sin getInstance() {
        return ourInstance;
    }

    private Sin() {
    }
}
