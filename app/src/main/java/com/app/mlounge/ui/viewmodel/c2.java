package com.app.mlounge.ui.viewmodel;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.app.mlounge.ui.viewmodel.c2[], still in use, count: 1, list:
  (r0v1 com.app.mlounge.ui.viewmodel.c2[]) from 0x005a: CONSTRUCTOR (r0v1 com.app.mlounge.ui.viewmodel.c2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: kotlin.enums.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class c2 {
    ADDED_DESC("Recent First"),
    /* JADX INFO: Fake field, exist only in values array */
    ADDED_ASC("Oldest First"),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_ASC("Title A-Z"),
    /* JADX INFO: Fake field, exist only in values array */
    TITLE_DESC("Title Z-A"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING_DESC("Highest Rated"),
    /* JADX INFO: Fake field, exist only in values array */
    RATING_ASC("Lowest Rated"),
    /* JADX INFO: Fake field, exist only in values array */
    RELEASE_DESC("Newest Release"),
    /* JADX INFO: Fake field, exist only in values array */
    RELEASE_ASC("Oldest Release");

    public static final /* synthetic */ kotlin.enums.c A;
    public final String e;

    static {
        A = new kotlin.enums.c(c2VarArr);
    }

    public c2(String str) {
        super(str, i);
        this.e = str;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) z.clone();
    }
}
