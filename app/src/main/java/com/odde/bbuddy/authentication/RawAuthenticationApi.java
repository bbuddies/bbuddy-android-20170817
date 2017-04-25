package com.odde.bbuddy.authentication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RawAuthenticationApi {

    @POST("/auth/sign_in")
    Call<ResponseBody> authenticate(@Body Credentials credentials);
}
