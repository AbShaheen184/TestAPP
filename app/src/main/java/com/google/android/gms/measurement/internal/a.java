package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ c0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public /* synthetic */ a(c0 c0Var, String str, long j, int i) {
        this.e = i;
        this.y = str;
        this.z = j;
        this.A = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                c0 c0Var = this.A;
                c0Var.v();
                String str = this.y;
                com.google.android.gms.common.internal.x.d(str);
                androidx.collection.f fVar = c0Var.z;
                boolean zIsEmpty = fVar.isEmpty();
                long j = this.z;
                if (zIsEmpty) {
                    c0Var.A = j;
                }
                Integer num = (Integer) fVar.get(str);
                if (num != null) {
                    fVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (fVar.z < 100) {
                    fVar.put(str, 1);
                    c0Var.y.put(str, Long.valueOf(j));
                } else {
                    u0 u0Var = ((p1) c0Var.e).C;
                    p1.m(u0Var);
                    u0Var.F.a("Too many ads visible");
                }
                break;
            default:
                c0 c0Var2 = this.A;
                c0Var2.v();
                String str2 = this.y;
                com.google.android.gms.common.internal.x.d(str2);
                androidx.collection.f fVar2 = c0Var2.z;
                Integer num2 = (Integer) fVar2.get(str2);
                p1 p1Var = (p1) c0Var2.e;
                if (num2 == null) {
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    d3 d3Var = p1Var.I;
                    u0 u0Var3 = p1Var.C;
                    p1.l(d3Var);
                    a3 a3VarZ = d3Var.z(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        fVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        fVar2.remove(str2);
                        androidx.collection.f fVar3 = c0Var2.y;
                        Long l = (Long) fVar3.get(str2);
                        long j2 = this.z;
                        if (l == null) {
                            p1.m(u0Var3);
                            u0Var3.C.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j2 - l.longValue();
                            fVar3.remove(str2);
                            c0Var2.A(str2, jLongValue, a3VarZ);
                        }
                        if (fVar2.isEmpty()) {
                            long j3 = c0Var2.A;
                            if (j3 != 0) {
                                c0Var2.z(j2 - j3, a3VarZ);
                                c0Var2.A = 0L;
                            } else {
                                p1.m(u0Var3);
                                u0Var3.C.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
