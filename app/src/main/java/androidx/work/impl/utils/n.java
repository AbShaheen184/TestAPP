package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.t;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final androidx.work.impl.utils.taskexecutor.c a;
    public final androidx.work.impl.d b;
    public final t c;

    static {
        y.g("WMFgUpdater");
    }

    public n(WorkDatabase workDatabase, androidx.work.impl.d dVar, androidx.work.impl.utils.taskexecutor.c cVar) {
        this.b = dVar;
        this.a = cVar;
        this.c = workDatabase.w();
    }
}
