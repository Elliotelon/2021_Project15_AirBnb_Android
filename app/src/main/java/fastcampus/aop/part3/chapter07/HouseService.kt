package fastcampus.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/5709bdc7-bea8-4a05-af0e-d5704c6232a6")
    fun getHouseList(): Call<HouseDto>
}