package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends androidx.lifecycle.s0 {
    public final com.app.mlounge.data.repository.x b;
    public final com.app.mlounge.data.repository.j0 c;
    public final StateFlow d;
    public final StateFlow e;
    public final StateFlow f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final androidx.compose.runtime.g1 j;
    public final androidx.compose.runtime.g1 k;
    public final androidx.compose.runtime.g1 l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public final StateFlow p;

    public d2(com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.j0 j0Var, com.app.mlounge.data.repository.q0 q0Var) {
        xVar.getClass();
        m0Var.getClass();
        j0Var.getClass();
        q0Var.getClass();
        this.b = xVar;
        this.c = j0Var;
        com.app.mlounge.data.repository.l0 l0Var = m0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.m0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted sharingStartedWhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.x xVar2 = kotlin.collections.x.e;
        this.d = FlowKt.stateIn(l0Var, aVarG, sharingStartedWhileSubscribed$default, xVar2);
        Flow flow = q0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG2 = androidx.lifecycle.m0.g(this);
        SharingStarted sharingStartedWhileSubscribed$default2 = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.y yVar = kotlin.collections.y.e;
        this.e = FlowKt.stateIn(flow, aVarG2, sharingStartedWhileSubscribed$default2, yVar);
        this.f = FlowKt.stateIn(q0Var.b, androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), yVar);
        this.g = FlowKt.stateIn(q0Var.c, androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), xVar2);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(xVar2);
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        this.j = new androidx.compose.runtime.g1(0);
        this.k = new androidx.compose.runtime.g1(0);
        this.l = new androidx.compose.runtime.g1(0);
        kotlin.coroutines.d dVar = null;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(this), null, null, new g0(this, dVar, 5), 3, null);
        androidx.room.coroutines.j jVarG = com.imsdk.a.g(xVar.a.a, new String[]{"watchlist"}, new com.app.mlounge.data.local.dao.g(5));
        androidx.lifecycle.viewmodel.internal.a aVarG3 = androidx.lifecycle.m0.g(this);
        SharingStarted sharingStartedWhileSubscribed$default3 = SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null);
        kotlin.collections.w wVar = kotlin.collections.w.e;
        StateFlow stateFlowStateIn = FlowKt.stateIn(jVarG, aVarG3, sharingStartedWhileSubscribed$default3, wVar);
        this.m = stateFlowStateIn;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(c2.ADDED_DESC);
        this.n = MutableStateFlow2;
        this.o = FlowKt.asStateFlow(MutableStateFlow2);
        this.p = FlowKt.stateIn(FlowKt.combine(stateFlowStateIn, MutableStateFlow2, new androidx.datastore.preferences.i(3, 1, dVar)), androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), wVar);
    }
}
