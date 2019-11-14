package task2;

import com.google.gson.Gson;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        List<BingImage> list = new ArrayList<>();

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://www.bing.com/HPImageArchive.aspx?format=js&idx=0&n=1&mkt=en-US")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {

                try(ResponseBody responseBody = response.body()) {
                    String data = responseBody.string();
                    Gson gson = new Gson();
                    BingResponse bingResponse = gson.fromJson(data, BingResponse.class);
                    for (BingImage bingImage : bingResponse.images){
                        downloadField(client, "http://www.bing.com" + bingImage.url, bingImage.hsh + ".jpg");
                    }

                }
            }
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("Ошибка на первом шаге " + e.getMessage());
            }
        });

        loggingInterceptor(client);
    }

    public static void downloadField (OkHttpClient client, String url,String fieldName){
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                try(ResponseBody responseBody = response.body()){
                    InputStream inputStream = responseBody.byteStream();
                    try(OutputStream outputStream = new FileOutputStream(fieldName)){
                        copyStream(inputStream, outputStream);
                    }
                }
            }
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("Ошибка при сохранении файла " + e.getMessage());
            }
        });
    }

    public static void copyStream (InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[1000];
        int readCount = inputStream.read(buffer);

        while (readCount > 0){
            outputStream.write(buffer, 0, readCount);
            readCount = inputStream.read(buffer);
        }
    }

    public static OkHttpClient loggingInterceptor(OkHttpClient client){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(message -> System.out.println(String.format(
                "[%d]: %s", Thread.currentThread().getId(), message)));
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        return client;
    }
}
