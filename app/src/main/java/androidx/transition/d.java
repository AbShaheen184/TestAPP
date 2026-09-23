package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n {
    public boolean a = false;
    public final ViewGroup b;

    public d(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void a() {
        org.jsoup.helper.n.P(this.b, false);
    }

    @Override // androidx.transition.j
    public final void d(m mVar) {
        if (!this.a) {
            org.jsoup.helper.n.P(this.b, false);
        }
        mVar.w(this);
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void e(m mVar) {
        org.jsoup.helper.n.P(this.b, false);
        this.a = true;
    }

    @Override // androidx.transition.n, androidx.transition.j
    public final void f() {
        org.jsoup.helper.n.P(this.b, true);
    }
}
