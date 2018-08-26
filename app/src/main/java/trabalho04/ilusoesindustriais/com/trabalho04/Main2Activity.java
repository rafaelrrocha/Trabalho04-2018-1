package trabalho04.ilusoesindustriais.com.trabalho04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    private ImageButton carroButton;
    private ImageButton motoButton;
    private ImageButton caminhaoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         carroButton = findViewById(R.id.carroButtonId);
         motoButton = findViewById(R.id.motoButtonId);
         caminhaoButton = findViewById(R.id.caminhaoButtonId);

        carroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, CarroActivity.class));

            }
        });

        motoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MotoActivity.class));
            }
        });

        caminhaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, CaminhaoActivity.class));
            }
        });

    }
}
