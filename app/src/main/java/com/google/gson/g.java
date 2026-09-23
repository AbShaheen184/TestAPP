package com.google.gson;

import com.google.gson.internal.bind.f1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final f d() {
        if (this instanceof f) {
            return (f) this;
        }
        com.google.firebase.platforminfo.b.k(this, "Not a JSON Array: ");
        return null;
    }

    public final j e() {
        if (this instanceof j) {
            return (j) this;
        }
        com.google.firebase.platforminfo.b.k(this, "Not a JSON Object: ");
        return null;
    }

    public long f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            com.google.gson.stream.b bVar = new com.google.gson.stream.b(new androidx.fragment.app.j(sb));
            bVar.E = 1;
            f1.z.getClass();
            com.google.gson.internal.bind.l.e(this, bVar);
            return sb.toString();
        } catch (IOException e) {
            kotlinx.coroutines.future.a.o(e);
            return null;
        }
    }
}
