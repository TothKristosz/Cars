import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    List<DataSource> data = new ArrayList<>();


    public void task1() throws IOException {
        List<String> input = Files.readAllLines(Paths.get("jarmuvek.txt"));
        for (int i = 1; i < input.size(); i++) {
            data.add(new DataSource(input.get(i).split("\t")));
        }
        System.out.println(data.size());
    }
}
