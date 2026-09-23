package org.mozilla.javascript;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Ref implements Serializable {
    private static final long serialVersionUID = 4044540354730911424L;

    public boolean delete(Context context) {
        return false;
    }

    public abstract Object get(Context context);

    public boolean has(Context context) {
        return true;
    }

    @Deprecated
    public abstract Object set(Context context, Object obj);

    public Object set(Context context, Scriptable scriptable, Object obj) {
        return set(context, obj);
    }
}
