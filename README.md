# SampleAndroidProject
A rudimentary sample project testing the use of Retrofit and RecyclerView.

The main activity and starting point of the app is `RepositoryListActivity`. This hosts a `RecyclerView` that's backed by a `List` of `Repository` objects. This `List` is fetched in an `AsyncTaskLoader` and is used to back the `Adapter` in the `RecyclerView`.

Clicking on a list item starts another activity `RepositoryDetailActivity`, which hosts `RepositoryDetailFragment` that shows the name of the repository as the title, the description of the repository, and the GitHub link.

The original list of repositories is fetched by making a network call using the `Retrofit` library.
