package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements com.google.android.gms.tasks.f {
    public final /* synthetic */ int e;
    public final /* synthetic */ FirebaseMessaging y;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging, int i) {
        this.e = i;
        this.y = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.f
    public final void b(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                if (!this.y.e.k() || rVar.h.a() == null) {
                    return;
                }
                synchronized (rVar) {
                    z = rVar.g;
                }
                if (z) {
                    return;
                }
                rVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.y;
                com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) obj;
                if (aVar != null) {
                    u.f(aVar.e);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
