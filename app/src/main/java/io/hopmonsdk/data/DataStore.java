package io.hopmonsdk.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class DataStore {
    private static DataStore instance;
    private final Context context;

    public DataStore(Context context) {
        this.context = context;
    }

    public static synchronized DataStore getInstance(Context context) {
        try {
            if (instance == null) {
                instance = new DataStore(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    private SharedPreferences pref() {
        Context context = this.context;
        return context.getSharedPreferences(context.getString(R.string.hopmon_preference_file_key), 0);
    }

    public boolean contains(String str) {
        return pref().contains(str);
    }

    public String get(String str) {
        return pref().getString(str, null);
    }

    public int getInt(String str, int i) {
        return pref().getInt(str, i);
    }

    public long getLong(String str, long j) {
        return pref().getLong(str, j);
    }

    public boolean has(String str) {
        return pref().contains(str);
    }

    public boolean is(String str) {
        return pref().getBoolean(str, false);
    }

    public void set(String str, int i) {
        pref().edit().putInt(str, i).apply();
    }

    public String get(String str, String str2) {
        return pref().getString(str, str2);
    }

    public void set(String str, long j) {
        pref().edit().putLong(str, j).apply();
    }

    public void set(String str, String str2) {
        pref().edit().putString(str, str2).apply();
    }

    public void set(String str, boolean z) {
        pref().edit().putBoolean(str, z).apply();
    }
}
