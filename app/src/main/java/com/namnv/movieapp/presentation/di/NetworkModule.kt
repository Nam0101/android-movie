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
        val apiClient = ApiClient().setLogger { message ->
            Log.i("API", message)
        }
        apiClient.addInterceptor(Interceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
                .method(original.method, original.body)

            // Kiểm tra nếu URL không phải là URL đăng nhập
            if (!original.url.encodedPath.contains("authenticate")) {
                val jwt = get<JwtStore>().getStoredJwt()
                requestBuilder.header("Authorization", "Bearer $jwt")
                Log.i("ApiClient", "Adding jwt to request")
                Log.i("ApiClient", "Jwt: $jwt")
            }

            val request = requestBuilder.build()
            return@Interceptor chain.proceed(request)
        })
        apiClient // Return the apiClient instance
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