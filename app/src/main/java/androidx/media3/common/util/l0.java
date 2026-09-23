package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public l0(Context context, Looper looper, d0 d0Var) {
        this.a = 0;
        this.d = new androidx.localbroadcastmanager.content.b(context.getApplicationContext());
        this.e = d0Var.a(looper, null);
        this.f = d0Var.a(Looper.getMainLooper(), null);
    }

    public void a(final boolean z, final boolean z2) {
        f0 f0Var = (f0) this.e;
        if (z && z2) {
            f0Var.d(new Runnable() { // from class: androidx.media3.common.util.j0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.localbroadcastmanager.content.b.i((androidx.localbroadcastmanager.content.b) this.e.d, z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        f0 f0Var2 = (f0) this.f;
        f0Var2.a.postDelayed(new androidx.activity.c(7, this, atomicBoolean), 1000L);
        f0Var.d(new Runnable() { // from class: androidx.media3.common.util.k0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                androidx.localbroadcastmanager.content.b.i((androidx.localbroadcastmanager.content.b) this.e.d, z, z2);
            }
        });
    }

    public void b(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (this.b) {
            a(true, z);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.b + ", prettyPrintIndent='" + ((String) this.d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((kotlinx.serialization.json.a) this.f) + ')';
            default:
                return super.toString();
        }
    }

    public l0() {
        this.a = 2;
        this.b = true;
        this.d = "    ";
        this.e = "type";
        this.c = true;
        this.f = kotlinx.serialization.json.a.y;
    }

    public l0(Context context, String str, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z, boolean z2) {
        this.a = 1;
        context.getClass();
        lVar.getClass();
        this.d = context;
        this.e = str;
        this.f = lVar;
        this.b = z;
        this.c = z2;
    }
}
