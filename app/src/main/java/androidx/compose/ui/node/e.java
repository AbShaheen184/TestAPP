package androidx.compose.ui.node;

import androidx.compose.runtime.x2;
import androidx.compose.ui.platform.q2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new e(i, 0);
        A = new e(i, 1);
        B = new e(i, 2);
        C = new e(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2) {
        super(i);
        this.y = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                ((Number) obj2).intValue();
                ((h) obj).getClass();
                break;
            case 1:
                ((f0) ((h) obj)).e0((androidx.compose.ui.layout.q0) obj2);
                break;
            case 2:
                ((f0) ((h) obj)).f0((androidx.compose.ui.r) obj2);
                break;
            default:
                androidx.compose.runtime.b0 b0Var = (androidx.compose.runtime.b0) obj2;
                f0 f0Var = (f0) ((h) obj);
                f0Var.Z = b0Var;
                a1 a1Var = f0Var.d0;
                x2 x2Var = androidx.compose.ui.platform.l1.h;
                androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) b0Var;
                jVar.getClass();
                f0Var.b0((androidx.compose.ui.unit.c) androidx.compose.runtime.t.s(jVar, x2Var));
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) androidx.compose.runtime.t.s(jVar, androidx.compose.ui.platform.l1.n);
                if (f0Var.X != mVar) {
                    f0Var.X = mVar;
                    f0Var.E();
                    f0 f0VarV = f0Var.v();
                    if (f0VarV != null) {
                        f0VarV.C();
                    }
                    f0Var.D();
                    for (androidx.compose.ui.q qVar = (androidx.compose.ui.q) a1Var.g; qVar != null; qVar = qVar.C) {
                        qVar.O();
                    }
                }
                f0Var.g0((q2) androidx.compose.runtime.t.s(jVar, androidx.compose.ui.platform.l1.s));
                androidx.compose.ui.q qVar2 = (androidx.compose.ui.q) a1Var.g;
                if ((qVar2.A & 32768) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.z & 32768) != 0) {
                            ?? E = qVar2;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof i) {
                                    androidx.compose.ui.q qVar3 = ((androidx.compose.ui.q) ((i) E)).e;
                                    if (qVar3.K) {
                                        e1.c(qVar3);
                                    } else {
                                        qVar3.G = true;
                                    }
                                } else if ((E.z & 32768) != 0 && (E instanceof k)) {
                                    androidx.compose.ui.q qVar4 = ((k) E).M;
                                    int i = 0;
                                    while (qVar4 != null) {
                                        if ((qVar4.z & 32768) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar4;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar4);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar4 = qVar4.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                    } else {
                                        E = E;
                                        bVar = bVar;
                                    }
                                }
                                E = l.e(bVar);
                            }
                        }
                        if ((qVar2.A & 32768) != 0) {
                            qVar2 = qVar2.C;
                        }
                    }
                }
                break;
        }
        return kotlin.y.a;
    }
}
