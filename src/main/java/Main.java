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
            Person person = new Person(new Value("Elon Musk",new Car("tesla","2018"), new Rocket("Falco 9", "87")));
            //json into temp object
            Request request = new Request("set", "1", person);
            //object into map
            //Person person2 = person;

            map.put("person", person);
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
            System.out.println("Map from Jason file: " + map.get("person"));

            Person newPerson = (Person) map.get("person");

            System.out.println("only name from person: " + newPerson.getValue().getName());
            System.out.println("only name from person: " + newPerson.getValue());

        } catch (IOException e) {
        }

    }
}
