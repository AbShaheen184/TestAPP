package com.app.mlounge.data.providers;

import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements l0 {
    public static final int $stable = 8;
    private static final String API_BASE = "https://hdhub.thevolecitor.qzz.io/eyJ0b3Jib3giOiJ1bnNldCIsInF1YWxpdGllcyI6IjIxNjBwLDEwODBwLDcyMHAsNDgwcCIsInNvcnQiOiJkZXNjIiwibXEiOjEwLCJtcCI6MTAsImNhdGFsb2dzIjoiIn0";
    public static final a0 Companion = new a0();
    private static final Set<String> EXCLUDED_HOSTS = kotlin.collections.o.D(new String[]{"gpdl.hubcloud.ist", "hubcloud.ist", "pixel.hubcloud.ist"});
    private final okhttp3.y client;
    private final com.google.gson.e gson;
    private final String name;
    private final m1 tmdbHelper;

    public c0(okhttp3.y yVar, m1 m1Var) {
        yVar.getClass();
        m1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = m1Var;
        this.name = "HDHub";
        this.gson = new com.google.gson.e();
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b0(this, str, str2, num, num2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }
}
