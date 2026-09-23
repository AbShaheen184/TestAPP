package com.appsalt.internal;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final d5 DEFAULT_INSTANCE;
    public static final int FIRST_HOST_GROUP_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int SECOND_HOST_GROUP_FIELD_NUMBER = 2;
    private com.google.protobuf.t0 firstHostGroup_ = GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.t0 secondHostGroup_ = GeneratedMessageLite.emptyProtobufList();

    static {
        d5 d5Var = new d5();
        DEFAULT_INSTANCE = d5Var;
        GeneratedMessageLite.registerDefaultInstance(d5.class, d5Var);
    }

    public final com.google.protobuf.t0 c() {
        return this.firstHostGroup_;
    }

    public final com.google.protobuf.t0 d() {
        return this.secondHostGroup_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (u3.a[l0Var.ordinal()]) {
            case 1:
                return new d5();
            case 2:
                return new m2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"firstHostGroup_", "secondHostGroup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (d5.class) {
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
