package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final s1 DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PROXY_ID_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 3;
    private String message_ = "";
    private String proxyId_ = "";
    private int reason_;

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        GeneratedMessageLite.registerDefaultInstance(s1.class, s1Var);
    }

    public static l1 d() {
        return (l1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (w0.a[l0Var.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return new l1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"message_", "proxyId_", "reason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (s1.class) {
                    try {
                        i0Var = PARSER;
                        if (i0Var == null) {
                            i0Var = new com.google.protobuf.i0(DEFAULT_INSTANCE);
                            PARSER = i0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return i0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                androidx.transition.k.o();
                return null;
        }
    }
}
