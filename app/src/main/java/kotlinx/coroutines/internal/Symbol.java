package kotlinx.coroutines.internal;

import androidx.compose.runtime.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class Symbol {
    public final String symbol;

    public Symbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        return j.l(new StringBuilder("<"), this.symbol, '>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
