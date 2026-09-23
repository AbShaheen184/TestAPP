package androidx.constraintlayout.core;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public final Object[] a;
    public int b;

    public d(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            kotlinx.coroutines.future.a.q("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public void b(b bVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.b = i + 1;
        }
    }

    public boolean c(Object obj) {
        obj.getClass();
        int i = this.b;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= i) {
                int i3 = this.b;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.b = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                kotlinx.coroutines.future.a.u("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public d() {
        this.a = new Object[LibretroCore.SCREEN_WIDTH];
    }
}
