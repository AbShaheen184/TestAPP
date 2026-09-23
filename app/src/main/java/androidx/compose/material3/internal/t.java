package androidx.compose.material3.internal;

import android.content.Context;
import androidx.compose.material3.j6;
import androidx.compose.material3.l6;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                t tVar = new t((j6) this.z, dVar, 0);
                tVar.y = ((Boolean) obj).booleanValue();
                return tVar;
            default:
                t tVar2 = new t((Context) this.z, dVar, 1);
                tVar2.y = ((Boolean) obj).booleanValue();
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (i) {
            case 0:
                t tVar = (t) create(bool, dVar);
                kotlin.y yVar = kotlin.y.a;
                tVar.invokeSuspend(yVar);
                return yVar;
            default:
                t tVar2 = (t) create(bool, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                tVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                if (!this.y) {
                    ((l6) ((j6) obj2)).a();
                }
                break;
            default:
                kotlin.a.e(obj);
                androidx.work.impl.utils.h.a((Context) obj2, RescheduleReceiver.class, this.y);
                break;
        }
        return yVar;
    }
}
