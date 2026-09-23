package retrofit2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z0 {
    public static final i0 c = new i0();

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        okhttp3.v vVar = (okhttp3.v) obj;
        if (vVar != null) {
            com.google.android.datatransport.runtime.j jVar = o0Var.i;
            jVar.getClass();
            ((ArrayList) jVar.A).add(vVar);
        }
    }
}
