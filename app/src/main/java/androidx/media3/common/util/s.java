package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.z0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.u0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public s(p1 p1Var) {
        this.a = 3;
        this.b = p1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((t) this.b).a.execute(new androidx.activity.c(6, this, context));
                break;
            case 1:
                androidx.media3.exoplayer.audio.e eVar = (androidx.media3.exoplayer.audio.e) this.b;
                if (!isInitialStickyBroadcast()) {
                    eVar.b(androidx.media3.exoplayer.audio.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                }
                break;
            case 2:
                context.getClass();
                intent.getClass();
                androidx.work.impl.constraints.trackers.a aVar = (androidx.work.impl.constraints.trackers.a) this.b;
                switch (aVar.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            androidx.work.y.e().a(androidx.work.impl.constraints.trackers.b.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            androidx.work.y.e().a(androidx.work.impl.constraints.trackers.c.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.d(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.d(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            androidx.work.y.e().a(androidx.work.impl.constraints.trackers.h.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.d(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.d(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            default:
                p1 p1Var = (p1) this.b;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if (action4 != null) {
                        int iHashCode3 = action4.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                u0 u0Var = p1Var.C;
                                p1.m(u0Var);
                                u0Var.K.a("[sgtm] App Receiver notified batches are available");
                                m1 m1Var = p1Var.D;
                                p1.m(m1Var);
                                m1Var.E(new z0(this, 23));
                            }
                            break;
                        } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            g4.a();
                            if (p1Var.A.G(null, com.google.android.gms.measurement.internal.f0.P0)) {
                                u0 u0Var2 = p1Var.C;
                                p1.m(u0Var2);
                                u0Var2.K.a("App receiver notified triggers are available");
                                m1 m1Var2 = p1Var.D;
                                p1.m(m1Var2);
                                m1Var2.E(new z0(p1Var, 24));
                                break;
                            }
                        }
                        u0 u0Var3 = p1Var.C;
                        p1.m(u0Var3);
                        u0Var3.F.a("App receiver called with unknown action");
                    } else {
                        u0 u0Var4 = p1Var.C;
                        p1.m(u0Var4);
                        u0Var4.F.a("App receiver called with null action");
                    }
                } else {
                    u0 u0Var5 = p1Var.C;
                    p1.m(u0Var5);
                    u0Var5.F.a("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
