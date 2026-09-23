package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q c = new q(p.e, 0);
    public static final q d = new q(p.C, 1);
    public final p a;
    public final int b;

    public q(p pVar, int i) {
        this.a = pVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
