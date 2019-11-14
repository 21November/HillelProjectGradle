package practiceit3;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TinyUrlService {

    @POST ("randome")
    @FormUrlEncoded
    Call<TinyUrlService> random (@Field("format") String format, @Field("url") String url);
}
