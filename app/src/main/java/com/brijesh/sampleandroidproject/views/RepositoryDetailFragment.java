package com.brijesh.sampleandroidproject.views;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brijesh.sampleandroidproject.R;
import com.brijesh.sampleandroidproject.models.Repository;

/**
 * A fragment representing a single Repository detail screen. This fragment is either contained in a
 * {@link RepositoryListActivity} in two-pane mode (on tablets) or a {@link RepositoryDetailActivity} on handsets.
 */
public class RepositoryDetailFragment extends Fragment {

    /**
     * The fragment argument representing the current repository item that this fragment represents
     */
    public static final String ARG_REPOSITORY = "repository";

    private Repository mRepository;

    public RepositoryDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Bundle args = getArguments();
        if (args.containsKey(ARG_REPOSITORY)) {
            mRepository = (Repository) args.getSerializable(ARG_REPOSITORY);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mRepository.getName());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.repository_detail, container, false);

        if (mRepository != null) {
            ((TextView) rootView.findViewById(R.id.repository_description)).setText(mRepository.getDescription());

            final String url = mRepository.getHtmlUrl();
            TextView link = (TextView) rootView.findViewById(R.id.repository_url);
            link.setText(url);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }
            });
        }

        return rootView;
    }
}
