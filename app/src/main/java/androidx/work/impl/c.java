package androidx.work.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                String str = (String) this.d;
                WorkDatabase workDatabase = dVar.e;
                androidx.work.impl.model.v vVarX = workDatabase.x();
                vVarX.getClass();
                str.getClass();
                arrayList.addAll((List) okhttp3.internal.platform.android.g.t(vVarX.a, true, false, new androidx.compose.material3.r(str, 22)));
                return workDatabase.w().c(str);
            default:
                return ((com.google.firebase.concurrent.e) this.b).e.submit(new androidx.media3.ui.c0(15, (Callable) this.c, (com.google.android.gms.tasks.q) this.d));
        }
    }
}
