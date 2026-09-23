package com.google.firebase.encoders.proto;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final int b;

    public a(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.tag() && d.e.equals(eVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.b) + (d.e.hashCode() ^ 2041407134);
    }

    @Override // com.google.firebase.encoders.proto.e
    public final d intEncoding() {
        return d.e;
    }

    @Override // com.google.firebase.encoders.proto.e
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + d.e + ')';
    }
}
