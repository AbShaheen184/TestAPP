package androidx.core.text;

import android.util.SparseBooleanArray;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.media3.common.o;
import com.google.firebase.crashlytics.internal.metadata.j;
import com.google.firebase.crashlytics.internal.metadata.k;
import kotlinx.serialization.json.internal.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class f implements k {
    public boolean a;
    public Object b;

    public f() {
        this.b = new SparseBooleanArray();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.k
    public void a(j jVar, int i) {
        StringBuilder sb = (StringBuilder) this.b;
        if (this.a) {
            this.a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b(int i) {
        _COROUTINE.a.A(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public o c() {
        _COROUTINE.a.A(!this.a);
        this.a = true;
        return new o((SparseBooleanArray) this.b);
    }

    public boolean d() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    public boolean e(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            kotlinx.coroutines.future.a.r();
            return false;
        }
        e eVar = (e) this.b;
        if (eVar == null) {
            return d();
        }
        eVar.getClass();
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            f fVar = g.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return d();
        }
        return false;
    }

    public void f() {
        this.a = false;
    }

    public void g(byte b) {
        ((l) this.b).p(String.valueOf(b));
    }

    public void h(char c) {
        l lVar = (l) this.b;
        lVar.f(lVar.y, 1);
        char[] cArr = (char[]) lVar.z;
        int i = lVar.y;
        lVar.y = i + 1;
        cArr[i] = c;
    }

    public void i(int i) {
        ((l) this.b).p(String.valueOf(i));
    }

    public void j(long j) {
        ((l) this.b).p(String.valueOf(j));
    }

    public void k(short s) {
        ((l) this.b).p(String.valueOf(s));
    }

    public void l(String str) {
        byte b;
        str.getClass();
        l lVar = (l) this.b;
        lVar.f(lVar.y, str.length() + 2);
        char[] cArr = (char[]) lVar.z;
        int i = lVar.y;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = p.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    lVar.f(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = p.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) lVar.z)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = p.a[cCharAt];
                        str2.getClass();
                        lVar.f(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) lVar.z, i4);
                        int length3 = str2.length() + i4;
                        lVar.y = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) lVar.z;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        lVar.y = i4;
                    }
                }
                lVar.f(i4, 1);
                ((char[]) lVar.z)[i4] = '\"';
                lVar.y = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        lVar.y = i3 + 1;
    }

    public /* synthetic */ f(Object obj) {
        this.b = obj;
        this.a = true;
    }

    public f(e eVar, boolean z) {
        this.b = eVar;
        this.a = z;
    }

    public void m() {
    }

    public void n() {
    }
}
