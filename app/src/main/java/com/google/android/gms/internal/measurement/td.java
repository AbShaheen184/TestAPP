package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class td {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public td(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ie ieVar = (ie) it.next();
            if (TextUtils.isEmpty(ieVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                ie ieVar2 = (ie) this.a.put(ieVar.e(), ieVar);
                if (ieVar2 != null) {
                    String canonicalName = ieVar2.getClass().getCanonicalName();
                    String canonicalName2 = ieVar.getClass().getCanonicalName();
                    kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.n(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw androidx.compose.runtime.j.b(it2);
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, sd sdVar) {
        return sdVar.a(b(uri));
    }

    public final rd b(Uri uri) {
        List listM;
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        com.google.common.collect.d0 d0VarK2 = com.google.common.collect.h0.k();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listM = com.google.common.collect.a1.B;
        } else {
            String strSubstring = encodedFragment.substring(10);
            androidx.compose.ui.platform.u1 u1VarC = androidx.compose.ui.platform.u1.c("+");
            listM = com.google.common.collect.h0.m(new com.google.common.base.o(new androidx.compose.ui.platform.u1((com.google.common.base.p) u1VarC.e, true, (kotlin.math.a) u1VarC.d, u1VarC.c), strSubstring));
        }
        int size = listM.size();
        for (int i = 0; i < size; i++) {
            String str = (String) listM.get(i);
            Matcher matcher = fe.a.matcher(str);
            if (!matcher.matches()) {
                kotlinx.coroutines.future.a.q("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            d0VarK2.b(matcher.group(1));
        }
        com.google.common.collect.a1 a1VarG = d0VarK2.g();
        if (a1VarG.A > 0) {
            String str2 = (String) a1VarG.get(0);
            if (this.b.get(str2) != null) {
                androidx.transition.k.h();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new androidx.datastore.preferences.protobuf.i(androidx.compose.runtime.j.n(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        com.google.common.collect.h0 h0VarV = d0VarK.g().v();
        rd rdVar = new rd();
        String scheme = uri.getScheme();
        ie ieVar = (ie) this.a.get(scheme);
        if (ieVar == null) {
            throw new androidx.datastore.preferences.protobuf.i(androidx.compose.runtime.j.i("Requested backend isn't registered: ", scheme));
        }
        rdVar.a = ieVar;
        rdVar.c = this.c;
        rdVar.b = h0VarV;
        if (!h0VarV.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = h0VarV.listIterator(h0VarV.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        androidx.transition.k.h();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        rdVar.d = uri;
        rd rdVar2 = new rd();
        rdVar2.a = rdVar.a;
        rdVar2.b = rdVar.b;
        rdVar2.c = rdVar.c;
        rdVar2.d = rdVar.d;
        return rdVar2;
    }
}
