package com.app.mlounge.ui.screens.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.a1;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ x(Context context, a1 a1Var, int i) {
        this.e = i;
        this.y = context;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean z;
        switch (this.e) {
            case 0:
                Context context = this.y;
                try {
                    File cacheDir = context.getCacheDir();
                    boolean zG = cacheDir != null ? kotlin.io.j.g(cacheDir) : true;
                    File externalCacheDir = context.getExternalCacheDir();
                    z = zG && (externalCacheDir != null ? kotlin.io.j.g(externalCacheDir) : true);
                    break;
                } catch (Exception unused) {
                }
                this.z.setValue(e0.u(context));
                Toast.makeText(context, z ? "Cache Cleared" : "There was an error clearing the cache", 0).show();
                break;
            default:
                Context context2 = this.y;
                this.z.setValue(Boolean.FALSE);
                try {
                    Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                    intent.setData(Uri.parse("package:" + context2.getPackageName()));
                    context2.startActivity(intent);
                } catch (Exception unused2) {
                    context2.startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                }
                break;
        }
        return kotlin.y.a;
    }
}
