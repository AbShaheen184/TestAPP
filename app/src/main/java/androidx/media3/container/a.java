package androidx.media3.container;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.sqlite.db.d {
    public String e;

    public /* synthetic */ a(String str) {
        this.e = str;
    }

    public static void a(com.google.android.datatransport.runtime.j jVar, com.google.firebase.crashlytics.internal.settings.c cVar) {
        String str = cVar.a;
        if (str != null) {
            jVar.s("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        jVar.s("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        jVar.s("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.5");
        jVar.s("Accept", "application/json");
        jVar.s("X-CRASHLYTICS-DEVICE-MODEL", cVar.b);
        String str2 = cVar.c;
        if (str2 != null) {
            jVar.s("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            jVar.s("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = cVar.e.c().a;
        if (str4 != null) {
            jVar.s("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap b(com.google.firebase.crashlytics.internal.settings.c cVar) {
        HashMap map = new HashMap();
        map.put("build_version", cVar.h);
        map.put("display_version", cVar.g);
        map.put("source", Integer.toString(cVar.i));
        String str = cVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static a d(androidx.media3.common.util.v vVar) {
        String str;
        vVar.N(2);
        int iZ = vVar.z();
        int i = iZ >> 1;
        int iZ2 = ((vVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbP = androidx.compose.runtime.j.p(str);
        sbP.append(i < 10 ? ".0" : ".");
        sbP.append(i);
        return new a(androidx.compose.runtime.j.e(iZ2, iZ2 < 10 ? ".0" : ".", sbP));
    }

    public JSONObject c(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) {
        String str = this.e;
        int i = lVar.y;
        com.google.firebase.crashlytics.internal.b bVar = com.google.firebase.crashlytics.internal.b.a;
        bVar.c("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = (String) lVar.z;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                bVar.d(e, "Failed to parse settings JSON from ".concat(str));
                bVar.d(null, "Settings response " + str2);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (bVar.a(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }

    @Override // androidx.sqlite.db.d
    public String u() {
        return this.e;
    }

    @Override // androidx.sqlite.db.d
    public void G(androidx.sqlite.db.c cVar) {
    }
}
