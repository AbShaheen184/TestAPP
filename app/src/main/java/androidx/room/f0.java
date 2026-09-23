package androidx.room;

import android.database.SQLException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ k0 A;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(k0 k0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                f0 f0Var = new f0(this.A, dVar, 0);
                f0Var.z = obj;
                return f0Var;
            default:
                f0 f0Var2 = new f0(this.A, dVar, 1);
                f0Var2.z = obj;
                return f0Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((f0) create((androidx.room.coroutines.k) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((f0) create((a0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                androidx.room.coroutines.k kVar = (androidx.room.coroutines.k) this.z;
                this.y = 1;
                Object objA = k0.a(this.A, kVar, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objA == aVar ? aVar : objA;
            default:
                int i2 = this.y;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            a0Var = (a0) this.z;
                            kotlin.a.e(obj);
                        } else {
                            if (i2 != 2) {
                                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.a.e(obj);
                        }
                        return (Set) obj;
                    }
                    kotlin.a.e(obj);
                    a0Var = (a0) this.z;
                    this.z = a0Var;
                    this.y = 1;
                    obj = a0Var.c(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        z zVar = z.y;
                        f0 f0Var = new f0(this.A, null, 0);
                        this.z = null;
                        this.y = 2;
                        obj = a0Var.a(zVar, f0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return kotlin.collections.y.e;
        }
    }
}
