package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c extends RuntimeException {
    public final /* synthetic */ int e;

    static {
        new IllegalStateException("Cannot reach here");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, Throwable th) {
        super(str, th);
        this.e = 0;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.e) {
            case 3:
                return (CharacterCodingException) super.getCause();
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str);
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Throwable th) {
        super(th);
        this.e = 3;
    }
}
