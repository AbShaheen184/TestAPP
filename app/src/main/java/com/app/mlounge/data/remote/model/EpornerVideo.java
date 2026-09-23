package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.room.b0;
import com.google.gson.annotations.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class EpornerVideo {
    public static final int $stable = 8;
    private final String added;

    @b("default_thumb")
    private final EpornerThumb defaultThumb;
    private final String id;
    private final String keywords;

    @b("length_min")
    private final String lengthMin;
    private final String rate;
    private final List<EpornerThumb> thumbs;
    private final String title;
    private final String url;
    private final Long views;

    public EpornerVideo(String str, String str2, String str3, Long l, String str4, String str5, String str6, EpornerThumb epornerThumb, ArrayList arrayList, String str7) {
        this.id = str;
        this.title = str2;
        this.keywords = str3;
        this.views = l;
        this.rate = str4;
        this.added = str5;
        this.lengthMin = str6;
        this.defaultThumb = epornerThumb;
        this.thumbs = arrayList;
        this.url = str7;
    }

    public final EpornerThumb a() {
        return this.defaultThumb;
    }

    public final String b() {
        return this.id;
    }

    public final String c() {
        return this.lengthMin;
    }

    public final String d() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpornerVideo)) {
            return false;
        }
        EpornerVideo epornerVideo = (EpornerVideo) obj;
        return l.a(this.id, epornerVideo.id) && l.a(this.title, epornerVideo.title) && l.a(this.keywords, epornerVideo.keywords) && l.a(this.views, epornerVideo.views) && l.a(this.rate, epornerVideo.rate) && l.a(this.added, epornerVideo.added) && l.a(this.lengthMin, epornerVideo.lengthMin) && l.a(this.defaultThumb, epornerVideo.defaultThumb) && l.a(this.thumbs, epornerVideo.thumbs) && l.a(this.url, epornerVideo.url);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.keywords;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.views;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.rate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.added;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lengthMin;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EpornerThumb epornerThumb = this.defaultThumb;
        int iHashCode8 = (iHashCode7 + (epornerThumb == null ? 0 : epornerThumb.hashCode())) * 31;
        List<EpornerThumb> list = this.thumbs;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.url;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.keywords;
        Long l = this.views;
        String str4 = this.rate;
        String str5 = this.added;
        String str6 = this.lengthMin;
        EpornerThumb epornerThumb = this.defaultThumb;
        List<EpornerThumb> list = this.thumbs;
        String str7 = this.url;
        StringBuilder sbQ = j.q("EpornerVideo(id=", str, ", title=", str2, ", keywords=");
        sbQ.append(str3);
        sbQ.append(", views=");
        sbQ.append(l);
        sbQ.append(", rate=");
        b0.i(sbQ, str4, ", added=", str5, ", lengthMin=");
        sbQ.append(str6);
        sbQ.append(", defaultThumb=");
        sbQ.append(epornerThumb);
        sbQ.append(", thumbs=");
        sbQ.append(list);
        sbQ.append(", url=");
        sbQ.append(str7);
        sbQ.append(")");
        return sbQ.toString();
    }
}
