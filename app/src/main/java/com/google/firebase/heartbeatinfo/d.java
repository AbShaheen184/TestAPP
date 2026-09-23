package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.android.gms.tasks.s;
import com.google.firebase.components.n;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f, g {
    public final n a;
    public final Context b;
    public final com.google.firebase.inject.b c;
    public final Set d;
    public final Executor e;

    public d(Context context, String str, Set set, com.google.firebase.inject.b bVar, Executor executor) {
        this.a = new n(new com.google.firebase.c(context, str));
        this.d = set;
        this.e = executor;
        this.c = bVar;
        this.b = context;
    }

    public final s a() {
        if (!com.google.firebase.b.L(this.b)) {
            return org.jsoup.helper.n.o("");
        }
        return org.jsoup.helper.n.h(this.e, new c(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            org.jsoup.helper.n.o(null);
        } else if (!com.google.firebase.b.L(this.b)) {
            org.jsoup.helper.n.o(null);
        } else {
            org.jsoup.helper.n.h(this.e, new c(this, 1));
        }
    }
}
