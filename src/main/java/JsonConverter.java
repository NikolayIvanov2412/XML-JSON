import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonConverter {
    public static void convertAndWriteJSON(List<Employee> employees, String outputFilePath) throws IOException {
        JSONArray array = new JSONArray();

        for (Employee employee : employees) {
            JSONObject obj = new JSONObject();
            obj.put("id", employee.getId());
            obj.put("firstName", employee.getFirstName());
            obj.put("lastName", employee.getLastName());
            obj.put("country", employee.getCountry());
            obj.put("age", employee.getAge());

            array.put(obj);
        }

        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write(array.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}