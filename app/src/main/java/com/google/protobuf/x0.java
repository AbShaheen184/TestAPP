package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class x0 extends IOException {
    public boolean e;

    public static x0 a() {
        return new x0("Protocol message contained an invalid tag (zero).");
    }

    public static x0 b() {
        return new x0("Protocol message had invalid UTF-8.");
    }

    public static w0 c() {
        return new w0("Protocol message tag had invalid wire type.");
    }

    public static x0 d() {
        return new x0("CodedInputStream encountered a malformed varint.");
    }

    public static x0 e() {
        return new x0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static x0 f() {
        return new x0("Failed to parse the message.");
    }

    public static x0 g() {
        return new x0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
