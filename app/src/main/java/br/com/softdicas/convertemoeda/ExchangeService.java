package br.com.softdicas.convertemoeda;

import br.com.softdicas.convertemoeda.models.LatestCatalog;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ExchangeService {

    public static final String BASE_URL = "https://api.exchangeratesapi.io/";

    @GET("latest")
    Call<LatestCatalog> listCatalog();

}
