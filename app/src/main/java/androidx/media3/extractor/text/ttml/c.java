package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.media3.common.text.h;
import androidx.media3.common.util.i0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final g f;
    public final String[] g;
    public final String h;
    public final String i;
    public final c j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public c(String str, String str2, long j, long j2, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = gVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = cVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            androidx.media3.common.text.a aVar = new androidx.media3.common.text.a();
            aVar.a = new SpannableStringBuilder();
            aVar.b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((androidx.media3.common.text.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((c) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        c cVar;
        int i2;
        g gVarD;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    androidx.media3.common.text.a aVar = (androidx.media3.common.text.a) treeMap.get(str4);
                    aVar.getClass();
                    f fVar = (f) map2.get(str3);
                    fVar.getClass();
                    int i10 = fVar.j;
                    g gVarD2 = android.support.v4.media.session.b.D(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a = spannableStringBuilder;
                        aVar.b = null;
                    }
                    if (gVarD2 != null) {
                        int i11 = gVarD2.h;
                        int i12 = 1;
                        if (((i11 == -1 && gVarD2.i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (gVarD2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = gVarD2.h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (gVarD2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (gVarD2.i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (gVarD2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (gVarD2.f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (gVarD2.g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (gVarD2.c) {
                            if (!gVarD2.c) {
                                kotlinx.coroutines.future.a.u("Font color has not been defined.");
                                return;
                            }
                            coil3.network.g.c(spannableStringBuilder, new ForegroundColorSpan(gVarD2.b), iIntValue, iIntValue2);
                        }
                        if (gVarD2.e) {
                            if (!gVarD2.e) {
                                kotlinx.coroutines.future.a.u("Background color has not been defined.");
                                return;
                            }
                            coil3.network.g.c(spannableStringBuilder, new BackgroundColorSpan(gVarD2.d), iIntValue, iIntValue2);
                        }
                        if (gVarD2.a != null) {
                            coil3.network.g.c(spannableStringBuilder, new TypefaceSpan(gVarD2.a), iIntValue, iIntValue2);
                        }
                        b bVar = gVarD2.r;
                        if (bVar != null) {
                            int i14 = bVar.a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = bVar.b;
                            }
                            int i15 = bVar.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            coil3.network.g.c(spannableStringBuilder, new h(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = gVarD2.m;
                        if (i16 == 2) {
                            c cVar2 = this.j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                g gVarD3 = android.support.v4.media.session.b.D(cVar2.f, cVar2.g, map3);
                                if (gVarD3 != null && gVarD3.m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    g gVarD4 = android.support.v4.media.session.b.D(cVar3.f, cVar3.g, map3);
                                    if (gVarD4 != null && gVarD4.m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iC = cVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(cVar3.b(iC));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1) {
                                        i2 = 0;
                                        if (cVar.b(0).b != null) {
                                            String str5 = cVar.b(0).b;
                                            String str6 = i0.a;
                                            g gVarD5 = android.support.v4.media.session.b.D(cVar.f, cVar.g, map3);
                                            int i17 = gVarD5 != null ? gVarD5.n : -1;
                                            if (i17 == -1 && (gVarD = android.support.v4.media.session.b.D(cVar2.f, cVar2.g, map3)) != null) {
                                                i17 = gVarD.n;
                                            }
                                            spannableStringBuilder.setSpan(new androidx.media3.common.text.g(str5, i17), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    androidx.media3.common.util.b.k("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (gVarD2.q == 1) {
                                coil3.network.g.c(spannableStringBuilder, new androidx.media3.common.text.e(), iIntValue, iIntValue2);
                            }
                            i3 = gVarD2.j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                coil3.network.g.c(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarD2.k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                coil3.network.g.c(spannableStringBuilder, new RelativeSizeSpan(gVarD2.k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = gVarD2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = gVarD2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    aVar.q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = gVarD2.o;
                                if (alignment != null) {
                                    aVar.c = alignment;
                                }
                                alignment2 = gVarD2.p;
                                if (alignment2 != null) {
                                    aVar.d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (gVarD2.q == 1) {
                            coil3.network.g.c(spannableStringBuilder, new androidx.media3.common.text.e(), iIntValue, iIntValue2);
                        }
                        i3 = gVarD2.j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            coil3.network.g.c(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarD2.k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            coil3.network.g.c(spannableStringBuilder, new RelativeSizeSpan(gVarD2.k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = gVarD2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = gVarD2.s;
                            if (f3 != Float.MAX_VALUE) {
                                aVar.q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = gVarD2.o;
                            if (alignment != null) {
                                aVar.c = alignment;
                            }
                            alignment2 = gVarD2.p;
                            if (alignment2 != null) {
                                aVar.d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < c()) {
                b(i20).h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((androidx.media3.common.text.a) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((androidx.media3.common.text.a) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
