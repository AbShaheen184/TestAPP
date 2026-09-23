package com.google.android.material.resources;

import android.graphics.Typeface;
import coil3.network.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final Typeface j;
    public final com.google.android.material.behavior.d k;
    public boolean l;

    public a(com.google.android.material.behavior.d dVar, Typeface typeface) {
        this.j = typeface;
        this.k = dVar;
    }

    @Override // coil3.network.g
    public final void A(Typeface typeface, boolean z) {
        if (this.l) {
            return;
        }
        com.google.android.material.internal.b bVar = (com.google.android.material.internal.b) this.k.e;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }

    @Override // coil3.network.g
    public final void z(int i) {
        if (this.l) {
            return;
        }
        com.google.android.material.internal.b bVar = (com.google.android.material.internal.b) this.k.e;
        if (bVar.l(this.j)) {
            bVar.j(false);
        }
    }
}
