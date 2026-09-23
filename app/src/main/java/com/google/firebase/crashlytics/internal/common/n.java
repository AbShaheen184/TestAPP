package com.google.firebase.crashlytics.internal.common;

import com.appsalt.internal.k0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ q y;
    public final /* synthetic */ k0 z;

    public /* synthetic */ n(q qVar, k0 k0Var, int i) {
        this.e = i;
        this.y = qVar;
        this.z = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.a(this.z);
                break;
            default:
                this.y.a(this.z);
                break;
        }
    }
}
