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
package com.arychagov.deviceinfo.config;

import android.content.Context;
import android.os.Build;

import java.util.HashMap;
import java.util.Map;

public class BuildConfigProvider extends ConfigProvider {
    public BuildConfigProvider(final Context context) {
        super(context);
    }

    @Override
    public Map<String, String> provideConfiguration() {
        final Map<String, String> result = new HashMap<>();
        result.put("SDK_INT", String.valueOf(Build.VERSION.SDK_INT));
        result.put("ID", Build.ID);
        result.put("DISPLAY", Build.DISPLAY);
        result.put("PRODUCT", Build.PRODUCT);
        result.put("DEVICE", Build.DEVICE);
        result.put("BOARD", Build.BOARD);
        result.put("CPU_ABI", Build.CPU_ABI);
        result.put("CPU_ABI2", Build.CPU_ABI2);
        result.put("BRAND", Build.BRAND);
        result.put("MODEL", Build.MODEL);
        result.put("BOOTLOADER", Build.BOOTLOADER);
        result.put("RADIO", Build.RADIO);
        result.put("HARDWARE", Build.HARDWARE);
        result.put("TYPE", Build.TYPE);
        result.put("TAGS", Build.TAGS);
        result.put("FINGERPRINT", Build.FINGERPRINT);
        result.put("MANUFACTURER", Build.MANUFACTURER);
        return result;
    }
}
