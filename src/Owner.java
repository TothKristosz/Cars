import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Owner {
    List<DataSource> data02 = new ArrayList<>();


    public void task1() throws IOException {
        List<String> input = Files.readAllLines(Paths.get("tulaj.txt"));
        for (int i = 1; i < input.size(); i++) {
            data02.add(new DataSource(input.get(i).split("\t")));
        }
        System.out.println(data02.size());
    }
}
