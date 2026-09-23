package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return f(r.a(cls));
    }

    com.google.firebase.inject.b b(r rVar);

    default com.google.firebase.inject.b c(Class cls) {
        return b(r.a(cls));
    }

    default Set d(r rVar) {
        return (Set) e(rVar).get();
    }

    com.google.firebase.inject.b e(r rVar);

    default Object f(r rVar) {
        com.google.firebase.inject.b bVarB = b(rVar);
        if (bVarB == null) {
            return null;
        }
        return bVarB.get();
    }

    p g(r rVar);
}
