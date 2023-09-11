package demo;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
            .url("https://google.com.sg")
            .build(); // defaults to GET

        Response response;
        try {
            response = client.newCall(request).execute();
            String body = response.body().string();
            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}