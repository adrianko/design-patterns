package multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static Map<String, Multiton> instances = new HashMap<>();

    private Multiton() {}

    public static Multiton getInstance(String key) {
        if (!instances.contains(key)) {
            instances.put(key, new Multiton());
        }
        return instances.get(key);
    }

}