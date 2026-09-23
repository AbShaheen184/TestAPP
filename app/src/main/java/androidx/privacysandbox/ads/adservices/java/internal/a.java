package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.appcompat.widget.c2;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.e;
import androidx.compose.ui.text.m0;
import androidx.concurrent.futures.j;
import androidx.transition.k;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a implements j {
    public static void A(long j, String str, StringBuilder sb) {
        sb.append((Object) t.i(j));
        sb.append(str);
    }

    public static void B(c2 c2Var, long j) {
        c2Var.v().q();
        c2Var.b0(j);
    }

    public static void C(g gVar, float f, float f2, float f3, float f4) {
        gVar.u(f, f2);
        gVar.u(f3, f4);
        gVar.l();
    }

    public static /* synthetic */ void D(Object obj) {
        if (obj == null) {
            return;
        }
        k.h();
    }

    public static int a(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    public static int c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int e(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int f(int i, int i2, m0 m0Var) {
        return (m0Var.hashCode() + i) * i2;
    }

    public static int g(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int h(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static androidx.compose.foundation.interaction.k i(s sVar) {
        androidx.compose.foundation.interaction.k kVar = new androidx.compose.foundation.interaction.k();
        sVar.l0(kVar);
        return kVar;
    }

    public static g j(float f, float f2) {
        g gVar = new g(0);
        gVar.v(f, f2);
        return gVar;
    }

    public static ClassCastException k(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object l(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String n(int i, String str) {
        return str + i;
    }

    public static String o(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String p(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String q(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String r(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String s(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder v(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2, int i, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void y(int i, s sVar, int i2, e eVar) {
        sVar.l0(Integer.valueOf(i));
        sVar.b(Integer.valueOf(i2), eVar);
    }

    public static void z(int i, s sVar, e eVar, s sVar2, d dVar) {
        androidx.compose.runtime.t.p(sVar, Integer.valueOf(i), eVar);
        androidx.compose.runtime.t.t(sVar2, dVar);
    }
}
