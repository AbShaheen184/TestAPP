package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ d1 e;

    public b1(d1 d1Var, String str, boolean z) {
        this.e = d1Var;
        com.google.android.gms.common.internal.x.d(str);
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.z().getBoolean(this.a, this.b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor editorEdit = this.e.z().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.d = z;
    }
}
