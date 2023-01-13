import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Object> matriculas = new HashMap();

        matriculas.put(1, "matricula");

        matriculas.put(2, 1);

        Object obj = matriculas.get(2);

        if(obj instanceof String) {
            String matricula = (String) obj;
        }

        System.out.println("Hello world!");
    }
}