package com.brijesh.sampleandroidproject.views;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brijesh.sampleandroidproject.R;
import com.brijesh.sampleandroidproject.models.Repository;
import com.brijesh.sampleandroidproject.utilities.LogHelper;
import com.brijesh.sampleandroidproject.utilities.RepoLoader;

import java.util.List;
import java.util.Locale;

/**
 * An activity representing a list of Repositories. This activity has different presentations for handset and
 * tablet-size devices. On handsets, the activity presents a list of items, which when touched, lead to a
 * {@link RepositoryDetailActivity} representing item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */
public class RepositoryListActivity extends AppCompatActivity implements LoaderManager
        .LoaderCallbacks<List<Repository>> {
    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    public Loader<List<Repository>> onCreateLoader(int id, Bundle args) {
        return new RepoLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<List<Repository>> loader, List<Repository> data) {
        findViewById(R.id.loading_progressBar).setVisibility(View.GONE);
        View errorView = findViewById(R.id.error_view);
        if (data != null) {
            if (errorView.getVisibility() != View.GONE) {
                errorView.setVisibility(View.GONE);
            }
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.repository_list);
            recyclerView.setAdapter(new RepositoryViewAdapter(data));
        } else {
            if (errorView.getVisibility() != View.VISIBLE) {
                errorView.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onLoaderReset(Loader<List<Repository>> loader) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.repository_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        getSupportLoaderManager().initLoader(RepoLoader.IDENTIFIER, null, this);
    }

    class RepositoryViewAdapter extends RecyclerView.Adapter<RepositoryViewAdapter.ViewHolder> {
        private final List<Repository> mItems;

        RepositoryViewAdapter(List<Repository> repositories) {
            mItems = repositories;
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            final Repository repository = mItems.get(position);
            holder.mItem = repository;
            holder.mIdView.setText(String.format(Locale.US, "%d", repository.getId()));
            holder.mContentView.setText(repository.getName());
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTwoPane) {
                        Bundle arguments = new Bundle();
                        arguments.putSerializable(RepositoryDetailFragment.ARG_REPOSITORY, holder.mItem);
                        RepositoryDetailFragment fragment = new RepositoryDetailFragment();
                        fragment.setArguments(arguments);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.repository_detail_container, fragment)
                                .commit();
                    } else {
                        try {
                            Context context = v.getContext();
                            Intent intent = new Intent(context, RepositoryDetailActivity.class);
                            intent.putExtra(RepositoryDetailFragment.ARG_REPOSITORY, holder.mItem);

                            context.startActivity(intent);
                        } catch (Exception ex) {
                            LogHelper.logError("Could not start details", ex);
                        }
                    }
                }
            });
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.repository_list_content, parent, false);
            return new ViewHolder(view);
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private Repository mItem;
            final View mView;
            final TextView mIdView;
            final TextView mContentView;

            ViewHolder(View view) {
                super(view);
                mView = view;
                mIdView = (TextView) view.findViewById(R.id.id);
                mContentView = (TextView) view.findViewById(R.id.content);
            }
        }
    }
}
