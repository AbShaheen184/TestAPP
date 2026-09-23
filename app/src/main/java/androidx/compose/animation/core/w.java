package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements i {
    public final com.google.firebase.messaging.n a;
    public final l2 b;
    public final Object c;
    public final s d;
    public final s e;
    public final s f;
    public final Object g;
    public final long h;

    public w(x xVar, l2 l2Var, Object obj, s sVar) {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(xVar.a, 2);
        this.a = nVar;
        this.b = l2Var;
        this.c = obj;
        s sVar2 = (s) l2Var.a.invoke(obj);
        this.d = sVar2;
        this.e = e.g(sVar);
        kotlin.jvm.functions.l lVar = l2Var.b;
        if (((s) nVar.B) == null) {
            nVar.B = sVar2.c();
        }
        s sVar3 = (s) nVar.B;
        if (sVar3 == null) {
            kotlin.jvm.internal.l.f("targetVector");
            throw null;
        }
        int iB = sVar3.b();
        int i = 0;
        while (true) {
            s sVar4 = (s) nVar.B;
            if (i >= iB) {
                if (sVar4 == null) {
                    kotlin.jvm.internal.l.f("targetVector");
                    throw null;
                }
                this.g = lVar.invoke(sVar4);
                com.google.firebase.messaging.n nVar2 = this.a;
                s sVar5 = this.d;
                if (((s) nVar2.A) == null) {
                    nVar2.A = sVar5.c();
                }
                s sVar6 = (s) nVar2.A;
                if (sVar6 == null) {
                    kotlin.jvm.internal.l.f("velocityVector");
                    throw null;
                }
                int iB2 = sVar6.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) nVar2.y;
                    sVar5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((androidx.compose.animation.b1) eVar.y).b(sVar.a(i2)) / (((double) androidx.compose.animation.c1.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                s sVarG = e.g(this.a.y(jMax, this.d, sVar));
                this.f = sVarG;
                int iB3 = sVarG.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    s sVar7 = this.f;
                    float fA = sVar7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    sVar7.e(i3, kotlin.collections.i0.c(fA, -0.0f, 0.0f));
                }
                return;
            }
            if (sVar4 == null) {
                kotlin.jvm.internal.l.f("targetVector");
                throw null;
            }
            com.app.mlounge.data.music.e eVar2 = (com.app.mlounge.data.music.e) nVar.y;
            float fA2 = sVar2.a(i);
            float fA3 = sVar.a(i);
            androidx.compose.animation.b1 b1Var = (androidx.compose.animation.b1) eVar2.y;
            double dB = b1Var.b(fA3);
            double d = androidx.compose.animation.c1.a;
            int i4 = i;
            sVar4.e(i4, (Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (b1Var.a * b1Var.b))))) + fA2);
            i = i4 + 1;
        }
    }

    @Override // androidx.compose.animation.core.i
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.i
    public final long b() {
        return this.h;
    }

    @Override // androidx.compose.animation.core.i
    public final l2 c() {
        return this.b;
    }

    @Override // androidx.compose.animation.core.i
    public final s d(long j) {
        if (e(j)) {
            return this.f;
        }
        return this.a.y(j, this.d, this.e);
    }

    @Override // androidx.compose.animation.core.i
    public final Object f(long j) {
        if (e(j)) {
            return this.g;
        }
        kotlin.jvm.functions.l lVar = this.b.b;
        com.google.firebase.messaging.n nVar = this.a;
        s sVar = (s) nVar.z;
        s sVar2 = this.d;
        if (sVar == null) {
            nVar.z = sVar2.c();
        }
        s sVar3 = (s) nVar.z;
        if (sVar3 == null) {
            kotlin.jvm.internal.l.f("valueVector");
            throw null;
        }
        int iB = sVar3.b();
        int i = 0;
        while (true) {
            s sVar4 = (s) nVar.z;
            if (i >= iB) {
                if (sVar4 != null) {
                    return lVar.invoke(sVar4);
                }
                kotlin.jvm.internal.l.f("valueVector");
                throw null;
            }
            if (sVar4 == null) {
                kotlin.jvm.internal.l.f("valueVector");
                throw null;
            }
            com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) nVar.y;
            float fA = sVar2.a(i);
            long j2 = j / 1000000;
            androidx.compose.animation.a1 a1VarA = ((androidx.compose.animation.b1) eVar.y).a(this.e.a(i));
            long j3 = a1VarA.c;
            sVar4.e(i, (Math.signum(a1VarA.a) * a1VarA.b * androidx.compose.animation.b.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.i
    public final Object g() {
        return this.g;
    }
}
