package com.brijesh.sampleandroidproject.utilities;

import com.brijesh.sampleandroidproject.models.Repository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Interface class that contains the endpoint definitions for making GitHub API calls
 */

interface GitHubService {
    String BASE_URL = "https://api.github.com/";

    @Headers("Accept: application/vnd.github.v3+json")
    @GET("orgs/{org}/repos")
    Call<List<Repository>> listRepos(@Path("org") String org);
}
