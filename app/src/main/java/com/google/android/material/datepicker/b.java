package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import androidx.room.t;
import com.app.mlounge.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class b<S> extends androidx.fragment.app.c {
    public final LinkedHashSet M;
    public final LinkedHashSet N;

    public b() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.M = new LinkedHashSet();
        this.N = new LinkedHashSet();
    }

    public static boolean c(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t.E(R.attr.materialCalendarStyle, context, a.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
