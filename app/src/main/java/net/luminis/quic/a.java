package net.luminis.quic;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    NO_ERROR(0),
    INTERNAL_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECTION_REFUSED(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_LIMIT_ERROR(4),
    STREAM_STATE_ERROR(5),
    FINAL_SIZE_ERROR(6),
    FRAME_ENCODING_ERROR(7),
    TRANSPORT_PARAMETER_ERROR(8),
    CONNECTION_ID_LIMIT_ERROR(9),
    PROTOCOL_VIOLATION(10),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    APPLICATION_ERROR(12),
    CRYPTO_BUFFER_EXCEEDED(13),
    /* JADX INFO: Fake field, exist only in values array */
    KEY_UPDATE_ERROR(14),
    /* JADX INFO: Fake field, exist only in values array */
    CRYPTO_ERROR(15),
    /* JADX INFO: Fake field, exist only in values array */
    NO_VIABLE_PATH(16),
    /* JADX INFO: Fake field, exist only in values array */
    CRYPTO_ERROR(LibretroCore.SCREEN_WIDTH),
    VERSION_NEGOTIATION_ERROR(21496);

    public final short e;

    a(int i) {
        this.e = (short) i;
    }
}
