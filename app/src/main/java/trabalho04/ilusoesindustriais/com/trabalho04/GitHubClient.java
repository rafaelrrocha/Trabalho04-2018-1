package trabalho04.ilusoesindustriais.com.trabalho04;

import java.util.List;

//import io.futurestud.retrofit1.api.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/carros/{marcas}")
    Call<List<GitHubClient>> reposForUser(@Path("marcas") String marcas);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://parallelum.com.br/fipe/api/v1")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
