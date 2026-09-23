package androidx.emoji2.text.flatbuffer;

import androidx.collection.g;
import com.google.android.material.shape.f;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public Object A;
    public int e;
    public int y;
    public int z;

    public c() {
        if (f.y == null) {
            f.y = new f(6);
        }
    }

    public int b(int i) {
        if (i < this.z) {
            return ((ByteBuffer) this.A).getShort(this.y + i);
        }
        return 0;
    }

    public void c() {
        if (((kotlin.collections.builders.f) this.A).E == this.z) {
            return;
        }
        g.d();
    }

    public void d() {
        while (true) {
            int i = this.e;
            kotlin.collections.builders.f fVar = (kotlin.collections.builders.f) this.A;
            if (i >= fVar.C || fVar.z[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.e < ((kotlin.collections.builders.f) this.A).C;
    }

    public void remove() {
        kotlin.collections.builders.f fVar = (kotlin.collections.builders.f) this.A;
        c();
        if (this.y == -1) {
            kotlinx.coroutines.future.a.u("Call next() before removing element from the iterator.");
            return;
        }
        fVar.c();
        fVar.k(this.y);
        this.y = -1;
        this.z = fVar.E;
    }
}
