# MoviesJetpackCompose
Movie Application in Jetpack Compose

# Setup Requirements
First, obtain your API key from [TMDB](https://developers.themoviedb.org/3/getting-started/introduction) and add it in a file named `apikey.properties` within the root directory:

```bash
MOVIE_API_KEY="****"
```

Then, replace it in the `build.gradle(:app)` :

```bash
...
buildConfigField("String", "MOVIE_API_KEY", apikeyProperties['MOVIE_API_KEY'])
```