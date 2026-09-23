package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final String c = y.g("WorkProgressUpdater");
    public final WorkDatabase a;
    public final androidx.work.impl.utils.taskexecutor.c b;

    public o(WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.c cVar) {
        this.a = workDatabase;
        this.b = cVar;
    }
}
