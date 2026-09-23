package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreate() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L47
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L45
            androidx.startup.a r0 = androidx.startup.a.c(r0)
            java.lang.Class r1 = r4.getClass()
            android.content.Context r2 = r0.c
            java.lang.String r3 = "Startup"
            java.lang.String r3 = kotlin.math.a.S(r3)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.getProviderInfo(r3, r2)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Bundle r1 = r1.metaData     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            r0.a(r1)     // Catch: java.lang.Throwable -> L37 android.content.pm.PackageManager.NameNotFoundException -> L39
            android.os.Trace.endSection()
            goto L45
        L37:
            r0 = move-exception
            goto L41
        L39:
            r0 = move-exception
            androidx.compose.ui.res.e r1 = new androidx.compose.ui.res.e     // Catch: java.lang.Throwable -> L37
            r2 = 2
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L41:
            android.os.Trace.endSection()
            throw r0
        L45:
            r0 = 1
            return r0
        L47:
            androidx.compose.ui.res.e r0 = new androidx.compose.ui.res.e
            java.lang.String r1 = "Context cannot be null"
            r2 = 2
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.startup.InitializationProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
