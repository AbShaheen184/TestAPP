package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends BroadcastReceiver {
    public final j4 a;
    public boolean b;
    public boolean c;

    public a1(j4 j4Var) {
        com.google.android.gms.common.internal.x.g(j4Var);
        this.a = j4Var;
    }

    public final void a() {
        j4 j4Var = this.a;
        j4Var.m0();
        j4Var.e().v();
        j4Var.e().v();
        if (this.b) {
            j4Var.b().K.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                j4Var.I.e.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                j4Var.b().C.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j4 j4Var = this.a;
        j4Var.m0();
        String action = intent.getAction();
        j4Var.b().K.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            j4Var.b().F.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        y0 y0Var = j4Var.y;
        j4.U(y0Var);
        boolean z = y0Var.z();
        if (this.c != z) {
            this.c = z;
            j4Var.e().E(new androidx.appcompat.widget.z0(this, z));
        }
    }
}
