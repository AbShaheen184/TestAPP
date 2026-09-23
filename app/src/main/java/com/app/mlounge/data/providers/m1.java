package com.app.mlounge.data.providers;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final int $stable = 8;
    private final okhttp3.y client;
    private final com.google.gson.e gson = new com.google.gson.e();

    public m1(okhttp3.y yVar) {
        this.client = yVar;
    }

    public final Object c(String str, String str2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new k1(str2, str, this, null), iVar);
    }

    public final Object d(String str, String str2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new l1(str2, str, this, null), iVar);
    }
}
