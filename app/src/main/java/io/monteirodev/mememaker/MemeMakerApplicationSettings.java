package io.monteirodev.mememaker;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import io.monteirodev.mememaker.utils.StorageType;

/**
 * Created by Evan Anger on 8/13/14.
 */
public class MemeMakerApplicationSettings {
    SharedPreferences mSharedPreferences;

    public MemeMakerApplicationSettings(Context context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getStoragePreference() {
        return mSharedPreferences.getString("Storage", StorageType.INTERNAL);
    }

    public void setSharedPreference(String storageType) {
        mSharedPreferences
                .edit()
                .putString("Storage", storageType)
                .apply();
    }
}
