package androidx.navigation;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y y;

    public /* synthetic */ k(y yVar, int i) {
        this.e = i;
        this.y = yVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i;
        switch (this.e) {
            case 0:
                y yVar = this.y;
                androidx.activity.d0 d0Var = yVar.f;
                boolean z = false;
                if (yVar.g) {
                    kotlin.collections.l lVar = yVar.b.f;
                    if (lVar == null || !lVar.isEmpty()) {
                        Iterator it = lVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((i) it.next()).y instanceof v) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                d0Var.e(z);
                return kotlin.y.a;
            case 1:
                y yVar2 = this.y;
                Context context = yVar2.a;
                l0 l0Var = yVar2.b.t;
                context.getClass();
                l0Var.getClass();
                return new z();
            case 2:
                this.y.c();
                return kotlin.y.a;
            case 3:
                this.y.c();
                return kotlin.y.a;
            case 4:
                this.y.c();
                return kotlin.y.a;
            case 5:
                this.y.c();
                return kotlin.y.a;
            case 6:
                this.y.c();
                return kotlin.y.a;
            case 7:
                this.y.c();
                return kotlin.y.a;
            case 8:
                this.y.c();
                return kotlin.y.a;
            case 9:
                this.y.c();
                return kotlin.y.a;
            case 10:
                this.y.c();
                return kotlin.y.a;
            default:
                this.y.c();
                return kotlin.y.a;
        }
    }
}
