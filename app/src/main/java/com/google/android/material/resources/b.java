package com.google.android.material.resources;

import android.graphics.Typeface;
import coil3.network.g;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.core.content.res.b {
    public final /* synthetic */ g e;
    public final /* synthetic */ d f;

    public b(d dVar, g gVar) {
        this.f = dVar;
        this.e = gVar;
    }

    @Override // androidx.core.content.res.b
    public final void e(int i) {
        this.f.n = true;
        this.e.z(i);
    }

    @Override // androidx.core.content.res.b
    public final void f(Typeface typeface) {
        d dVar = this.f;
        Typeface typefaceCreate = Typeface.create(typeface, dVar.d);
        dVar.p = typefaceCreate;
        dVar.n = true;
        this.e.A(typefaceCreate, false);
    }
}
