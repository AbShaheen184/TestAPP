package androidx.compose.material3;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.snapshots.q y;

    public /* synthetic */ y(androidx.compose.runtime.snapshots.q qVar, int i) {
        this.e = i;
        this.y = qVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                androidx.compose.foundation.interaction.i iVar = (androidx.compose.foundation.interaction.i) obj;
                boolean z = iVar instanceof androidx.compose.foundation.interaction.g;
                androidx.compose.runtime.snapshots.q qVar = this.y;
                if (z) {
                    qVar.add(iVar);
                } else if (iVar instanceof androidx.compose.foundation.interaction.h) {
                    qVar.remove(((androidx.compose.foundation.interaction.h) iVar).a);
                } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                    qVar.add(iVar);
                } else if (iVar instanceof androidx.compose.foundation.interaction.e) {
                    qVar.remove(((androidx.compose.foundation.interaction.e) iVar).a);
                } else if (iVar instanceof androidx.compose.foundation.interaction.m) {
                    qVar.add(iVar);
                } else if (iVar instanceof androidx.compose.foundation.interaction.n) {
                    qVar.remove(((androidx.compose.foundation.interaction.n) iVar).a);
                } else if (iVar instanceof androidx.compose.foundation.interaction.l) {
                    qVar.remove(((androidx.compose.foundation.interaction.l) iVar).a);
                }
                break;
            default:
                androidx.compose.foundation.interaction.i iVar2 = (androidx.compose.foundation.interaction.i) obj;
                boolean z2 = iVar2 instanceof androidx.compose.foundation.interaction.g;
                androidx.compose.runtime.snapshots.q qVar2 = this.y;
                if (z2) {
                    qVar2.add(iVar2);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.h) {
                    qVar2.remove(((androidx.compose.foundation.interaction.h) iVar2).a);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.d) {
                    qVar2.add(iVar2);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.e) {
                    qVar2.remove(((androidx.compose.foundation.interaction.e) iVar2).a);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.m) {
                    qVar2.add(iVar2);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.n) {
                    qVar2.remove(((androidx.compose.foundation.interaction.n) iVar2).a);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.l) {
                    qVar2.remove(((androidx.compose.foundation.interaction.l) iVar2).a);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.b) {
                    qVar2.add(iVar2);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.c) {
                    qVar2.remove(((androidx.compose.foundation.interaction.c) iVar2).a);
                } else if (iVar2 instanceof androidx.compose.foundation.interaction.a) {
                    qVar2.remove(((androidx.compose.foundation.interaction.a) iVar2).a);
                }
                break;
        }
        return kotlin.y.a;
    }
}
