package trabalho04.ilusoesindustriais.com.trabalho04;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import trabalho04.ilusoesindustriais.com.trabalho04.Model.Carro;
import trabalho04.ilusoesindustriais.com.trabalho04.Model.Marca;
import trabalho04.ilusoesindustriais.com.trabalho04.Model.Moto;

public interface DataService {

    @GET("/marcas")
    Call<List<Carro>> recuperarCarro(); /*(@Path("carro") String carro);*/

    @GET("/marcas")
    Call<List<Moto>> recuperarMoto(); /*(@Path("carro") String carro);*/
}
