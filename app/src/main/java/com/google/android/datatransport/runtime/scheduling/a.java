package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.s;
import com.google.android.datatransport.runtime.scheduling.persistence.g;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Logger f = Logger.getLogger(s.class.getName());
    public final j a;
    public final Executor b;
    public final e c;
    public final g d;
    public final g e;

    public a(Executor executor, e eVar, j jVar, g gVar, g gVar2) {
        this.b = executor;
        this.c = eVar;
        this.a = jVar;
        this.d = gVar;
        this.e = gVar2;
    }
}
