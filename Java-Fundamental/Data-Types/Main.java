    import java.util.Arrays;

    class Main {
    public static void main(String[] args) {
        // Primitive data types
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        boolean booleanValue = true;
        char charValue = 'A';

        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("boolean value: " + booleanValue);
        System.out.println("char value: " + charValue);



        //  Non Primitive data types
        String stringValue = "Hello World!";
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("String value: " + stringValue);
        System.out.println("Array : " + Arrays.toString(intArray));
    }
}
