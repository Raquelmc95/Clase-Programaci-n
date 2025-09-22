/*
* Crea un programa que muestre todos los caracteres Unicode junto con su code point, cuyo valor esté comprendido entre
* \u0000 y \uFFFF
* */

public class e01 {
    public static void main(String[] args) {
        for (int codepoint = 0x0000; codepoint<0xFFFF; codepoint++){
            String xxxx=Integer.toHexString(codepoint);
            System.out.println("\\u"+xxxx+": "+(char)codepoint);
        }

    }
}
