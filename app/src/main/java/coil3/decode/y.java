package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.appsalt.internal.k0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return (AssetFileDescriptor) this.b;
            case 1:
                com.google.firebase.crashlytics.internal.common.m mVar = ((com.google.firebase.crashlytics.internal.common.q) this.b).g;
                mVar.getClass();
                com.google.firebase.crashlytics.internal.concurrency.d.a();
                com.google.android.material.internal.k kVar = mVar.c;
                com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) kVar.z;
                String str = (String) kVar.y;
                cVar.getClass();
                boolean z = true;
                if (new File((File) cVar.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    com.google.firebase.crashlytics.internal.persistence.c cVar2 = (com.google.firebase.crashlytics.internal.persistence.c) kVar.z;
                    cVar2.getClass();
                    new File((File) cVar2.c, str).delete();
                } else if (mVar.e() == null || !mVar.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                k0 k0Var = (k0) ((com.google.android.material.internal.k) this.b).z;
                androidx.media3.container.a aVar = (androidx.media3.container.a) k0Var.f;
                com.google.firebase.crashlytics.internal.settings.c cVar3 = (com.google.firebase.crashlytics.internal.settings.c) k0Var.b;
                String str2 = aVar.e;
                com.google.firebase.crashlytics.internal.concurrency.d.b();
                try {
                    HashMap mapB = androidx.media3.container.a.b(cVar3);
                    com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(str2, mapB);
                    jVar.s("User-Agent", "Crashlytics Android SDK/20.0.5");
                    jVar.s("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    androidx.media3.container.a.a(jVar, cVar3);
                    String strConcat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str3 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return aVar.c(jVar.q());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
        }
    }
}
