package androidx.datastore.core;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final MutableStateFlow a;

    public a0() {
        this.a = StateFlowKt.MutableStateFlow(h1.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(androidx.compose.foundation.m0 m0Var, kotlin.coroutines.jvm.internal.c cVar) {
        androidx.room.k kVar;
        if (cVar instanceof androidx.room.k) {
            kVar = (androidx.room.k) cVar;
            int i = kVar.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.z = i - Integer.MIN_VALUE;
            } else {
                kVar = new androidx.room.k(this, cVar);
            }
        } else {
            kVar = new androidx.room.k(this, cVar);
        }
        Object obj = kVar.e;
        int i2 = kVar.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            kVar.z = 1;
            if (this.a.collect(m0Var, kVar) == kotlin.coroutines.intrinsics.a.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            kotlin.a.e(obj);
        }
        com.google.firebase.platforminfo.b.b();
    }

    public f1 b() {
        return (f1) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    public void c(f1 f1Var) {
        MutableStateFlow mutableStateFlow;
        Object value;
        f1 f1Var2;
        f1Var.getClass();
        do {
            mutableStateFlow = this.a;
            value = mutableStateFlow.getValue();
            f1Var2 = (f1) value;
            if ((f1Var2 instanceof v0) || kotlin.jvm.internal.l.a(f1Var2, h1.b)) {
                f1Var2 = f1Var;
            } else if (f1Var2 instanceof c) {
                if (f1Var.a > ((c) f1Var2).a) {
                    f1Var2 = f1Var;
                }
            } else if (!(f1Var2 instanceof j0)) {
                if (f1Var2 instanceof u0) {
                    kotlinx.coroutines.future.a.u("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    coil3.g.a();
                    return;
                }
            }
        } while (!mutableStateFlow.compareAndSet(value, f1Var2));
    }

    public a0(int i) {
        this.a = StateFlowKt.MutableStateFlow(new int[i]);
    }
}
