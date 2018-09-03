package trabalho04.ilusoesindustriais.com.trabalho04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import trabalho04.ilusoesindustriais.com.trabalho04.Model.Moto;

public class MotoActivity extends AppCompatActivity {

    private ListView listaMarcasMotos;
    private TextView textoResultado;
    private Button recuperar;
    private Retrofit retrofit;
    private List<Moto> listaMotos = new ArrayList<>();
  /*  private String[] marcasMotos = {

    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);


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
                Call<List<Moto>> call = service.recuperarMoto();

                call.enqueue(new Callback<List<Moto>>() {
                    @Override
                    public void onResponse(Call<List<Moto>> call, Response<List<Moto>> response) {
                        if (response.isSuccessful()){
                            listaMotos = response.body();

                            for (int i=0; i<listaMotos.size(); i++){
                                Moto moto = listaMotos.get(i);
                                // Log.d("resultado", "resultado" + carro.getNome());
                                 textoResultado.setText(moto.getNome());
                             //   String NomeString = moto.getNome.toString();
                             //   listaMotos.add(moto.getNome.toString());
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<List<Moto>> call, Throwable t) {

                    }
                });




            }
        });






    /*    listaMarcasMotos = findViewById(R.id.listViewMotosId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                marcasMotos
        );
        listaMarcasMotos.setAdapter( adaptador);*/
    }
}
