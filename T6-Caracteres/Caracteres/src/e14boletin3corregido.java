public class e14boletin3corregido {
    public static void main(String[] args) {
        String frase="Me GUsta merenDAR faLLEtas";
        boolean primera = false;
        String fraseCamel="";
        String[] palabras = frase.split(" ");
        for (String palabra:palabras){
            palabra=palabra.toLowerCase();
            if (!primera){
                char [] c = palabra.toCharArray();
                c[0]=(char)('A'-'a'+c[0]);
                palabra = String.valueOf(c);
            }
            fraseCamel+=palabra;
            primera=false;
        }
        System.out.println(fraseCamel);
    }
}
