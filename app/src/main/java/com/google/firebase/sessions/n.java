package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum n implements com.google.firebase.encoders.json.f {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    public final int e;

    n(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.json.f
    public final int getNumber() {
        return this.e;
    }
}
