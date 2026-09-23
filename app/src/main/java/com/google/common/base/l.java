package com.google.common.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements g {
    public static final h e;
    public static final /* synthetic */ l[] y;

    static {
        h hVar = new h();
        e = hVar;
        y = new l[]{hVar, new l() { // from class: com.google.common.base.i
            @Override // com.google.common.base.g
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new l() { // from class: com.google.common.base.j
            @Override // com.google.common.base.g
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new l() { // from class: com.google.common.base.k
            @Override // com.google.common.base.g
            /* JADX INFO: renamed from: apply */
            public final boolean mo13apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) y.clone();
    }
}
