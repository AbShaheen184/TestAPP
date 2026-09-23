package net.luminis.tls.engine.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final /* synthetic */ d[] H;
    public static final d e;
    public static final d y;
    public static final d z;

    static {
        d dVar = new d("client_hello", 0);
        e = dVar;
        d dVar2 = new d("server_hello", 1);
        y = dVar2;
        d dVar3 = new d("new_session_ticket", 2);
        d dVar4 = new d("end_of_early_data", 3);
        d dVar5 = new d("encrypted_extensions", 4);
        z = dVar5;
        d dVar6 = new d("certificate", 5);
        d dVar7 = new d("certificate_request", 6);
        A = dVar7;
        d dVar8 = new d("certificate_verify", 7);
        d dVar9 = new d("finished", 8);
        d dVar10 = new d("key_update", 9);
        d dVar11 = new d("server_certificate", 10);
        B = dVar11;
        d dVar12 = new d("server_certificate_verify", 11);
        C = dVar12;
        d dVar13 = new d("server_finished", 12);
        D = dVar13;
        d dVar14 = new d("client_certificate", 13);
        E = dVar14;
        d dVar15 = new d("client_certificate_verify", 14);
        F = dVar15;
        d dVar16 = new d("client_finished", 15);
        G = dVar16;
        H = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) H.clone();
    }
}
