package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class NativeRegExpInstantiator {
    private NativeRegExpInstantiator() {
    }

    public static NativeRegExp withLanguageVersion(int i) {
        return i < 200 ? new NativeRegExpCallable() : new NativeRegExp();
    }

    public static NativeRegExp withLanguageVersionScopeCompiled(int i, Scriptable scriptable, RECompiled rECompiled) {
        return i < 200 ? new NativeRegExpCallable(scriptable, rECompiled) : new NativeRegExp(scriptable, rECompiled);
    }
}
