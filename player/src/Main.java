import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Object> matriculas = new HashMap();

        matriculas.put(1, "matricula");

        matriculas.put(2, 1);

        Object obj = matriculas.get(2);

        if(obj != null && obj instanceof Integer){

        }
        if(obj == null)

        if(obj instanceof String) {
            String matricula = (String) obj;
        }

//        Integer[] inteiros = new Integer[]{1,2,3,4,5};
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        String texto = " sldkfjlsdf   ";

//        if(texto != null && texto.trim().length() > 0){

        System.out.println("Hello world!");
    }
}