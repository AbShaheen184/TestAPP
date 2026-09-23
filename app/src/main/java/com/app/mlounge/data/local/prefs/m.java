package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object e;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = str;
        this.z = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        m mVar = new m(this.y, this.z, dVar);
        mVar.e = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((androidx.datastore.preferences.core.a) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        mVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.e;
        kotlin.a.e(obj);
        String str = this.y;
        if (str == null) {
            aVar.d(y1.s0);
            aVar.d(y1.t0);
            aVar.d(y1.u0);
            aVar.d(y1.v0);
            aVar.d(y1.w0);
        } else {
            aVar.e(y1.s0, str);
            aVar.e(y1.t0, new Long(this.z));
        }
        return kotlin.y.a;
    }
}
