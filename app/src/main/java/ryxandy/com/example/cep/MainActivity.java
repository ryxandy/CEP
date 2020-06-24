package ryxandy.com.example.cep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Declaração dos widgts
     final EditText edtCep = (EditText) findViewById(R.id.edtCEP);
           ImageView imgLogo = (ImageView) findViewById(R.id.imgLogo);
     final  TextView txtEndereço   = (TextView) findViewById(R.id.txtEnd);
        final  TextView txtCEP    = (TextView) findViewById(R.id.txtCEP);
        final  TextView txtEstado   = (TextView) findViewById(R.id.txtEstado);
        final  TextView txtCidade   = (TextView) findViewById(R.id.txtCidade);
        final  TextView txtCodIBGE   = (TextView) findViewById(R.id.txtCodIBGE);
        final  TextView txtComplemento   = (TextView) findViewById(R.id.txtComplemento);



      Button btnPesquisar = (Button) findViewById(R.id.btnPesquisar);

        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtCep.getText().toString().length()>0 && !edtCep.getText().equals("") && edtCep.getText().toString().length() == 8){

                    //Apenas para testar se a validação está funcionando


                    HTTPService service = new HTTPService(edtCep.getText().toString());
                    try {
                        //aqui executa o serviço e coloca na variável retorno
                        CEP retorno = service.execute().get();
                       //seta o retorno dentro do textView resposável
                        txtEndereço.setText(retorno.getLogradouro());
                        txtCEP.setText(retorno.getCep());
                        txtEstado.setText(retorno.getUf());
                        txtCidade.setText(retorno.getLocalidade());
                        txtCodIBGE.setText(retorno.getCodibge());
                        txtComplemento.setText(retorno.getComplemento());
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    Log.i("Teste","CEP Inválido! ");
                }
            }
        });



    }
}
