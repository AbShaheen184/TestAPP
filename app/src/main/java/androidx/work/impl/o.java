package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final String i = androidx.work.y.g("WorkContinuationImpl");
    public final t a;
    public final String b;
    public final androidx.work.m c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public androidx.work.a0 h;

    public o(t tVar, String str, androidx.work.m mVar, List list, int i2) {
        this.a = tVar;
        this.b = str;
        this.c = mVar;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (mVar == androidx.work.m.e && ((k0) list.get(i3)).b.u != Long.MAX_VALUE) {
                kotlinx.coroutines.future.a.q("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((k0) list.get(i3)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(o oVar) {
        HashSet hashSet = new HashSet();
        oVar.getClass();
        return hashSet;
    }

    public final androidx.work.a0 a() {
        if (this.g) {
            androidx.work.y.e().h(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            t tVar = this.a;
            this.h = v.K(tVar.b.m, "EnqueueRunnable_" + this.c.name(), ((androidx.work.impl.utils.taskexecutor.c) tVar.d).a, new androidx.navigation.internal.h(this, 8));
        }
        return this.h;
    }
}
