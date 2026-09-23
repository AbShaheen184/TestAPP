package com.google.android.material.elevation;

import _COROUTINE.b;
import android.content.Context;
import android.util.TypedValue;
import androidx.room.t;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(Context context) {
        TypedValue typedValueD = t.D(context, R.attr.elevationOverlayEnabled);
        boolean z = (typedValueD == null || typedValueD.type != 18 || typedValueD.data == 0) ? false : true;
        int iS = b.s(context, R.attr.elevationOverlayColor, 0);
        int iS2 = b.s(context, R.attr.elevationOverlayAccentColor, 0);
        int iS3 = b.s(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iS;
        this.c = iS2;
        this.d = iS3;
        this.e = f2;
    }
}
