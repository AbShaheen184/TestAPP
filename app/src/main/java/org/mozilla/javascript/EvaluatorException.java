package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class EvaluatorException extends RhinoException {
    private static final long serialVersionUID = -8743165779676009808L;

    public EvaluatorException(String str, String str2, int i) {
        this(str, str2, i, null, 0);
    }

    @Deprecated
    public int getColumnNumber() {
        return columnNumber();
    }

    @Deprecated
    public int getLineNumber() {
        return lineNumber();
    }

    @Deprecated
    public String getLineSource() {
        return lineSource();
    }

    @Deprecated
    public String getSourceName() {
        return sourceName();
    }

    public EvaluatorException(String str) {
        super(str);
    }

    public EvaluatorException(String str, String str2, int i, String str3, int i2) {
        super(str);
        recordErrorOrigin(str2, i, str3, i2);
    }
}
