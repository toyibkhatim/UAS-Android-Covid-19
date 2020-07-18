
package id.toyib_khatim.covninfo.service;

import java.util.List;

import id.toyib_khatim.covninfo.model.HistoryModel;
import id.toyib_khatim.covninfo.model.IndonesiaProvinsiModel;
import id.toyib_khatim.covninfo.model.IndonesiaSummaryModel;
import id.toyib_khatim.covninfo.model.WorldSummaryModel;
import id.toyib_khatim.covninfo.utilities.AppUtils;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiEndpoint {
    //Endpoint riwayat
    @GET(AppUtils.END_POINT_WORLD_HISTORY)
    Call<List<HistoryModel>> getHistoryList(@Path("date")String date);

    //Endpointt Ringkasan Dunia
    @GET(AppUtils.END_POINT_SUMMARY_WORLD)
    Call<WorldSummaryModel> getSummaryWorld();

    //Endpoint Ringkasan Indonesia
    @GET(AppUtils.ENDPOINT_SUMMARY_INDONESIA)
    Call<List<IndonesiaSummaryModel>> getSummaryIdn();

    //Endpoint Provinsi Indonesia
    @GET(AppUtils.ENDPOINT_INDONESIA_PROVINSI)
    Call<List<IndonesiaProvinsiModel>> getProvince();


}
