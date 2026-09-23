package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xd {
    public static final Pattern a = Pattern.compile("[a-z]+(_[a-z]+)*");
    public static final Account b = ud.a;
    public static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
