package packet;

/**
 * Created by Ирина on 07.12.2017.
 */

import java.lang.reflect.Field;

import java.lang.reflect.Field;

/**
 * Created by Ирина on 02.12.2017.
 */
public class Solution {
    public static String toStringIt(Object object) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clss = object.getClass();
        String solution = "";

        final Field[] fields = clss.getDeclaredFields();

        for (Field field : fields) {
            Class fieldType = field.getType();
            String fieldName = field.getName();
            Field fieldOn = clss.getDeclaredField(fieldName);


            solution += "name: " + fieldOn.get(clss)  + ", " + "type: " + fieldType + " \n";
        }
        return solution;
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(toStringIt(new People("Дон", 24)));

    }


}
