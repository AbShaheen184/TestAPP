package com.app.mlounge.data.repository;

import com.app.mlounge.data.local.prefs.v1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final Flow a;
    public final l0 b;
    public final v1 c;

    public q0(com.app.mlounge.data.local.dao.h hVar, com.app.mlounge.data.local.dao.k kVar) {
        Flow flowCombine = FlowKt.combine(hVar.a(), com.imsdk.a.g(kVar.a, new String[]{"watch_progress"}, new com.app.mlounge.data.local.dao.g(3)), new p0(this, null));
        this.a = flowCombine;
        this.b = new l0(hVar.a(), 1);
        this.c = new v1(flowCombine, 3);
    }
}
