package androidx.sqlite.db.framework;

import android.content.Context;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.sqlite.db.b {
    public final boolean A;
    public final boolean B;
    public final o C;
    public boolean D;
    public final Context e;
    public final String y;
    public final l z;

    public g(Context context, String str, l lVar, boolean z, boolean z2) {
        context.getClass();
        lVar.getClass();
        this.e = context;
        this.y = str;
        this.z = lVar;
        this.A = z;
        this.B = z2;
        this.C = new o(new androidx.navigation.internal.h(this, 7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o oVar = this.C;
        if (oVar.a()) {
            ((f) oVar.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.b
    public final String getDatabaseName() {
        return this.y;
    }

    @Override // androidx.sqlite.db.b
    public final void setWriteAheadLoggingEnabled(boolean z) {
        o oVar = this.C;
        if (oVar.a()) {
            ((f) oVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.D = z;
    }

    @Override // androidx.sqlite.db.b
    public final b z() {
        return ((f) this.C.getValue()).a(true);
    }
}
