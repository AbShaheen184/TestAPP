package com.google.firebase.sessions.settings;

import androidx.datastore.core.i1;
import androidx.datastore.core.x0;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements x0 {
    public static final h a = new h();
    public static final g b = new g(null, null, null, null, null);

    @Override // androidx.datastore.core.x0
    public final /* bridge */ /* synthetic */ Object a() {
        return b;
    }

    @Override // androidx.datastore.core.x0
    public final Object b(FileInputStream fileInputStream) throws androidx.datastore.core.b {
        try {
            kotlinx.serialization.json.b bVar = kotlinx.serialization.json.b.d;
            String str = new String(dagger.hilt.android.internal.b.g(fileInputStream), kotlin.text.a.a);
            bVar.getClass();
            return (g) bVar.a(str, g.Companion.serializer());
        } catch (Exception e) {
            throw new androidx.datastore.core.b("Cannot parse session configs", e);
        }
    }

    @Override // androidx.datastore.core.x0
    public final void c(Object obj, i1 i1Var) throws IOException {
        byte[] bytes = kotlinx.serialization.json.b.d.b(g.Companion.serializer(), (g) obj).getBytes(kotlin.text.a.a);
        bytes.getClass();
        ((FileOutputStream) i1Var.y).write(bytes);
    }
}
