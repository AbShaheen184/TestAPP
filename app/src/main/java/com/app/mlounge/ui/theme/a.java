package com.app.mlounge.ui.theme;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.app.mlounge.ui.theme.a[], still in use, count: 1, list:
  (r0v1 com.app.mlounge.ui.theme.a[]) from 0x0031: CONSTRUCTOR (r0v1 com.app.mlounge.ui.theme.a[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:50) call: kotlin.enums.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    SMALL("Small", 70),
    MEDIUM("Medium", 85),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE("Large", 110);

    public static final /* synthetic */ kotlin.enums.c B;
    public final String e;
    public final float y;

    static {
        B = new kotlin.enums.c(aVarArr);
    }

    public a(String str, float f) {
        super(str, i);
        this.e = str;
        this.y = f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) A.clone();
    }
}
