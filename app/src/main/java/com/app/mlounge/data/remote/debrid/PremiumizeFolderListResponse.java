package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import com.google.gson.annotations.b;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeFolderListResponse {
    public static final int $stable = 8;

    @b("content")
    private final List<PremiumizeFolderItem> content;

    @b("status")
    private final String status;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class PremiumizeFolderItem {
        public static final int $stable = 0;

        @b("id")
        private final String id;

        @b("link")
        private final String link;

        @b("name")
        private final String name;

        @b("size")
        private final Long size;

        @b("stream_link")
        private final String streamLink;

        @b("transcode_status")
        private final String transcodeStatus;

        @b("type")
        private final String type;

        public final String a() {
            return this.id;
        }

        public final String b() {
            return this.link;
        }

        public final Long c() {
            return this.size;
        }

        public final String d() {
            return this.streamLink;
        }

        public final boolean e() {
            String str = this.name;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (r.n(lowerCase, ".mp4", false) || r.n(lowerCase, ".mkv", false) || r.n(lowerCase, ".avi", false) || r.n(lowerCase, ".mov", false) || r.n(lowerCase, ".wmv", false) || r.n(lowerCase, ".flv", false) || r.n(lowerCase, ".webm", false) || r.n(lowerCase, ".m4v", false) || r.n(lowerCase, ".mpg", false) || r.n(lowerCase, ".mpeg", false) || r.n(lowerCase, ".ts", false) || r.n(lowerCase, ".m2ts", false)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumizeFolderItem)) {
                return false;
            }
            PremiumizeFolderItem premiumizeFolderItem = (PremiumizeFolderItem) obj;
            return l.a(this.id, premiumizeFolderItem.id) && l.a(this.name, premiumizeFolderItem.name) && l.a(this.type, premiumizeFolderItem.type) && l.a(this.link, premiumizeFolderItem.link) && l.a(this.streamLink, premiumizeFolderItem.streamLink) && l.a(this.size, premiumizeFolderItem.size) && l.a(this.transcodeStatus, premiumizeFolderItem.transcodeStatus);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.link;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.streamLink;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Long l = this.size;
            int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            String str6 = this.transcodeStatus;
            return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.type;
            String str4 = this.link;
            String str5 = this.streamLink;
            Long l = this.size;
            String str6 = this.transcodeStatus;
            StringBuilder sbQ = j.q("PremiumizeFolderItem(id=", str, ", name=", str2, ", type=");
            b0.i(sbQ, str3, ", link=", str4, ", streamLink=");
            sbQ.append(str5);
            sbQ.append(", size=");
            sbQ.append(l);
            sbQ.append(", transcodeStatus=");
            return a.u(sbQ, str6, ")");
        }
    }

    public final List a() {
        return this.content;
    }

    public final boolean b() {
        return l.a(this.status, "success");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumizeFolderListResponse)) {
            return false;
        }
        PremiumizeFolderListResponse premiumizeFolderListResponse = (PremiumizeFolderListResponse) obj;
        return l.a(this.status, premiumizeFolderListResponse.status) && l.a(this.content, premiumizeFolderListResponse.content);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PremiumizeFolderItem> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeFolderListResponse(status=" + this.status + ", content=" + this.content + ")";
    }
}
