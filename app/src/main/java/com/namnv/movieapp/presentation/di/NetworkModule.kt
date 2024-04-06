package com.namnv.movieapp.presentation.di

import android.util.Log
import com.namnv.movieapp.data.JwtStore
import com.namnv.movieapp.data.apis.AccountResourceApi
import com.namnv.movieapp.data.apis.AuthenticateControllerApi
import com.namnv.movieapp.data.apis.AuthorityResourceApi
import com.namnv.movieapp.data.apis.GenresResourceApi
import com.namnv.movieapp.data.apis.HistoryResourceApi
import com.namnv.movieapp.data.apis.MovieGenresResourceApi
import com.namnv.movieapp.data.apis.MovieResourceApi
import com.namnv.movieapp.data.apis.MovieResourceResourceApi
import com.namnv.movieapp.data.apis.PaymentResourceApi
import com.namnv.movieapp.data.apis.PremiumResourceApi
import com.namnv.movieapp.data.apis.UserResourceApi
import com.namnv.movieapp.data.infrastructure.ApiClient
import okhttp3.Interceptor
import org.koin.dsl.module

val networkModule = module {
    single {
        ApiClient().setLogger { message ->
            Log.i("ApiClient", message)
        }.addAuthorization("jwt", Interceptor { chain ->
            val original = chain.request()
            val jwt = get<JwtStore>().getStoredJwt()
            val request = original.newBuilder()
                .header("Authorization", "Bearer $jwt")
                .method(original.method, original.body)
                .build()
            Log.i("ApiClient", "Adding jwt to request")
            Log.i("ApiClient", "Jwt: $jwt")
            return@Interceptor chain.proceed(request)
        })

    }
    single { get<ApiClient>().createService(AuthenticateControllerApi::class.java) }
    single {get<ApiClient>().createService(MovieResourceApi::class.java)}
    single {get<ApiClient>().createService(AccountResourceApi::class.java)}
    single {get<ApiClient>().createService(AuthorityResourceApi::class.java)}
    single {get<ApiClient>().createService(GenresResourceApi::class.java)}
    single {get<ApiClient>().createService(HistoryResourceApi::class.java)}
    single {get<ApiClient>().createService(MovieResourceResourceApi::class.java)}
    single {get<ApiClient>().createService(MovieGenresResourceApi::class.java)}
    single {get<ApiClient>().createService(PaymentResourceApi::class.java)}
    single { get<ApiClient>().createService(PremiumResourceApi::class.java) }
    single { get<ApiClient>().createService(UserResourceApi::class.java) }


}