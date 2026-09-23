package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.text.selection.q0;
import androidx.media3.common.i0;
import com.caverock.androidsvg.x1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k {
    public Context e;

    public /* synthetic */ g(Context context) {
        this.e = context;
    }

    public com.google.android.datatransport.runtime.l a() {
        Context context = this.e;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        com.google.android.datatransport.runtime.l lVar = new com.google.android.datatransport.runtime.l();
        lVar.e = com.google.android.datatransport.runtime.dagger.internal.a.a(com.google.android.datatransport.runtime.n.a);
        com.google.android.datatransport.runtime.backends.d dVar = new com.google.android.datatransport.runtime.backends.d(context, 1);
        lVar.y = dVar;
        lVar.z = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.backends.f(dVar, new com.google.android.datatransport.runtime.backends.d(dVar, 0), 0));
        com.google.android.datatransport.runtime.backends.d dVar2 = lVar.y;
        lVar.A = new com.google.android.datatransport.runtime.scheduling.persistence.c(dVar2, 1);
        javax.inject.a aVarA = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.backends.f(lVar.A, com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.scheduling.persistence.c(dVar2, 0)), 1));
        lVar.B = aVarA;
        com.google.android.datatransport.runtime.o oVar = new com.google.android.datatransport.runtime.o(1);
        com.google.android.datatransport.runtime.backends.d dVar3 = lVar.y;
        com.google.android.datatransport.runtime.t tVar = new com.google.android.datatransport.runtime.t(dVar3, aVarA, oVar, 1);
        javax.inject.a aVar = lVar.e;
        javax.inject.a aVar2 = lVar.z;
        lVar.C = com.google.android.datatransport.runtime.dagger.internal.a.a(new com.google.android.datatransport.runtime.t(new com.google.android.datatransport.runtime.scheduling.b(aVar, aVar2, tVar, aVarA, aVarA), new com.google.android.datatransport.runtime.scheduling.jobscheduling.i(dVar3, aVar2, aVarA, tVar, aVar, aVarA, aVarA), new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(aVar, aVarA, tVar, aVarA), 0));
        return lVar;
    }

    @Override // androidx.media3.exoplayer.mediacodec.k
    public l k(x1 x1Var) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.e) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new com.google.android.gms.common.internal.k(11).k(x1Var);
        }
        int i2 = i0.i(((androidx.media3.common.r) x1Var.c).o);
        androidx.media3.common.util.b.k("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(androidx.media3.common.util.i0.H(i2)));
        q0 q0Var = new q0(new androidx.media3.exoplayer.q(i2, 3), new androidx.media3.exoplayer.q(i2, 4));
        q0Var.y = true;
        return q0Var.k(x1Var);
    }
}
