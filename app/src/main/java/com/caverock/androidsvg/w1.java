package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends _COROUTINE.b {
    public float G = 0.0f;
    public final /* synthetic */ x1 H;

    public w1(x1 x1Var) {
        this.H = x1Var;
    }

    @Override // _COROUTINE.b
    public final void F(String str) {
        this.G = ((v1) this.H.c).d.measureText(str) + this.G;
    }
}
