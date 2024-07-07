import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Pessoa> map = new HashMap<>();

        Pessoa pessoa3 = new Pessoa("Fulaninho", "789456");
        Pessoa pessoa1 = new Pessoa("Fulaninho", "123654");
        Pessoa pessoa2 = new Pessoa("C3PO", "456123");

        map.put(pessoa1.getCpf(), pessoa1);
        map.put(pessoa2.getCpf(), pessoa2);
        map.put(pessoa3.getCpf(), pessoa3);
        System.out.println(map.get("456123"));
    }

}
