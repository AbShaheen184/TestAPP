package io.hopmonsdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.platforminfo.b;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class AppUtils {
    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            b.p(e, "Could not get package name: ");
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("context.getPackageName()", 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            b.p(e, "Could not get package name: ");
            return null;
        }
    }
}
