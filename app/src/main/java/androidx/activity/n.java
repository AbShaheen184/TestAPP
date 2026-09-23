package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.compose.foundation.gestures.n1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ n(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = i;
        this.A = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                Serializable serializable = (Serializable) ((com.app.mlounge.data.music.e) this.A).y;
                String str = (String) oVar.a.get(Integer.valueOf(this.z));
                if (str != null) {
                    androidx.activity.result.e eVar = (androidx.activity.result.e) oVar.e.get(str);
                    if ((eVar != null ? eVar.a : null) == null) {
                        oVar.g.remove(str);
                        oVar.f.put(str, serializable);
                    } else {
                        androidx.activity.result.b bVar = eVar.a;
                        if (oVar.d.remove(str)) {
                            bVar.c(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((o) this.y).a(this.z, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.A));
                break;
            case 2:
                CopyOnWriteArraySet<androidx.media3.common.util.n> copyOnWriteArraySet = (CopyOnWriteArraySet) this.y;
                androidx.media3.common.util.l lVar = (androidx.media3.common.util.l) this.A;
                for (androidx.media3.common.util.n nVar : copyOnWriteArraySet) {
                    if (!nVar.d) {
                        int i = this.z;
                        if (i != -1) {
                            nVar.b.b(i);
                        }
                        nVar.c = true;
                        lVar.invoke(nVar.a);
                    }
                }
                break;
            case 3:
                ((androidx.profileinstaller.b) ((n1) this.y).c).j(this.z, this.A);
                break;
            case 4:
                net.luminis.quic.recovery.g gVar = (net.luminis.quic.recovery.g) this.y;
                gVar.d.h(this.z, (List) this.A);
                break;
            default:
                net.luminis.quic.recovery.g gVar2 = (net.luminis.quic.recovery.g) this.y;
                gVar2.d.h(this.z, (ArrayList) this.A);
                break;
        }
    }

    public /* synthetic */ n(net.luminis.quic.recovery.g gVar, List list, int i, int i2) {
        this.e = i2;
        this.y = gVar;
        this.A = list;
        this.z = i;
    }
}
