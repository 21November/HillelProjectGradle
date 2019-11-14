package practiceit3;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.imageio.IIOException;
import java.io.IOException;

public class MainPost {

    public static void main(String[] args) {
        final TinyUrlService service = new Retrofit.Builder()
                .baseUrl("http://tiny-url.info/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(TinyUrlService.class);

        Response<TinyUrlResponse> response;
        try {
            response = service.random("json", "http://tiny-url.info/open_api.html").execute();
        } catch (IOException ex){
            System.err.println("ERROR: " + ex.getMessage());
        }

        if (response != null && response.isSuccessful()){
            System.out.println(response.body().shortUrl);
        } else if (response != null) {
            try {
                System.out.println(response.errorBody().string());
            } catch (IOException e){
                System.out.println("ERROR : " + e.getMessage());
            }

        }

    }
}
