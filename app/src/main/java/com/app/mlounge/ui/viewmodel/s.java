package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.lifecycle.s0 {
    public final com.app.mlounge.data.repository.x b;
    public final StateFlow c;
    public final StateFlow d;
    public final StateFlow e;

    public s(com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.q0 q0Var) {
        xVar.getClass();
        m0Var.getClass();
        q0Var.getClass();
        this.b = xVar;
        com.app.mlounge.data.repository.l0 l0Var = m0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.m0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.c = FlowKt.stateIn(l0Var, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.x.e);
        this.d = FlowKt.stateIn(q0Var.a, androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.y.e);
        this.e = FlowKt.stateIn(xVar.b.a(), androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.w.e);
    }
}
