package trabalho04.ilusoesindustriais.com.trabalho04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CarroActivity extends AppCompatActivity {

    private ListView listaMarcasCarros;
    private String[] marcasCarros = {
            "AM Gen", "ASTON MARTIN", "Acura", "Agrale", "Alfa Romeo", "Asia Motors", "Audi",
            "BMW", "BRM", "Baby", "Bugre", "CBT Jipe", "CHANA", "CHANGAN", "CHERY", "Cadillac",
            "Chrysler", "Citroen", "Cross Lander", "Daewoo", "Daihatsu", "Dodge", "EFFA",
            "Engesa", "Envemo", "FOTON", "Ferrari", "Fiat", "Fibravan", "Ford", "Fyber",
            "GEELY", "GM - Chevrolet", "GREAT WALL", "Gurgel", "HAFEI", "Honda", "Hyundai",
            "IVECO", "Isuzu", "JAC", "JINBEI", "JPX", "Jaguar", "Jeep", "Kia Motors", "LAMBORGHINI",
            "LIFAN", "LOBINI", "Lada", "Land Rover", "Lexus", "Lotus", "MG", "MINI", "Mahindra",
            "Maserati", "Matra", "Mazda", "Mercedes-Benz", "Mercury", "Mitsubishi", "Miura",
            "Nissan", "Peugeot", "Plymouth", "Pontiac", "Porsche", "RAM", "RELY", "Renault",
            "Rolls-Royce", "Rover", "SHINERAY", "SSANGYONG", "Saab", "Saturn", "Seat", "Subaru",
            "Suzuki", "TAC", "Toyota", "Troller", "VW - VolksWagen", "Volvo", "Wake", "Walk", "smart"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);

        listaMarcasCarros = findViewById(R.id.listViewCarrosId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                marcasCarros
        );
        listaMarcasCarros.setAdapter( adaptador);


    }
}
