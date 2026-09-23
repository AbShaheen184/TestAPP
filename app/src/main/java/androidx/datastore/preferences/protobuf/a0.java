package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static u a(long j, Object obj) {
        u uVar = (u) g1.c.h(j, obj);
        if (((s0) uVar).e) {
            return uVar;
        }
        s0 s0Var = (s0) uVar;
        int i = s0Var.z;
        s0 s0VarD = s0Var.d(i == 0 ? 10 : i * 2);
        g1.o(j, obj, s0VarD);
        return s0VarD;
    }
}
