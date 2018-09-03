package trabalho04.ilusoesindustriais.com.trabalho04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import trabalho04.ilusoesindustriais.com.trabalho04.Model.Carro;

public class CarroActivity extends AppCompatActivity {

    private ListView listaMarcasCarros;
    private TextView textoResultado;
    private Button recuperar;
    private Retrofit retrofit;
    private List<Carro> listaCarros = new ArrayList<>();
    /*private String[] marcasCarros = {

    };*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://parallelum.com.br/fipe/api/v1/carros")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        textoResultado = findViewById(R.id.textoResultadoId);
        recuperar = findViewById(R.id.recuperarId);



        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            DataService service = retrofit.create(DataService.class);
            Call<List<Carro>> call = service.recuperarCarro();

            call.enqueue(new Callback<List<Carro>>() {
                @Override
                public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                    if (response.isSuccessful()){
                        listaCarros = response.body();

                        for (int i=0; i<listaCarros.size(); i++){
                            Carro carro = listaCarros.get(i);
                           // Log.d("resultado", "resultado" + carro.getNome());
                            textoResultado.setText(carro.getNome());
                          //  String NomeString = carro.getNome.toString();
                          //  listaCarros.add(carro.getNome.toString());
                        }

                    }
                }

                @Override
                public void onFailure(Call<List<Carro>> call, Throwable t) {

                }
            });




            }
        });




      //  private void recuperarCarroRetrofit {

           /* DataService dataService = retrofit.create( DataService.class);
            Call<Carro> call = dataService.recuperarCarro("marcas");


            call.enqueue(new Callback<Carro>() {
                @Override
                public void onResponse(Call<Carro> call, Response<Carro> response) {
                    if (response.isSuccessful()){
                        Carro carro = response.body();
                        textoResultado.setText( carro.getNome());
                    }

                }

                @Override
                public void onFailure(Call<Carro> call, Throwable t) {
                    textoResultado.setText("Deu erro");

                }
            });*/


        //}









      /*  listaMarcasCarros = findViewById(R.id.listViewCarrosId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                marcasCarros
        );
        listaMarcasCarros.setAdapter( adaptador);  */


    }
}
