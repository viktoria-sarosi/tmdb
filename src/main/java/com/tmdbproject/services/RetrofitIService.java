package com.tmdbproject.services;

import com.tmdbproject.models.dtos.ForeignResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface RetrofitIService {
    @GET("name/{name}?fields=name;capital;region;population")
    Call<List<ForeignResponse>> renderCountry(@Path("name") String countryName);

    @GET("all?fields=name;capital;region;population")
    Call<List<ForeignResponse>> renderAllCountriesAndCapitals();
}
