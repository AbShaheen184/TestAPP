package androidx.media3.exoplayer.dash.manifest;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final String c;

    public u(com.google.android.material.internal.k kVar) {
        Context context = (Context) kVar.y;
        int iD = com.google.firebase.crashlytics.internal.common.g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(iD);
            this.c = string;
            String strI = androidx.compose.runtime.j.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strI, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b + ", " + this.c;
            case 1:
            default:
                return super.toString();
            case 2:
                return "<" + this.b + ">: " + this.c;
        }
    }

    public u(org.jsoup.parser.a aVar, String str, Object[] objArr) {
        aVar.getClass();
        this.b = aVar.m0();
        this.c = String.format(str, objArr);
    }

    public u(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public u(org.jsoup.parser.a aVar, String str) {
        aVar.getClass();
        this.b = aVar.m0();
        this.c = str;
    }
}
