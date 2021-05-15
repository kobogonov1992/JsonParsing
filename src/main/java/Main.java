import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(" https://www.7timer.info/bin/astro.php?lon=74.59&lat=42.88&ac=0&unit=metric&output=json&tzshift=0").build();

        Call call = okHttpClient.newCall(request);
        ObjectMapper objectMapper = new ObjectMapper();

        Response response = call.execute();
        System.out.println(response.isSuccessful());

        Technology jsonTech =objectMapper.readValue(response.body().string(), new TypeReference<Technology>() {});
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonTech);
        System.out.println(json);
    }
}

class Main2{
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("https://cat-fact.herokuapp.com/facts").build();

        Call call = okHttpClient.newCall(request);
        ObjectMapper objectMapper = new ObjectMapper();

        Response response = call.execute();
        System.out.println(response.isSuccessful());

        List<Cat> catList =  objectMapper.readValue( response.body().string(), new TypeReference<List<Cat>>() {} );
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(catList);
        System.out.println(json);
    }
}


