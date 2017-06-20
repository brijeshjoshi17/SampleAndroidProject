package com.brijesh.sampleandroidproject.utilities;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.brijesh.sampleandroidproject.models.Repository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Instance of AsyncTaskLoader to fetch the List of Square repositories
 */

public class RepoLoader extends AsyncTaskLoader<List<Repository>> {
    public static final int IDENTIFIER = 19;
    private static final String ORG_SQUARE = "square";
    private static GitHubService sGitHubService;

    private List<Repository> mRepositories;

    public RepoLoader(Context context) {
        super(context);
    }

    @Override
    public void deliverResult(List<Repository> data) {
        mRepositories = data;
        if (isStarted()) {
            super.deliverResult(data);
        }
    }

    @Override
    protected void onReset() {
        super.onReset();
        onStopLoading();
        mRepositories = null;
    }

    @Override
    protected void onStartLoading() {
        if (mRepositories != null) {
            deliverResult(mRepositories);
        } else {
            forceLoad();
        }
    }

    @Override
    public List<Repository> loadInBackground() {
        final GitHubService gitHubService = getGitHubService();
        Call<List<Repository>> call = gitHubService.listRepos(ORG_SQUARE);
        try {
            Response<List<Repository>> response = call.execute();
            return response.body();
        } catch (IOException e) {
            LogHelper.logError("Error fetching repos", e);
        }
        return null;
    }

    /**
     * Get the GitHubService singleton instance
     *
     * @return Instance of GitHubService
     */
    private static GitHubService getGitHubService() {
        if (sGitHubService == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(GitHubService.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            sGitHubService = retrofit.create(GitHubService.class);
        }

        return sGitHubService;
    }
}
