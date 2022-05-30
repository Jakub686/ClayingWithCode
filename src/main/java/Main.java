import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        //json
        Person person1 = new Person("a","b","c",new Address("aaa","bbb"));
        //json into temp object
        Request request = new Request("set","1",person1);
        //object into map
        Person person2 = person1;

        map.put("1",person2);
        Object obj = map.get("1");
        System.out.println(obj);

    }
}
