package androidx.compose.foundation.internal;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.i;
import androidx.compose.ui.text.font.j;
import androidx.compose.ui.text.font.k;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.style.l;
import androidx.compose.ui.text.style.o;
import androidx.compose.ui.text.style.p;
import com.app.mlounge.data.music.e;
import java.util.List;
import kotlin.collections.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    public static final f1 a(g gVar) {
        List list = gVar.z;
        w wVar = w.e;
        List list2 = list == null ? wVar : list;
        CharSequence charSequence = gVar.y;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            e eVar = new e(10, false);
            eVar.y = Parcel.obtain();
            if (list == null) {
                list = wVar;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                androidx.compose.ui.text.e eVar2 = (androidx.compose.ui.text.e) list.get(i);
                e0 e0Var = (e0) eVar2.a;
                int i2 = eVar2.b;
                int i3 = eVar2.c;
                ((Parcel) eVar.y).recycle();
                eVar.y = Parcel.obtain();
                o oVar = e0Var.a;
                long j = e0Var.l;
                long j2 = e0Var.h;
                int i4 = i;
                long j3 = e0Var.b;
                List list3 = list;
                int i5 = size;
                long jB = oVar.b();
                long j4 = t.i;
                if (!t.c(jB, j4)) {
                    eVar.l((byte) 1);
                    ((Parcel) eVar.y).writeLong(e0Var.a.b());
                }
                long j5 = androidx.compose.ui.unit.o.c;
                byte b = 2;
                if (!androidx.compose.ui.unit.o.a(j3, j5)) {
                    eVar.l((byte) 2);
                    eVar.o(j3);
                }
                k kVar = e0Var.c;
                if (kVar != null) {
                    eVar.l((byte) 3);
                    ((Parcel) eVar.y).writeInt(kVar.e);
                }
                i iVar = e0Var.d;
                if (iVar != null) {
                    int i6 = iVar.a;
                    eVar.l((byte) 4);
                    eVar.l((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                j jVar = e0Var.e;
                if (jVar != null) {
                    int i7 = jVar.a;
                    eVar.l((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    eVar.l(b);
                }
                String str = e0Var.g;
                if (str != null) {
                    eVar.l((byte) 6);
                    ((Parcel) eVar.y).writeString(str);
                }
                if (!androidx.compose.ui.unit.o.a(j2, j5)) {
                    eVar.l((byte) 7);
                    eVar.o(j2);
                }
                androidx.compose.ui.text.style.a aVar = e0Var.i;
                if (aVar != null) {
                    float f = aVar.a;
                    eVar.l((byte) 8);
                    eVar.m(f);
                }
                p pVar = e0Var.j;
                if (pVar != null) {
                    eVar.l((byte) 9);
                    eVar.m(pVar.a);
                    eVar.m(pVar.b);
                }
                if (!t.c(j, j4)) {
                    eVar.l((byte) 10);
                    ((Parcel) eVar.y).writeLong(j);
                }
                l lVar = e0Var.m;
                if (lVar != null) {
                    eVar.l((byte) 11);
                    ((Parcel) eVar.y).writeInt(lVar.a);
                }
                m0 m0Var = e0Var.n;
                if (m0Var != null) {
                    eVar.l((byte) 12);
                    ((Parcel) eVar.y).writeLong(m0Var.a);
                    long j6 = m0Var.b;
                    eVar.m(Float.intBitsToFloat((int) (j6 >> 32)));
                    eVar.m(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    eVar.m(m0Var.c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) eVar.y).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new f1(ClipData.newPlainText("plain text", charSequence));
    }
}
