package practiceit2;

import practiceit2.GoogleWebService;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class MainGoogle {

    public static void main(String[] args) {
        GoogleWebService service = new Retrofit.Builder()
                .baseUrl("http://google.com/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()
                .create(GoogleWebService.class);

        try{
            Response<String> response = service.index().execute();
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }

    }
}
