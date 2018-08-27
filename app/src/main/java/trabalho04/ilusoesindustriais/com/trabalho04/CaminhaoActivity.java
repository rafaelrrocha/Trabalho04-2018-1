package trabalho04.ilusoesindustriais.com.trabalho04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CaminhaoActivity extends AppCompatActivity {

    private ListView listaMarcasCaminhoes;
    private String[] marcasCaminhoes = {
            "AGRALE", "BEPOBUS", "CHEVROLET", "CICCOBUS", "DAF",
            "EFFA-JMC", "FIAT", "FORD", "FOTON", "GMC", "HYUNDAI",
            "IVECO", "MAN", "MARCOPOLO", "MASCARELLO", "MAXIBUS",
            "MERCEDES-BENZ", "NAVISTAR", "NEOBUS", "PUMA-ALFA",
            "SAAB-SCANIA", "SCANIA", "SHACMAN", "SINOTRUCK",
            "VOLKSWAGEN", "VOLVO", "WALKBUS"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caminhao);

        listaMarcasCaminhoes = findViewById(R.id.listViewCaminhoesId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                marcasCaminhoes
        );
        listaMarcasCaminhoes.setAdapter( adaptador);

    }
}
