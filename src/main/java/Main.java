import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        Person person = new Person("a","b","c",new Address("aaa","bbb"));

        map.put("1",person);
        Object obj = map.get("1");
        System.out.println(obj);

    }
}
