package retrofit2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {
    public final f d;
    public final boolean e;

    public s(q0 q0Var, okhttp3.y yVar, m mVar, f fVar, boolean z) {
        super(q0Var, yVar, mVar);
        this.d = fVar;
        this.e = z;
    }

    @Override // retrofit2.t
    public final Object a(z zVar, Object[] objArr) {
        d dVar = (d) this.d.b(zVar);
        kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) objArr[objArr.length - 1];
        try {
            if (!this.e) {
                return z0.b(dVar, dVar2);
            }
            dVar.getClass();
            return z0.c(dVar, dVar2);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            z0.p(th, dVar2);
            return kotlin.coroutines.intrinsics.a.e;
        }
    }
}
