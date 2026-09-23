package androidx.work;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.widget.q2;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.ui.platform.u1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ p(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Job job = (Job) this.y;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            case 1:
                com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.y;
                ((com.google.android.datatransport.runtime.scheduling.persistence.g) nVar.B).L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(nVar, 0));
                return;
            case 2:
                MaterialButton.a((MaterialButton) this.y);
                return;
            case 3:
                ((CarouselLayoutManager) this.y).m0();
                return;
            case 4:
                u1 u1Var = (u1) this.y;
                u1Var.b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) u1Var.e;
                androidx.customview.widget.d dVar = sideSheetBehavior.i;
                if (dVar != null && dVar.f()) {
                    u1Var.a(u1Var.c);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(u1Var.c);
                        return;
                    }
                    return;
                }
            case 5:
                ((com.google.android.material.textfield.c) this.y).s(true);
                return;
            case 6:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) this.y;
                boolean zIsPopupShowing = kVar.h.isPopupShowing();
                kVar.s(zIsPopupShowing);
                kVar.m = zIsPopupShowing;
                return;
            case 7:
                ((TextInputLayout) this.y).B.requestLayout();
                return;
            case 8:
                b1 b1Var = (b1) this.y;
                Map mapUnmodifiableMap = null;
                ((AtomicReference) b1Var.z).set(null);
                synchronized (b1Var) {
                    if (((AtomicMarkableReference) b1Var.y).isMarked()) {
                        com.google.firebase.crashlytics.internal.metadata.e eVar = (com.google.firebase.crashlytics.internal.metadata.e) ((AtomicMarkableReference) b1Var.y).getReference();
                        synchronized (eVar) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) b1Var.y;
                        atomicMarkableReference.set((com.google.firebase.crashlytics.internal.metadata.e) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    q2 q2Var = (q2) b1Var.A;
                    ((com.google.firebase.crashlytics.internal.metadata.h) q2Var.a).h((String) q2Var.c, mapUnmodifiableMap, b1Var.e);
                    return;
                }
                return;
            case 9:
                androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) this.y;
                synchronized (((ArrayDeque) cVar.A)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.e).edit();
                    String str = (String) cVar.y;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.A).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) cVar.z);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            case 10:
                com.google.firebase.messaging.w wVar = (com.google.firebase.messaging.w) this.y;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + wVar.a.getAction() + " finishing.");
                wVar.b.d(null);
                return;
            case 11:
                net.luminis.quic.impl.d dVar2 = (net.luminis.quic.impl.d) this.y;
                if (dVar2.f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (dVar2.e.longValue() + dVar2.b < jCurrentTimeMillis) {
                        if ((((long) dVar2.d.getAsInt()) * 3) + dVar2.e.longValue() < jCurrentTimeMillis) {
                            dVar2.a.shutdown();
                            net.luminis.quic.impl.i iVar = dVar2.c;
                            iVar.W.a();
                            iVar.T.i();
                            net.luminis.quic.log.a aVar = iVar.z;
                            iVar.toString();
                            aVar.getClass();
                            System.currentTimeMillis();
                            iVar.l();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                androidx.compose.foundation.lazy.grid.l lVar = (androidx.compose.foundation.lazy.grid.l) this.y;
                net.luminis.quic.send.k kVar2 = (net.luminis.quic.send.k) lVar.d;
                net.luminis.quic.impl.n nVar2 = ((net.luminis.quic.impl.o) lVar.c).a;
                kVar2.i[androidx.constraintlayout.core.g.e(4)].a(new net.luminis.quic.frame.m(), new net.luminis.quic.impl.j(0));
                ((net.luminis.quic.send.k) lVar.d).j();
                lVar.d();
                return;
            case 13:
                net.luminis.quic.receive.b bVar = (net.luminis.quic.receive.b) this.y;
                while (!bVar.g) {
                    try {
                        DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
                        try {
                            bVar.a.receive(datagramPacket);
                            if (bVar.d.test(datagramPacket)) {
                                bVar.f.add(new net.luminis.quic.receive.a(datagramPacket, Long.valueOf(System.currentTimeMillis())));
                            }
                        } catch (SocketException e) {
                            throw e;
                        } catch (SocketTimeoutException unused) {
                        }
                    } catch (IOException e2) {
                        boolean z = bVar.g;
                        net.luminis.quic.log.a aVar2 = bVar.b;
                        if (z) {
                            aVar2.getClass();
                            return;
                        } else {
                            aVar2.c("IOException while receiving datagrams", e2);
                            bVar.c.accept(e2);
                            return;
                        }
                    } catch (Throwable th) {
                        bVar.b.c("IOException while receiving datagrams", th);
                        bVar.c.accept(th);
                        return;
                    }
                }
                bVar.b.getClass();
                return;
            default:
                net.luminis.quic.recovery.g gVar = (net.luminis.quic.recovery.g) this.y;
                try {
                    gVar.e();
                    return;
                } catch (Exception e3) {
                    gVar.e.c("Runtime exception occurred while running loss detection timeout handler", e3);
                    return;
                }
        }
    }
}
