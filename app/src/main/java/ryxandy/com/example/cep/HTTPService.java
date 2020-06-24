package ryxandy.com.example.cep;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, CEP> {

    private  final  String cep;

    public HTTPService(String cep) {
        this.cep = cep;
    }

    @Override
    protected CEP doInBackground(Void... voids) {

    StringBuilder resposta = new StringBuilder();

        try {
          //Estabelecendo a URL do webservice e concatenando pra não ficar fixo o cep
            URL url = new URL("https://viacep.com.br/ws/" + this.cep + "/json/");

           //Fazendo a conexão
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //Metodo para request
            connection.setRequestMethod("GET");
            // TIpo de retorno
            connection.setRequestProperty("Accept", "application/json");
            //Tempo de timeout da execução da consulta
            connection.setConnectTimeout(5000);
            //Fazendo a conexão finalmente
            connection.connect();

            //Pegando a resposta usando a classe Scanner
          Scanner scanner = new Scanner(url.openStream());

          //Enquanto o scanner tiver linhas, adiciona na string Resposta lá do StringBuilder
            while (scanner.hasNextLine()) {
                resposta.append(scanner.next());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(resposta.toString(), CEP.class);
    }
}
