package com.app.mlounge.data.iptv;

import android.content.Context;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.functions.l lVar, String str, l lVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$onProgress = lVar;
        this.$url = str;
        this.this$0 = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b(this.$onProgress, this.$url, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Exception {
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        this.$onProgress.invoke("Downloading EPG data (this may take a while)...");
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(this.$url);
        a0Var.b("User-Agent", "Mozilla/5.0");
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        okhttp3.y yVar = this.this$0.client;
        yVar.getClass();
        int size = 0;
        g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
        if (!g0VarE.N) {
            throw new Exception(androidx.privacysandbox.ads.adservices.java.internal.a.n(g0VarE.A, "EPG HTTP "));
        }
        InputStream inputStreamA = g0VarE.D.a();
        this.$onProgress.invoke("Parsing EPG programs...");
        m.INSTANCE.getClass();
        LinkedHashMap linkedHashMapA = m.a(inputStreamA);
        if (!linkedHashMapA.isEmpty()) {
            this.$onProgress.invoke("Saving EPG (" + linkedHashMapA.size() + " channels)...");
            this.this$0.n(linkedHashMapA);
        }
        Context context = com.app.mlounge.util.a.a;
        int size2 = linkedHashMapA.size();
        Iterator it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        com.app.mlounge.util.a.a("D", "CustomIPTV", "EPG: " + size2 + " channels, " + size + " programs");
        return linkedHashMapA;
    }
}
