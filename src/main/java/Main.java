import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {
            HashMap<String, Object> map = new HashMap<>();
            //json
            Person person1 = new Person("a", "b", "c", new Address("aaa", "bbb"));
            //json into temp object
            Request request = new Request("set", "1", person1);
            //object into map
            Person person2 = person1;

            map.put("1", person2);
            map.put("2", "hello");
            Object obj = map.get("1");
            //System.out.println(obj);

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            String jsonStr = mapper.writeValueAsString(map);

            //write json into file
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\ClayingWithCode\\src\\main\\java\\db.json"));
            write.write(jsonStr);
            write.close();

            //read map from json file
            Map<String, Object> map1 = mapper.readValue(new File("C:\\ClayingWithCode\\src\\main\\java\\db.json"), new TypeReference<Map<String, Object>>() {
            });
            //show map
            System.out.println("Map from Jason file: " + map.get("1"));
            System.out.println("Map from Jason file: " + map.get("2"));


        } catch (IOException e) {
        }

    }
}
