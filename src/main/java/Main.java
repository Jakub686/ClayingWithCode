import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {
        HashMap<String, Object> map = new HashMap<>();
        //json
        Person person1 = new Person("a","b","c",new Address("aaa","bbb"));
        //json into temp object
        Request request = new Request("set","1",person1);
        //object into map
        Person person2 = person1;

        map.put("1",person2);
        map.put("2","hello");
        Object obj = map.get("1");
        System.out.println(obj);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonStr = mapper.writeValueAsString(map);
        System.out.println("Json before save in a file" + jsonStr);

        //write json into file
        BufferedWriter write = new BufferedWriter(new FileWriter("C:\\ClayingWithCode\\src\\main\\java\\db.json"));
        write.write(jsonStr);
        write.close();
        }catch (IOException e){
        }

    }
}
