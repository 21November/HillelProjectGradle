package practiceit1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("users/{user}/ repos")
    Call<String> listRepos(@Path("user") String aUser);
}
