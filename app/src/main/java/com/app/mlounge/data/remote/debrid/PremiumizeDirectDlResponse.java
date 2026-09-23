package com.app.mlounge.data.remote.debrid;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import androidx.room.b0;
import com.google.gson.annotations.b;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeDirectDlResponse {
    public static final int $stable = 8;

    @b("content")
    private final List<PremiumizeContent> content;

    @b("filename")
    private final String filename;

    @b("filesize")
    private final Long filesize;

    @b("status")
    private final String status;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class PremiumizeContent {
        public static final int $stable = 0;

        @b("link")
        private final String link;

        @b("path")
        private final String path;

        @b("size")
        private final Long size;

        @b("stream_link")
        private final String streamLink;

        @b("transcode_status")
        private final String transcodeStatus;

        public final String a() {
            return this.link;
        }

        public final Long b() {
            return this.size;
        }

        public final String c() {
            return this.streamLink;
        }

        public final boolean d() {
            String str = this.path;
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
            if (!(obj instanceof PremiumizeContent)) {
                return false;
            }
            PremiumizeContent premiumizeContent = (PremiumizeContent) obj;
            return l.a(this.path, premiumizeContent.path) && l.a(this.size, premiumizeContent.size) && l.a(this.link, premiumizeContent.link) && l.a(this.streamLink, premiumizeContent.streamLink) && l.a(this.transcodeStatus, premiumizeContent.transcodeStatus);
        }

        public final int hashCode() {
            String str = this.path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.size;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.link;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.streamLink;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.transcodeStatus;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            String str = this.path;
            Long l = this.size;
            String str2 = this.link;
            String str3 = this.streamLink;
            String str4 = this.transcodeStatus;
            StringBuilder sb = new StringBuilder("PremiumizeContent(path=");
            sb.append(str);
            sb.append(", size=");
            sb.append(l);
            sb.append(", link=");
            b0.i(sb, str2, ", streamLink=", str3, ", transcodeStatus=");
            return a.u(sb, str4, ")");
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
        if (!(obj instanceof PremiumizeDirectDlResponse)) {
            return false;
        }
        PremiumizeDirectDlResponse premiumizeDirectDlResponse = (PremiumizeDirectDlResponse) obj;
        return l.a(this.status, premiumizeDirectDlResponse.status) && l.a(this.content, premiumizeDirectDlResponse.content) && l.a(this.filename, premiumizeDirectDlResponse.filename) && l.a(this.filesize, premiumizeDirectDlResponse.filesize);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PremiumizeContent> list = this.content;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.filename;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.filesize;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeDirectDlResponse(status=" + this.status + ", content=" + this.content + ", filename=" + this.filename + ", filesize=" + this.filesize + ")";
    }
}
