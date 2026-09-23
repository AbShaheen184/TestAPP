package androidx.transition;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.ColorSpace;
import android.util.Base64;
import com.app.mlounge.MainActivity;
import com.app.mlounge.ui.screens.player.b1;
import com.caverock.androidsvg.y1;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.t1;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements l, androidx.activity.result.b, okhttp3.logging.b, androidx.media3.extractor.q, com.google.android.datatransport.g, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.android.material.textfield.w, com.google.common.base.q {
    public final /* synthetic */ int e;

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    public static /* bridge */ /* synthetic */ ColorSpace g(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void h() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void i(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void j(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void o() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void p(String str) throws y1 {
        throw new y1(str);
    }

    public static /* synthetic */ void q() throws s1 {
        throw new s1();
    }

    public static /* synthetic */ void r(String str) throws t1 {
        throw new t1(str);
    }

    @Override // androidx.media3.extractor.q
    public androidx.media3.extractor.n[] a() {
        return new b1[]{new b1(0L)};
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                com.google.android.datatransport.runtime.j jVarA = com.google.android.datatransport.runtime.k.a();
                jVarA.v(cursorRawQuery.getString(1));
                jVarA.A = com.google.android.datatransport.runtime.util.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                jVarA.z = string == null ? null : Base64.decode(string, 0);
                arrayList.add(jVarA.n());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // androidx.activity.result.b
    public void c(Object obj) {
        ((Boolean) obj).booleanValue();
        int i = MainActivity.G;
    }

    @Override // okhttp3.logging.b
    public void d(String str) {
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "TMDB_HTTP", str);
    }

    @Override // androidx.transition.l
    public void e(j jVar, m mVar) {
        switch (this.e) {
            case 0:
                jVar.d(mVar);
                break;
            case 1:
                jVar.e(mVar);
                break;
            case 2:
                jVar.a();
                break;
            default:
                jVar.f();
                break;
        }
    }

    @Override // com.google.common.base.q
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.datatransport.g
    public void f(Exception exc) {
    }
}
