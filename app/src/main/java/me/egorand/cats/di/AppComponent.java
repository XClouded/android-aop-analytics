/*
 * Copyright 2015 Egor Andreevici
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package me.egorand.cats.di;

import android.content.Context;
import android.view.LayoutInflater;

import com.bumptech.glide.RequestManager;
import com.google.android.gms.analytics.Tracker;

import javax.inject.Singleton;

import dagger.Component;
import de.greenrobot.event.EventBus;
import me.egorand.cats.analytics.AnalyticsTrackerHelper;
import me.egorand.cats.rest.ImgurApiClient;
import me.egorand.cats.ui.activities.CatViewerActivity;
import me.egorand.cats.ui.activities.MainActivity;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity activity);

    void inject(CatViewerActivity activity);

    @Singleton Context appContext();

    ImgurApiClient imgurApiClient();

    LayoutInflater layoutInflater();

    @Singleton RequestManager glideRequestManager();

    @Singleton EventBus eventBus();

    @Singleton Tracker analyticsTracker();

    @Singleton AnalyticsTrackerHelper analyticsTrackerHelper();
}