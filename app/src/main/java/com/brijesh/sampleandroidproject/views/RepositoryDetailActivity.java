package com.brijesh.sampleandroidproject.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import com.brijesh.sampleandroidproject.R;

/**
 * An activity representing a single Repository detail screen. This activity is only used narrow width devices. On
 * tablet-size devices, item details are presented side-by-side with a list of items in a
 * {@link RepositoryListActivity}.
 */
public class RepositoryDetailActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            navigateUpTo(new Intent(this, RepositoryListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putSerializable(RepositoryDetailFragment.ARG_REPOSITORY, getIntent().getSerializableExtra
                    (RepositoryDetailFragment.ARG_REPOSITORY));
            RepositoryDetailFragment fragment = new RepositoryDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.repository_detail_container, fragment)
                    .commit();
        }
    }
}
