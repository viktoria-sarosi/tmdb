package com.tmdbproject.services;

import com.tmdbproject.models.dtos.ForeignResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface RetrofitIService {
    @GET("name/{name}?fields=capital;region;population")
    Call<ForeignResponse> renderCountry(@Path("name") String countryName);

    @GET("all?fields=name;capital")
    Call<List<ForeignResponse>> renderAllCountriesAndCapitals();
}
