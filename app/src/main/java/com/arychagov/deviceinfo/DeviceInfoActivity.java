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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class DeviceInfoActivity extends FragmentActivity {
    private ViewPager mPager;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

        mPager = (ViewPager) findViewById(R.id.view_pager);
        mPager.setAdapter(new DeviceInfoPagerAdapter(getSupportFragmentManager()));
    }


    private class DeviceInfoPagerAdapter extends FragmentPagerAdapter {
        public DeviceInfoPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int i) {
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
