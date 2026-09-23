package androidx.core.graphics;

import androidx.media3.common.n0;
import androidx.media3.common.o;
import androidx.media3.common.o0;
import androidx.media3.common.util.m;
import com.google.common.base.q;
import com.google.common.collect.f1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements q, androidx.media3.common.util.l, m {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void c(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    @Override // androidx.media3.common.util.m
    public void f(Object obj, o oVar) {
        ((o0) obj).d(new n0(oVar));
    }

    @Override // com.google.common.base.q
    public Object get() {
        return new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, f1.D);
    }

    @Override // androidx.media3.common.util.l
    public void invoke(Object obj) {
        ((o0) obj).B(new androidx.media3.exoplayer.j(2, new androidx.compose.ui.res.e("Player release timed out.", 1), 1003));
    }
}
