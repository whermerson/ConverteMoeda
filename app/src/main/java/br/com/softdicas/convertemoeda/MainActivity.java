package br.com.softdicas.convertemoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import br.com.softdicas.convertemoeda.models.LatestCatalog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textViewResultado;
    EditText editText1;
    EditText editText2;
    EditText editTextValor;
    Button button;

    public float valor1;
    public float valor2;
    public float valor3;
    public float valor4;
    public float valor5;
    public float valor6;
    public float valor7;
    public float valor8;
    public float valor9;
    public float valor10;
    public float valor11;
    public float valor12;
    public float valor13;
    public float valor14;
    public float valor15;
    public float valor16;
    public float valor17;
    public float valor18;
    public float valor19;
    public float valor20;
    public float valor21;
    public float valor22;
    public float valor23;
    public float valor24;
    public float valor25;
    public float valor26;
    public float valor27;
    public float valor28;
    public float valor29;
    public float valor30;
    public float valor31;

    public float valorOrigem;
    public float valorDestino;
    public float valorCliente;
    public float valorConvertido;

    public float cambio;

    public float valorResultado;

    String moeda1;
    String moeda2;
    String qtdMoeda1;

    DecimalFormat f;
    String valorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textViewResultado = findViewById(R.id.textViewResultado);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editTextValor = findViewById(R.id.editTextValor);
        button = findViewById(R.id.button);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.exchangeratesapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ExchangeService service = retrofit.create(ExchangeService.class);
        final Call<LatestCatalog> requestCatalog = service.listCatalog();


        requestCatalog.enqueue(new Callback<LatestCatalog>() {
            @Override
            public void onResponse(Call<LatestCatalog> call, Response<LatestCatalog> response) {
                if(!response.isSuccessful()){
                } else {
                    //Requisição retornou com sucesso
                    LatestCatalog catalog = response.body();

                    valor1  = Float.parseFloat(catalog.rates.HKD);
                    valor2  = Float.parseFloat(catalog.rates.ISK);
                    valor3  = Float.parseFloat(catalog.rates.PHP);
                    valor4  = Float.parseFloat(catalog.rates.DKK);
                    valor5  = Float.parseFloat(catalog.rates.HUF);
                    valor6  = Float.parseFloat(catalog.rates.CZK);
                    valor7  = Float.parseFloat(catalog.rates.AUD);
                    valor8  = Float.parseFloat(catalog.rates.RON);
                    valor9  = Float.parseFloat(catalog.rates.SEK);
                    valor10 = Float.parseFloat(catalog.rates.IDR);
                    valor11 = Float.parseFloat(catalog.rates.INR);
                    valor12 = Float.parseFloat(catalog.rates.BRL);
                    valor13 = Float.parseFloat(catalog.rates.RUB);
                    valor14 = Float.parseFloat(catalog.rates.HRK);
                    valor15 = Float.parseFloat(catalog.rates.JPY);
                    valor16 = Float.parseFloat(catalog.rates.THB);
                    valor17 = Float.parseFloat(catalog.rates.CHF);
                    valor18 = Float.parseFloat(catalog.rates.SGD);
                    valor19 = Float.parseFloat(catalog.rates.PLN);
                    valor20 = Float.parseFloat(catalog.rates.BGN);
                    valor21 = Float.parseFloat(catalog.rates.TRY);
                    valor22 = Float.parseFloat(catalog.rates.CNY);
                    valor23 = Float.parseFloat(catalog.rates.NOK);
                    valor24 = Float.parseFloat(catalog.rates.NZD);
                    valor25 = Float.parseFloat(catalog.rates.ZAR);
                    valor26 = Float.parseFloat(catalog.rates.USD);
                    valor27 = Float.parseFloat(catalog.rates.MXN);
                    valor28 = Float.parseFloat(catalog.rates.ILS);
                    valor29 = Float.parseFloat(catalog.rates.GBP);
                    valor30 = Float.parseFloat(catalog.rates.KRW);
                    valor31 = Float.parseFloat(catalog.rates.MYR);

                }
            }

            @Override
            public void onFailure(Call<LatestCatalog> call, Throwable t) {
                Log.i("TAG3", "ERRO :" + t.getMessage());
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moeda1 = editText1.getText().toString();
                moeda2 = editText2.getText().toString();
                qtdMoeda1 = editTextValor.getText().toString();

                switch (moeda1) {
                    case "HKD":
                        valorOrigem = valor1;
                        break;
                    case "ISK":
                        valorOrigem = valor2;
                        break;
                    case "PHP":
                        valorOrigem = valor3;
                        break;
                    case "DKK":
                        valorOrigem = valor4;
                        break;
                    case "HUF":
                        valorOrigem = valor5;
                        break;
                    case "CZK":
                        valorOrigem = valor6;
                        break;
                    case "AUD":
                        valorOrigem = valor7;
                        break;
                    case "RON":
                        valorOrigem = valor8;
                        break;
                    case "SEK":
                        valorOrigem = valor9;
                        break;
                    case "IDR":
                        valorOrigem = valor10;
                        break;
                    case "INR":
                        valorOrigem = valor11;
                        break;
                    case "BRL":
                        valorOrigem = valor12;
                        break;
                    case "RUB":
                        valorOrigem = valor13;
                        break;
                    case "HRK":
                        valorOrigem = valor14;
                        break;
                    case "JPY":
                        valorOrigem = valor15;
                        break;
                    case "THB":
                        valorOrigem = valor16;
                        break;
                    case "CHF":
                        valorOrigem = valor17;
                        break;
                    case "SGD":
                        valorOrigem = valor18;
                        break;
                    case "PLN":
                        valorOrigem = valor19;
                        break;
                    case "BGN":
                        valorOrigem = valor20;
                        break;
                    case "TRY":
                        valorOrigem = valor21;
                        break;
                    case "CNY":
                        valorOrigem = valor22;
                        break;
                    case "NOK":
                        valorOrigem = valor23;
                        break;
                    case "NZD":
                        valorOrigem = valor24;
                        break;
                    case "ZAR":
                        valorOrigem = valor25;
                        break;
                    case "USD":
                        valorOrigem = valor26;
                        break;
                    case "MXN":
                        valorOrigem = valor27;
                        break;
                    case "ILS":
                        valorOrigem = valor28;
                        break;
                    case "GBP":
                        valorOrigem = valor29;
                        break;
                    case "KRW":
                        valorOrigem = valor30;
                        break;
                    case "MYR":
                        valorOrigem = valor31;
                        break;
                }

                switch (moeda2) {
                    case "HKD":
                        valorDestino = valor1;
                        break;
                    case "ISK":
                        valorDestino = valor2;
                        break;
                    case "PHP":
                        valorDestino = valor3;
                        break;
                    case "DKK":
                        valorDestino = valor4;
                        break;
                    case "HUF":
                        valorDestino = valor5;
                        break;
                    case "CZK":
                        valorDestino = valor6;
                        break;
                    case "AUD":
                        valorDestino = valor7;
                        break;
                    case "RON":
                        valorDestino = valor8;
                        break;
                    case "SEK":
                        valorDestino = valor9;
                        break;
                    case "IDR":
                        valorDestino = valor10;
                        break;
                    case "INR":
                        valorDestino = valor11;
                        break;
                    case "BRL":
                        valorDestino = valor12;
                        break;
                    case "RUB":
                        valorDestino = valor13;
                        break;
                    case "HRK":
                        valorDestino = valor14;
                        break;
                    case "JPY":
                        valorDestino = valor15;
                        break;
                    case "THB":
                        valorDestino = valor16;
                        break;
                    case "CHF":
                        valorDestino = valor17;
                        break;
                    case "SGD":
                        valorDestino = valor18;
                        break;
                    case "PLN":
                        valorDestino = valor19;
                        break;
                    case "BGN":
                        valorDestino = valor20;
                        break;
                    case "TRY":
                        valorDestino = valor21;
                        break;
                    case "CNY":
                        valorDestino = valor22;
                        break;
                    case "NOK":
                        valorDestino = valor23;
                        break;
                    case "NZD":
                        valorDestino = valor24;
                        break;
                    case "ZAR":
                        valorDestino = valor25;
                        break;
                    case "USD":
                        valorDestino = valor26;
                        break;
                    case "MXN":
                        valorDestino = valor27;
                        break;
                    case "ILS":
                        valorDestino = valor28;
                        break;
                    case "GBP":
                        valorDestino = valor29;
                        break;
                    case "KRW":
                        valorDestino = valor30;
                        break;
                    case "MYR":
                        valorDestino = valor31;
                        break;
                }

                valorCliente = Float.parseFloat(qtdMoeda1);

                cambio = 1/valorOrigem;

                valorConvertido = cambio*valorCliente*valorDestino;

                f = new DecimalFormat("#.##");
                valorFinal = f.format(valorConvertido);
                Log.i("TAG", "valor Final: "+valorFinal);

                textViewResultado.setText(valorFinal);

                Toast.makeText(MainActivity.this, "Deu Certo "+valorDestino, Toast.LENGTH_SHORT).show();

            }
        });

    }

}
