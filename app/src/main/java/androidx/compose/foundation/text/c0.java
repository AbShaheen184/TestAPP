package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.material3.j6;
import androidx.compose.material3.l6;
import androidx.compose.ui.platform.l2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public c0(androidx.compose.ui.focus.l lVar, r0 r0Var) {
        this.e = 1;
        this.z = lVar;
        this.y = r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x03bb  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        long j;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                if (((r0) this.y).a() == g0.y && keyEvent.getKeyCode() == 4) {
                    z = true;
                    if (androidx.compose.ui.input.key.c.c(keyEvent) == 1) {
                        ((androidx.compose.foundation.text.selection.b1) this.z).g(null);
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((androidx.compose.ui.input.key.b) obj).a;
                androidx.compose.ui.focus.l lVar = (androidx.compose.ui.focus.l) this.z;
                InputDevice device = keyEvent2.getDevice();
                boolean zG = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && androidx.compose.ui.input.key.c.c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (n0.i(19, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(5, true);
                    } else if (n0.i(20, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(6, true);
                    } else if (n0.i(21, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(3, true);
                    } else if (n0.i(22, keyEvent2)) {
                        zG = ((androidx.compose.ui.focus.p) lVar).g(4, true);
                    } else if (n0.i(23, keyEvent2)) {
                        l2 l2Var = ((r0) this.y).c;
                        if (l2Var != null) {
                            ((androidx.compose.ui.platform.m1) l2Var).b();
                        }
                        zG = true;
                    }
                }
                return Boolean.valueOf(zG);
            case 2:
                KeyEvent keyEvent3 = ((androidx.compose.ui.input.key.b) obj).a;
                androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) this.z;
                if (!((l6) ((j6) this.y)).b()) {
                    a1Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 3:
                androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.y;
                Object obj2 = b1Var.y;
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.z;
                synchronized (obj2) {
                    ((ArrayList) b1Var.z).remove(cancellableContinuationImpl);
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.runtime.snapshots.l lVar2 = (androidx.compose.runtime.snapshots.l) obj;
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    j = androidx.compose.runtime.snapshots.n.e;
                    androidx.compose.runtime.snapshots.n.e = ((long) 1) + j;
                }
                return new androidx.compose.runtime.snapshots.b(j, lVar2, (kotlin.jvm.functions.l) this.y, (kotlin.jvm.functions.l) this.z);
            case 5:
                Throwable th = (Throwable) obj;
                if (th instanceof androidx.work.impl.w) {
                    ((androidx.work.x) this.y).stop(((androidx.work.impl.w) th).e);
                }
                ((ListenableFuture) this.z).cancel(false);
                return kotlin.y.a;
            case 6:
                return ((com.app.mlounge.ui.t) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 7:
                int iIntValue = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue), ((List) this.z).get(iIntValue));
            case 8:
                return ((com.app.mlounge.ui.t) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 9:
                int iIntValue2 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue2), ((List) this.z).get(iIntValue2));
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue3), ((ArrayList) this.z).get(iIntValue3));
            case 11:
                return ((com.app.mlounge.ui.t) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            case 12:
                int iIntValue4 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue4), ((List) this.z).get(iIntValue4));
            case 13:
                int iIntValue5 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue5), ((List) this.z).get(iIntValue5));
            case 14:
                int iIntValue6 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue6), ((List) this.z).get(iIntValue6));
            case 15:
                int iIntValue7 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue7), ((List) this.z).get(iIntValue7));
            case 16:
                int iIntValue8 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue8), ((List) this.z).get(iIntValue8));
            case 17:
                int iIntValue9 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.components.c0) this.y).invoke(Integer.valueOf(iIntValue9), ((List) this.z).get(iIntValue9));
            case 18:
                return ((com.app.mlounge.ui.t) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 19:
                return ((com.app.mlounge.ui.t) this.y).invoke(((ArrayList) this.z).get(((Number) obj).intValue()));
            case 20:
                KeyEvent keyEvent4 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent4.getClass();
                boolean z2 = false;
                if (androidx.compose.ui.input.key.c.c(keyEvent4) == 2) {
                    boolean z3 = ((com.app.mlounge.ui.screens.player.p0) ((androidx.compose.runtime.a1) this.z).getValue()).c;
                    com.app.mlounge.ui.screens.player.a1 a1Var2 = (com.app.mlounge.ui.screens.player.a1) this.y;
                    if (z3) {
                        a1Var2.h();
                    } else {
                        a1Var2.j();
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 21:
                int iIntValue10 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue10), ((List) this.z).get(iIntValue10));
            case 22:
                int iIntValue11 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue11), ((List) this.z).get(iIntValue11));
            case 23:
                int iIntValue12 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue12), ((List) this.z).get(iIntValue12));
            case 24:
                int iIntValue13 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue13), ((List) this.z).get(iIntValue13));
            case 25:
                int iIntValue14 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue14), ((List) this.z).get(iIntValue14));
            case 26:
                int iIntValue15 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue15), ((List) this.z).get(iIntValue15));
            case 27:
                int iIntValue16 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.music.a) this.y).invoke(Integer.valueOf(iIntValue16), ((List) this.z).get(iIntValue16));
            case 28:
                return ((com.app.mlounge.ui.t) this.y).invoke(((List) this.z).get(((Number) obj).intValue()));
            default:
                int iIntValue17 = ((Number) obj).intValue();
                return ((com.app.mlounge.ui.screens.sources.b) this.y).invoke(Integer.valueOf(iIntValue17), ((List) this.z).get(iIntValue17));
        }
    }

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
