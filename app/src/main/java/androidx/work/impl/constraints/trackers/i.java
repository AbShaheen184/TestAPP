package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.os.Build;
import androidx.navigation.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final Context a;
    public final u b;
    public final a c;
    public final g d;
    public final u e;

    public i(Context context, androidx.work.impl.utils.taskexecutor.c cVar) {
        g gVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        a aVar = new a(applicationContext, cVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        a aVar2 = new a(applicationContext2, cVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = f.a;
            gVar = new g(applicationContext3, cVar);
        } else {
            gVar = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        a aVar3 = new a(applicationContext4, cVar, 2);
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = gVar;
        this.e = aVar3;
    }
}
