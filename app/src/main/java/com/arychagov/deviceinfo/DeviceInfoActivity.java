/***
 Copyright (c) 2014 Anton Rychagov

 Licensed under the Apache License, Version 2.0 (the "License"); you may
 not use this file except in compliance with the License. You may obtain
 a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.arychagov.deviceinfo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.arychagov.deviceinfo.config.BuildConfigProvider;
import com.arychagov.deviceinfo.config.ConfigProvider;
import com.arychagov.deviceinfo.config.ConfigurationConfigProvider;
import com.arychagov.deviceinfo.config.DisplayMetricsConfigProvider;
import com.arychagov.deviceinfo.config.FeaturesConfigProvider;
import com.arychagov.deviceinfo.config.ProcessorConfigProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceInfoActivity extends Activity {

    @SuppressWarnings("InlinedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_device_info);
        final ListView listView = (ListView) findViewById(R.id.info_list);
        final ConfigProvider featuresConfigProvider = new FeaturesConfigProvider(this);
        final ConfigProvider buildConfigProvider = new BuildConfigProvider(this);


        // todo : try to retrieve landscape and portrait configs both
        final ConfigProvider configurationConfigProvider = new ConfigurationConfigProvider(this);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final ConfigProvider landscapeConfigProvider = new DisplayMetricsConfigProvider(this);
        final Map<String, String> landscapeConfig = landscapeConfigProvider.provideConfiguration();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final ConfigProvider portraitConfigProvider = new DisplayMetricsConfigProvider(this);
        final Map<String, String> portraitConfig = portraitConfigProvider.provideConfiguration();
        final ConfigProvider displayConfigProvider = new ConfigProvider(this) {
            @Override
            public Map<String, String> provideConfiguration() {
                final HashMap<String, String> map = new HashMap<>();
                map.putAll(landscapeConfig);
                map.putAll(portraitConfig);
                return map;
            }
        };

        final ConfigProvider processorConfigProvider = new ProcessorConfigProvider(this);
        listView.setAdapter(new ListInfoAdapter(featuresConfigProvider, buildConfigProvider,
                configurationConfigProvider, displayConfigProvider, processorConfigProvider));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.device_info, menu);
        return true;
    }

    @SuppressWarnings("SimplifiableIfStatement")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_show_about) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class ListInfoAdapter extends BaseAdapter {
        protected final List<Map.Entry<String, String>> mConfigProviders;

        public ListInfoAdapter(final ConfigProvider... featuresConfigProvider) {
            mConfigProviders = new ArrayList<>();
            for (final ConfigProvider configProvider : featuresConfigProvider) {
                mConfigProviders.addAll(configProvider.provideConfiguration().entrySet());
            }
        }

        @Override
        public int getCount() {
            return mConfigProviders.size();
        }

        @Override
        public Object getItem(final int position) {
            return null;
        }

        @Override
        public long getItemId(final int position) {
            return 0;
        }

        @Override
        public View getView(final int position, final View convertView, final ViewGroup parent) {
            final Map.Entry<String, String> stringStringEntry = mConfigProviders.get(position);
            final LayoutInflater from = LayoutInflater.from(DeviceInfoActivity.this);
            final View inflate = from.inflate(R.layout.item, parent, false);
            ((TextView) inflate.findViewById(R.id.key)).setText(stringStringEntry.getKey());
            ((TextView) inflate.findViewById(R.id.value)).setText(stringStringEntry.getValue());
            return inflate;
        }
    }
}
