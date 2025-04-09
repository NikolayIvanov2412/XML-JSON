import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Employee> employees = XmlParser.parseXML("data.xml");
        JsonConverter.convertAndWriteJSON(employees, "data2.json");

        System.out.println("Преобразование выполнено успешно!");
    }
}