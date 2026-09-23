package androidx.compose.material3;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2 implements kotlin.jvm.functions.a {
    public final /* synthetic */ CoroutineScope A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ j5 y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ y2(j5 j5Var, kotlin.jvm.functions.a aVar, CoroutineScope coroutineScope) {
        this.y = j5Var;
        this.z = aVar;
        this.A = coroutineScope;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                j5 j5Var = this.y;
                if (((Boolean) j5Var.c.d.invoke(k5.e)).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.A, null, null, new b3(j5Var, null, 3), 3, null).invokeOnCompletion(new a3(j5Var, this.z, 0));
                }
                break;
            default:
                j5 j5Var2 = this.y;
                int iOrdinal = ((k5) j5Var2.c.g.getValue()).ordinal();
                if (iOrdinal != 1) {
                    CoroutineScope coroutineScope = this.A;
                    if (iOrdinal != 2) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var2, null, 5), 3, null);
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b3(j5Var2, null, 4), 3, null);
                    }
                } else {
                    this.z.invoke();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ y2(j5 j5Var, CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar) {
        this.y = j5Var;
        this.A = coroutineScope;
        this.z = aVar;
    }
}
