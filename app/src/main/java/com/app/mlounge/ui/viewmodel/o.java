package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.lifecycle.s0 {
    public final com.app.mlounge.data.download.h b;
    public final StateFlow c;
    public final StateFlow d;

    public o(com.app.mlounge.data.download.h hVar, com.app.mlounge.data.local.prefs.y1 y1Var) {
        hVar.getClass();
        y1Var.getClass();
        this.b = hVar;
        androidx.room.coroutines.j jVar = hVar.g;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.m0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.c = FlowKt.stateIn(jVar, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.w.e);
        this.d = FlowKt.stateIn(new androidx.compose.material3.internal.j0(y1Var.K, this, 1), androidx.lifecycle.m0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), "");
    }
}
