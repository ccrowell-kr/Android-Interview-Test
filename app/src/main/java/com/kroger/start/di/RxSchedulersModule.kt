package com.kroger.start.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Qualifier

/**
 * A module to bind a few Rx Schedulers to the dependency graph, in case they are needed.
 */
@Module
@InstallIn(SingletonComponent::class)
class RxSchedulersModule {
    @Provides
    @RxMainThread
    fun provideMainThreadScheduler(): Scheduler = AndroidSchedulers.mainThread()

    @Provides
    fun provideScheduler(): Scheduler = Schedulers.io()
}

/**
 * A qualifier to get an Rx Scheduler that will run on the main thread.
 */
@Qualifier
annotation class RxMainThread
