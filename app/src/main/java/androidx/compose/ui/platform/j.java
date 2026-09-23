package androidx.compose.ui.platform;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int e;

    public /* synthetic */ j(int i) {
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.collection.j0 j0Var = u.k1;
                synchronized (j0Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = j0Var.a;
                        int i2 = j0Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                u uVar = (u) objArr[i3];
                                boolean showLayoutBounds = uVar.getShowLayoutBounds();
                                Class cls = u.h1;
                                uVar.setShowLayoutBounds(i0.j());
                                if (showLayoutBounds != uVar.getShowLayoutBounds()) {
                                    u.m(uVar.getRoot());
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                u.m(((u) objArr[i3]).getRoot());
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                int i4 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
        }
    }

    private final void a() {
    }
}
