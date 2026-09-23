package coil3.network.internal;

import coil3.network.r;
import okio.f;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public r e;
    public f y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return n.J(null, this);
    }
}
