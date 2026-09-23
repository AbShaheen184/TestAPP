package androidx.activity.compose.internal;

import androidx.navigationevent.e;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final /* synthetic */ b d;

    public a(b bVar, n nVar) {
        this.d = bVar;
        this.a = nVar;
        this.b = false;
    }

    @Override // androidx.navigationevent.e
    public final void a() {
        this.d.e();
    }

    @Override // androidx.navigationevent.e
    public final void b() {
        this.d.f();
    }

    @Override // androidx.navigationevent.e
    public final void c(androidx.navigationevent.b bVar) {
        this.d.g(new androidx.activity.a(bVar));
    }

    @Override // androidx.navigationevent.e
    public final void d(androidx.navigationevent.b bVar) {
        bVar.getClass();
        this.d.h();
    }
}
