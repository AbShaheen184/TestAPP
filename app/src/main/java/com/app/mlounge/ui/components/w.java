package com.app.mlounge.ui.components;

import androidx.compose.runtime.a1;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ w(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        a1 a1Var = this.y;
        switch (i) {
            case 0:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            case 5:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (((androidx.compose.foundation.interaction.i) obj) instanceof androidx.compose.foundation.interaction.m) {
                    List list = com.app.mlounge.ui.screens.settings.e0.a;
                    a1Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return yVar;
    }
}
