package com.google.firebase.messaging.reporting;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements com.google.firebase.encoders.proto.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int e;

    c(int i) {
        this.e = i;
    }

    @Override // com.google.firebase.encoders.proto.c
    public final int getNumber() {
        return this.e;
    }
}
