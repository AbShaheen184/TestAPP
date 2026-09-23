package com.google.firebase.encoders.proto;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.google.firebase.encoders.g {
    public boolean a = false;
    public boolean b = false;
    public com.google.firebase.encoders.c c;
    public final f d;

    public h(f fVar) {
        this.d = fVar;
    }

    @Override // com.google.firebase.encoders.g
    public final com.google.firebase.encoders.g e(String str) {
        if (this.a) {
            throw new com.google.firebase.encoders.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    public final com.google.firebase.encoders.g f(boolean z) {
        if (this.a) {
            throw new com.google.firebase.encoders.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.f(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
