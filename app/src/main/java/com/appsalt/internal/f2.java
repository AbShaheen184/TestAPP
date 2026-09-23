package com.appsalt.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int CONNECT_TIME_FIELD_NUMBER = 9;
    private static final f2 DEFAULT_INSTANCE;
    public static final int DNS_LOOKUP_TIME_FIELD_NUMBER = 8;
    public static final int DNS_RESOLVE_TYPE_FIELD_NUMBER = 7;
    public static final int IP_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.r1 PARSER = null;
    public static final int PROXY_ID_FIELD_NUMBER = 4;
    private int connectTime_;
    private int dnsLookupTime_;
    private int dnsResolveType_;
    private String proxyId_ = "";
    private ByteString ip_ = ByteString.EMPTY;

    static {
        f2 f2Var = new f2();
        DEFAULT_INSTANCE = f2Var;
        GeneratedMessageLite.registerDefaultInstance(f2.class, f2Var);
    }

    public static w1 g() {
        return (w1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(com.google.protobuf.l0 l0Var, Object obj, Object obj2) {
        com.google.protobuf.r1 i0Var;
        switch (w0.a[l0Var.ordinal()]) {
            case 1:
                return new f2();
            case 2:
                return new w1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0004\t\u0005\u0000\u0000\u0000\u0004Ȉ\u0006\n\u0007\f\b\u000b\t\u000b", new Object[]{"proxyId_", "ip_", "dnsResolveType_", "dnsLookupTime_", "connectTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.r1 r1Var = PARSER;
                if (r1Var != null) {
                    return r1Var;
                }
                synchronized (f2.class) {
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
