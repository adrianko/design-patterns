package interpreter;

import java.lang.reflect.InvocationTargetException;

public class Conversion {

    /**
     * Leveraging reflection to convert one representation of data into another
     * @param args
     */
    public static void main(String[] args) {
        Context c = new Context("25 cups to gallons");
        String from = c.getFrom();
        String to = c.getTo();
        double quantity = c.getQuantity();
        
        try {
            Class f = Class.forName("interpreter." + from);
            System.out.println(
                c.getResponse() +
                f.getMethod(to, new Class[]{Double.TYPE}).invoke(
                    f.getConstructor().newInstance(),
                    new Object[]{quantity}
                ).toString() + 
                " " + to
            );
        } catch (ClassNotFoundException | 
                NoSuchMethodException |
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
}