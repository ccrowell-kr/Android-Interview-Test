package com.kroger.start.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideOkHttpClient(
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Singleton
    internal fun provideRetrofit(
        jsonConverterFactory: Converter.Factory,
        okHttpClient: OkHttpClient,
        rxCallAdapter: RxJava3CallAdapterFactory,
    ): Retrofit {
        return Retrofit.Builder().baseUrl("https://xkcd.com/")
            .client(okHttpClient)
            .addCallAdapterFactory(rxCallAdapter)
            .addConverterFactory(jsonConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    internal fun provideJsonConverterFactory(
        moshi: Moshi
    ): Converter.Factory {
        return MoshiConverterFactory.create(moshi)
    }

    @Provides
    @Singleton
    internal fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    internal fun provideRxJavaCallAdapter() = RxJava3CallAdapterFactory.create()

}
