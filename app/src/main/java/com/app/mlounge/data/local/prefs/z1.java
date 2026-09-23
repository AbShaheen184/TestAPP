package com.app.mlounge.data.local.prefs;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {
    public static final /* synthetic */ kotlin.reflect.j[] a = {new kotlin.jvm.internal.s(z1.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final androidx.datastore.preferences.a b = org.jsoup.helper.n.G("cinemahq_prefs", new androidx.compose.ui.draw.i(new com.app.mlounge.data.local.dao.g(6)), null, 12);

    public static final androidx.datastore.core.e a(Context context) {
        context.getClass();
        return b.a(context, a[0]);
    }
}
