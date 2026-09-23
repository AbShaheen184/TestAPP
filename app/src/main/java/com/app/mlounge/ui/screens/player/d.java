package com.app.mlounge.ui.screens.player;

import androidx.compose.animation.core.t2;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends t2 {
    public static final Set y = kotlin.collections.o.D(new Integer[]{401, 403, 429, 500, 502, 503});

    @Override // androidx.compose.animation.core.t2
    public final int f(int i) {
        return Math.max(super.f(i), 12);
    }

    @Override // androidx.compose.animation.core.t2
    public final long g(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar) {
        int i = lVar.y;
        if (i <= 12) {
            for (Throwable cause = (IOException) lVar.z; cause != null; cause = cause.getCause()) {
                if (cause instanceof androidx.media3.datasource.t) {
                    if (y.contains(Integer.valueOf(((androidx.media3.datasource.t) cause).z))) {
                        return Math.min(((long) i) * 1500, 8000L);
                    }
                }
            }
        }
        return super.g(lVar);
    }
}
