package androidx.emoji2.text;

import android.text.TextUtils;
import androidx.compose.ui.platform.u1;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class r implements p, com.google.common.base.p {
    public final String e;

    public r(String str) {
        str.getClass();
        this.e = str;
    }

    public static CharSequence g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(g(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.e);
                    sb.append(g(it.next()));
                }
            }
        } catch (IOException e) {
            kotlinx.coroutines.future.a.o(e);
        }
    }

    @Override // com.google.common.base.p
    public Iterator b(u1 u1Var, CharSequence charSequence) {
        return new com.google.common.base.n(this, u1Var, charSequence, 1);
    }

    public Mac c() {
        try {
            return Mac.getInstance(this.e);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("defined mac algorithm was not found", e);
        } catch (Exception e2) {
            throw new IllegalStateException("could not create mac instance in hkdf", e2);
        }
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    @Override // androidx.emoji2.text.p
    public boolean f(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        yVar.c = (yVar.c & 3) | 4;
        return false;
    }

    public /* synthetic */ r(String str, boolean z) {
        this.e = str;
    }

    @Override // androidx.emoji2.text.p
    public Object e() {
        return this;
    }
}
