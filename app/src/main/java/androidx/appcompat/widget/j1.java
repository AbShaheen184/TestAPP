package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends DataSetObserver {
    public final /* synthetic */ m1 a;

    public j1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        m1 m1Var = this.a;
        if (m1Var.S.isShowing()) {
            m1Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
