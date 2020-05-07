package com.tmdbproject.services;


    import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

    @Service
    public class RetrofitServiceGenerator {

        private static final String API_ADDRESS = System.getenv("https://restcountries.eu/rest/v2");

        private static Retrofit.Builder builder
                = new Retrofit.Builder()
                .baseUrl(API_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create());

        private static Retrofit retrofit = builder.build();

        private static OkHttpClient.Builder httpClient
                = new OkHttpClient.Builder();

        public static <S> S createService(Class<S> serviceClass) {
            return retrofit.create(serviceClass);
        }
    }

