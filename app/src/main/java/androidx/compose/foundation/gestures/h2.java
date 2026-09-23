package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                h2 h2Var = new h2(this.z, dVar, 0);
                h2Var.y = obj;
                return h2Var;
            case 1:
                h2 h2Var2 = new h2(this.z, dVar, 1);
                h2Var2.y = obj;
                return h2Var2;
            case 2:
                h2 h2Var3 = new h2(this.z, dVar, 2);
                h2Var3.y = obj;
                return h2Var3;
            case 3:
                h2 h2Var4 = new h2(this.z, dVar, 3);
                h2Var4.y = obj;
                return h2Var4;
            default:
                h2 h2Var5 = new h2(this.z, dVar, 4);
                h2Var5.y = obj;
                return h2Var5;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                h2 h2Var = (h2) create((q2) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar = kotlin.y.a;
                h2Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                h2 h2Var2 = (h2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar2 = kotlin.y.a;
                h2Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                h2 h2Var3 = (h2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar3 = kotlin.y.a;
                h2Var3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                h2 h2Var4 = (h2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar4 = kotlin.y.a;
                h2Var4.invokeSuspend(yVar4);
                return yVar4;
            default:
                h2 h2Var5 = (h2) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
                kotlin.y yVar5 = kotlin.y.a;
                h2Var5.invokeSuspend(yVar5);
                return yVar5;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        long j = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                r2 r2Var = ((q2) this.y).a;
                r2Var.c(r2Var.k, j, 1);
                break;
            case 1:
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar = com.app.mlounge.data.local.prefs.y1.k0;
                aVar.e(com.app.mlounge.data.local.prefs.y1.n1, new Long(j));
                break;
            case 2:
                androidx.datastore.preferences.core.a aVar2 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar2 = com.app.mlounge.data.local.prefs.y1.k0;
                aVar2.e(com.app.mlounge.data.local.prefs.y1.G0, new Long(j));
                break;
            case 3:
                androidx.datastore.preferences.core.a aVar3 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar3 = com.app.mlounge.data.local.prefs.y1.k0;
                aVar3.e(com.app.mlounge.data.local.prefs.y1.H0, new Long(j));
                break;
            default:
                androidx.datastore.preferences.core.a aVar4 = (androidx.datastore.preferences.core.a) this.y;
                kotlin.a.e(obj);
                androidx.datastore.preferences.core.d dVar4 = com.app.mlounge.data.local.prefs.y1.k0;
                aVar4.e(com.app.mlounge.data.local.prefs.y1.B0, new Long(j));
                break;
        }
        return yVar;
    }
}
