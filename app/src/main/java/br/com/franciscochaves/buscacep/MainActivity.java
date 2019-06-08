package br.com.franciscochaves.buscacep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.franciscochaves.buscacep.model.CEP;
import br.com.franciscochaves.buscacep.util.HttpService;

public class MainActivity extends AppCompatActivity {

    private Button mBtnBuscarCep;
    private EditText mCep;
    private TextView mResultadoCep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnBuscarCep = findViewById(R.id.button_pesquisar);
        mCep = findViewById(R.id.edit_cep);
        mResultadoCep = findViewById(R.id.text_resultado);

        mBtnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mCep.getText().toString().trim().length() == 8) {
                    try {
                        CEP values = new HttpService(mCep.getText().toString()).execute().get();
                        mResultadoCep.setText(values.toString());
                    } catch (Exception e) {
                        mResultadoCep.setText("Ocorreu algum erro na consulta");
                    }
                } else {
                    mResultadoCep.setText("CEP informado está incorreto");


                }
            }
        });
    }

}
