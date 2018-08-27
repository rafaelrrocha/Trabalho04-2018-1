package trabalho04.ilusoesindustriais.com.trabalho04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MotoActivity extends AppCompatActivity {

    private ListView listaMarcasMotos;
    private String[] marcasMotos = {
            "AGRALE", "BMW", "CALOI", "DAFRA", "DUCATI", "FOX",
            "GARINNI", "HARLEY-DAVIDSON", "HONDA", "INDIAN",
            "JIAPENG VOLCANO", "KASINSKI", "KAWASAKI", "LAVRALE",
            "MOTOCAR", "PEUGEOT", "REGAL RAPTOR", "SUNDOWN",
            "SUZUKI", "TIGER", "VENTO", "WUYANG", "YAMAHA", "byCristo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);

        listaMarcasMotos = findViewById(R.id.listViewMotosId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                marcasMotos
        );
        listaMarcasMotos.setAdapter( adaptador);
    }
}
