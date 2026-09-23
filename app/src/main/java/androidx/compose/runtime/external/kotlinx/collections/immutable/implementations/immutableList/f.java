package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.p1;
import androidx.room.t;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public final int A;
    public final Object[] e;
    public final Object[] y;
    public final int z;

    public f(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.y = objArr2;
        this.z = i;
        this.A = i2;
        if (!(b() > 32)) {
            p1.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i, int i2, Object obj, e eVar) {
        int iY = _COROUTINE.b.y(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iY == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            o.f(iY + 1, iY, 31, objArr, objArrCopyOf);
            eVar.a = objArr[31];
            objArrCopyOf[iY] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iY];
        obj2.getClass();
        objArrCopyOf2[iY] = k((Object[]) obj2, i3, i2, obj, eVar);
        while (true) {
            iY++;
            if (iY >= 32 || objArrCopyOf2[iY] == null) {
                break;
            }
            Object obj3 = objArr[iY];
            obj3.getClass();
            objArrCopyOf2[iY] = k((Object[]) obj3, i3, 0, eVar.a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] m(Object[] objArr, int i, int i2, e eVar) {
        Object[] objArrM;
        int iY = _COROUTINE.b.y(i2, i);
        if (i == 5) {
            eVar.a = objArr[iY];
            objArrM = null;
        } else {
            Object obj = objArr[iY];
            obj.getClass();
            objArrM = m((Object[]) obj, i - 5, i2, eVar);
        }
        if (objArrM == null && iY == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iY] = objArrM;
        return objArrCopyOf;
    }

    public static Object[] t(int i, int i2, Object obj, Object[] objArr) {
        int iY = _COROUTINE.b.y(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iY] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iY];
        obj2.getClass();
        objArrCopyOf[iY] = t(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c c(int i, Object obj) {
        int i2 = this.z;
        t.f(i, i2);
        if (i == i2) {
            return d(obj);
        }
        int iS = s();
        Object[] objArr = this.e;
        if (i >= iS) {
            return l(i - iS, obj, objArr);
        }
        e eVar = new e((Object) null);
        return l(0, eVar.a, k(objArr, this.A, i, obj, eVar));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c d(Object obj) {
        int iS = s();
        int i = this.z;
        int i2 = i - iS;
        Object[] objArr = this.e;
        Object[] objArr2 = this.y;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new f(objArr, objArrCopyOf, i + 1, this.A);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return o(objArr, objArr2, objArr3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final g f() {
        return new g(this, this.e, this.y, this.A);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        t.d(i, b());
        if (s() <= i) {
            objArr = this.y;
        } else {
            objArr = this.e;
            for (int i2 = this.A; i2 > 0; i2 -= 5) {
                Object obj = objArr[_COROUTINE.b.y(i, i2)];
                obj.getClass();
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c h(b bVar) {
        g gVar = new g(this, this.e, this.y, this.A);
        gVar.B(bVar);
        return gVar.d();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c i(int i) {
        t.d(i, b());
        int iS = s();
        int i2 = this.A;
        Object[] objArr = this.e;
        return i >= iS ? r(objArr, iS, i2, i - iS) : r(q(objArr, i2, i, new e(this.y[0])), iS, i2, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
    public final c j(int i, Object obj) {
        int i2 = this.z;
        t.d(i, i2);
        int iS = s();
        Object[] objArr = this.e;
        Object[] objArr2 = this.y;
        int i3 = this.A;
        if (iS > i) {
            return new f(t(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new f(objArr, objArrCopyOf, i2, i3);
    }

    public final f l(int i, Object obj, Object[] objArr) {
        int iS = s();
        int i2 = this.z;
        int i3 = i2 - iS;
        Object[] objArr2 = this.y;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            o.f(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new f(objArr, objArrCopyOf, i2 + 1, this.A);
        }
        Object obj2 = objArr2[31];
        o.f(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i) {
        t.f(i, this.z);
        return new h(i, this.z, (this.A / 5) + 1, this.e, this.y);
    }

    public final f o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.z;
        int i2 = i >> 5;
        int i3 = this.A;
        if (i2 <= (1 << i3)) {
            return new f(p(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new f(p(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] p(int i, Object[] objArr, Object[] objArr2) {
        int iY = _COROUTINE.b.y(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iY] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iY] = p(i - 5, (Object[]) objArrCopyOf[iY], objArr2);
        return objArrCopyOf;
    }

    public final Object[] q(Object[] objArr, int i, int i2, e eVar) {
        int iY = _COROUTINE.b.y(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iY == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            o.f(iY, iY + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = eVar.a;
            eVar.a = objArr[iY];
            return objArrCopyOf;
        }
        int iY2 = objArr[31] == null ? _COROUTINE.b.y(s() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iY + 1;
        if (i4 <= iY2) {
            while (true) {
                Object obj = objArrCopyOf2[iY2];
                obj.getClass();
                objArrCopyOf2[iY2] = q((Object[]) obj, i3, 0, eVar);
                if (iY2 == i4) {
                    break;
                }
                iY2--;
            }
        }
        Object obj2 = objArrCopyOf2[iY];
        obj2.getClass();
        objArrCopyOf2[iY] = q((Object[]) obj2, i3, i2, eVar);
        return objArrCopyOf2;
    }

    public final c r(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.z - i;
        if (i4 != 1) {
            Object[] objArr2 = this.y;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                o.f(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new f(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new j(objArr);
        }
        e eVar = new e((Object) null);
        Object[] objArrM = m(objArr, i2, i - 1, eVar);
        objArrM.getClass();
        Object obj = eVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrM[1] != null) {
            return new f(objArrM, objArr3, i, i2);
        }
        Object obj2 = objArrM[0];
        obj2.getClass();
        return new f((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int s() {
        return (this.z - 1) & (-32);
    }
}
