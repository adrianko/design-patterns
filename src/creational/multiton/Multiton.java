package creational.multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static Map<String, Multiton> instances = new HashMap<>();

    private Multiton() {}

    public static Multiton getInstance(String key) {
        if (!instances.containsKey(key)) {
            instances.put(key, new Multiton());
        }
        return instances.get(key);
    }

    public static void destroyInstance(String key) {
        if (instances.containsKey(key)) {
            instances.remove(key);
        }
    }

}