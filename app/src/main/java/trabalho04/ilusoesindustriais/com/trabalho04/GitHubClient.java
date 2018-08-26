package trabalho04.ilusoesindustriais.com.trabalho04;

import java.util.List;

//import io.futurestud.retrofit1.api.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubClient>> reposForUser(@Path("user") String user);
}
