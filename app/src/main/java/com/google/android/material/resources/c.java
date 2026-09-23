package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import coil3.network.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public final /* synthetic */ Context j;
    public final /* synthetic */ TextPaint k;
    public final /* synthetic */ g l;
    public final /* synthetic */ d m;

    public c(d dVar, Context context, TextPaint textPaint, g gVar) {
        this.m = dVar;
        this.j = context;
        this.k = textPaint;
        this.l = gVar;
    }

    @Override // coil3.network.g
    public final void A(Typeface typeface, boolean z) {
        this.m.f(this.j, this.k, typeface);
        this.l.A(typeface, z);
    }

    @Override // coil3.network.g
    public final void z(int i) {
        this.l.z(i);
    }
}
