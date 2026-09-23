package org.schabi.newpipe.extractor.timeago.patterns;

import j$.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends org.schabi.newpipe.extractor.timeago.b {
    public static final i0 j;

    static {
        i0 i0Var = new i0(" ", new String[]{"שניות", "שנייה"}, new String[]{"דקה", "דקות"}, new String[]{"שעה", "שעות"}, new String[]{"יום", "ימים"}, new String[]{"שבוע", "שבועות"}, new String[]{"חודש", "חודשים"}, new String[]{"שנה", "שנים"});
        i0Var.a(ChronoUnit.HOURS, "שעתיים");
        i0Var.a(ChronoUnit.DAYS, "יומיים");
        i0Var.a(ChronoUnit.WEEKS, "שבועיים");
        i0Var.a(ChronoUnit.MONTHS, "חודשיים");
        i0Var.a(ChronoUnit.YEARS, "שנתיים");
        j = i0Var;
    }
}
