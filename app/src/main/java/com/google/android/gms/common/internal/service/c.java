package com.google.android.gms.common.internal.service;

import androidx.compose.foundation.text.selection.q0;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.work.impl.k;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.tasks.s;
import com.google.firebase.heartbeatinfo.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public static final k j = new k("ClientTelemetry.API", new b(0), new e(20));

    public final s c(m mVar) {
        q0 q0VarC = q0.c();
        q0VarC.A = new com.google.android.gms.common.d[]{com.google.android.gms.internal.base.d.a};
        q0VarC.y = false;
        q0VarC.z = new t(mVar);
        return b(2, q0VarC.b());
    }
}
