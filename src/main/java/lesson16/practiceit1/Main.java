package practiceit1;

import practiceit1.GitHubService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final  Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.github.com")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        final GitHubService service = retrofit.create(GitHubService.class);


        Response<String> response = null;
        try{
            Call<String> request = service.listRepos("octocat");
            response = request.execute();
        } catch (IOException e){
            System.out.println("Failed to make request to github:" + e.getMessage());
        }

        if (response != null){
            if (response.isSuccessful()){
                // successful response
                String responseBody = response.body();
                System.err.println(responseBody);
            }else {
                //failed response
                try {
                    String errorBody = response.errorBody().string();
                    System.err.println("Server responded with error: " + errorBody);
                }catch (IOException e){
                    System.err.println("Failed to get error body: " + e.getMessage());
                }

            }
        }
    }
}
