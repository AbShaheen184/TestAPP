package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i2 {
    public final List a;

    public g1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.a.equals(((g1) ((i2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.room.b0.f(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
