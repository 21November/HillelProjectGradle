package practiceit2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GoogleWebService {

    @GET("/")
    Call<String> index();
}
