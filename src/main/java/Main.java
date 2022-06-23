import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        String userjson = "src/main/java/json_test.json";

        EntenMapper3000 enten = gson.fromJson(new FileReader(userjson), EntenMapper3000.class);

        System.out.println(enten.tokenFlowReduction);

    }
}
