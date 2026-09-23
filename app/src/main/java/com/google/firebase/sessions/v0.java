package com.google.firebase.sessions;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public final j1 a;
    public final k1 b;

    public v0(j1 j1Var, k1 k1Var) {
        j1Var.getClass();
        k1Var.getClass();
        this.a = j1Var;
        this.b = k1Var;
    }

    public final p0 a(p0 p0Var) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = kotlin.text.r.s(string, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (p0Var == null || (str = p0Var.b) == null) ? lowerCase : str;
        int i = p0Var != null ? p0Var.c + 1 : 0;
        this.a.getClass();
        return new p0(lowerCase, str2, i, j1.a().b);
    }
}
