package com.app.mlounge;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.activity.contextaware.b {
    public final /* synthetic */ MainActivity a;

    public k(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // androidx.activity.contextaware.b
    public final void a(androidx.activity.p pVar) {
        MainActivity mainActivity = this.a;
        if (mainActivity.z) {
            return;
        }
        mainActivity.z = true;
        ((s) mainActivity.a()).getClass();
    }
}
