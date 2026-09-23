package org.mozilla.javascript.ast;

import org.mozilla.javascript.ErrorReporter;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface IdeErrorReporter extends ErrorReporter {
    void error(String str, String str2, int i, int i2);

    void warning(String str, String str2, int i, int i2);
}
