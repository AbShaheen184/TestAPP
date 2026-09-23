package androidx.room;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;
    public final String b;
    public final androidx.sqlite.db.a c;
    public final androidx.collection.internal.b d;
    public final List e;
    public final boolean f;
    public final q g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;
    public final boolean o;
    public final androidx.sqlite.b p;
    public final kotlin.coroutines.j q;
    public boolean r;

    public a(Context context, String str, androidx.sqlite.db.a aVar, androidx.collection.internal.b bVar, List list, boolean z, q qVar, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z4, androidx.sqlite.b bVar2, kotlin.coroutines.j jVar) {
        context.getClass();
        bVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = bVar;
        this.e = list;
        this.f = z;
        this.g = qVar;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = set;
        this.m = list2;
        this.n = list3;
        this.o = z4;
        this.p = bVar2;
        this.q = jVar;
        this.r = true;
    }
}
