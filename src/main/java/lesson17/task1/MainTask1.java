package task1;

import okhttp3.*;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class MainTask1 {

    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://google.com")
                .build();


        client.newCall(request).enqueue(new Callback() {
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        try (FileWriter fileWriter = new FileWriter("Google.txt")) {
                            // Fetch request data
                            String data = responseBody.string();
                            System.out.println(data);

                            fileWriter.write(data);
                        }
                    }
                }
            }
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
        });

        ExecutorService service = client.dispatcher().executorService();
        shutdownAndAwaitTermination(service);
    }
    static void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown();
        try {
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow();
                if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                    System.err.println("Pool did not terminate");
                }
            }
        } catch (InterruptedException ie) {
            pool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
