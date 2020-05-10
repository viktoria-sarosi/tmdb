package com.tmdbproject.services;

import com.tmdbproject.models.dtos.ForeignResponse;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service
public class CountriesAPIService {

    private RetrofitServiceGenerator retrofitServiceGenerator;

    public CountriesAPIService(RetrofitServiceGenerator retrofitServiceGenerator) {
        this.retrofitServiceGenerator = retrofitServiceGenerator;
    }

    public List<ForeignResponse> getAll() throws IOException {
        RetrofitIService retrofitIService = RetrofitServiceGenerator.createService(RetrofitIService.class);

        Call<List<ForeignResponse>> call = retrofitIService.renderAllCountriesAndCapitals();
        Response<List<ForeignResponse>> foreignResponse = call.execute();

        return foreignResponse.body();
    }

    public List<ForeignResponse> getByCountry(String country) throws IOException {
        RetrofitIService retrofitIService = RetrofitServiceGenerator.createService(RetrofitIService.class);

        Call<List<ForeignResponse>> call = retrofitIService.renderCountry(country);
        Response<List<ForeignResponse>> foreignResponse = call.execute();

        return foreignResponse.body();

    }
}