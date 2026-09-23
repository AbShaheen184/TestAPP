package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class DefaultErrorReporter implements ErrorReporter {
    static final DefaultErrorReporter instance = new DefaultErrorReporter();
    private ErrorReporter chainedReporter;
    private boolean forEval;

    private DefaultErrorReporter() {
    }

    public static ErrorReporter forEval(ErrorReporter errorReporter) {
        DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter();
        defaultErrorReporter.forEval = true;
        defaultErrorReporter.chainedReporter = errorReporter;
        return defaultErrorReporter;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void error(String str, String str2, int i, String str3, int i2) {
        if (this.forEval) {
            throw ScriptRuntime.constructError("SyntaxError", str, str2, i, str3, i2);
        }
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter == null) {
            throw runtimeError(str, str2, i, str3, i2);
        }
        errorReporter.error(str, str2, i, str3, i2);
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public EvaluatorException runtimeError(String str, String str2, int i, String str3, int i2) {
        ErrorReporter errorReporter = this.chainedReporter;
        return errorReporter != null ? errorReporter.runtimeError(str, str2, i, str3, i2) : new EvaluatorException(str, str2, i, str3, i2);
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void warning(String str, String str2, int i, String str3, int i2) {
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter != null) {
            errorReporter.warning(str, str2, i, str3, i2);
        }
    }
}
