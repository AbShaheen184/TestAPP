package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CHUNK_FIELD_NUMBER = 6;
    public static final int CLOSE_FIELD_NUMBER = 4;
    public static final int CONNECTED_FIELD_NUMBER = 5;
    private static final c5 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PLATFORM_FIELD_NUMBER = 2;
    public static final int PONG_FIELD_NUMBER = 3;
    private Object message_;
    private int messageCase_ = 0;
    private String id_ = "";

    static {
        c5 c5Var = new c5();
        DEFAULT_INSTANCE = c5Var;
        GeneratedMessageLite.registerDefaultInstance(c5.class, c5Var);
    }

    public static b1 e() {
        return (b1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (w0.a[l0Var.ordinal()]) {
            case 1:
                return new c5();
            case 2:
                return new b1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"message_", "messageCase_", "id_", o3.class, x3.class, s1.class, f2.class, i1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (c5.class) {
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
