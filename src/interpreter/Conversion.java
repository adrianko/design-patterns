package interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
            Constructor conF = f.getConstructor();
            Object convertFrom = (Expression) conF.newInstance();
            Class[] methodParams = new Class[]{Double.TYPE};
            Method convMtd = f.getMethod(to, methodParams);
            Object[] params = new Object[]{new Double(quantity)};
            String toQuantity = (String) convMtd.invoke(convertFrom, params);
            String ans = c.getResponse() + toQuantity + " " + to;
            System.out.println(ans);
        } catch(ClassNotFoundException | 
                NoSuchMethodException |
                InvocationTargetException |
                InstantiationException |
                IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
}