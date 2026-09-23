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
public final class TorBoxTorrentListResponse {
    public static final int $stable = 8;

    @b("data")
    private final List<TorrentItem> data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class TorrentFile {
        public static final int $stable = 0;

        @b("id")
        private final int id;

        @b("mimetype")
        private final String mimetype;

        @b("name")
        private final String name;

        @b("s3_path")
        private final String s3Path;

        @b("short_name")
        private final String shortName;

        @b("size")
        private final long size;

        public final int a() {
            return this.id;
        }

        public final long b() {
            return this.size;
        }

        public final boolean c() {
            String str = this.mimetype;
            if (str == null || !r.u(str, "video/", false)) {
                String str2 = this.name;
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (r.n(lowerCase, ".mp4", false) || r.n(lowerCase, ".mkv", false) || r.n(lowerCase, ".avi", false) || r.n(lowerCase, ".mov", false) || r.n(lowerCase, ".wmv", false) || r.n(lowerCase, ".flv", false) || r.n(lowerCase, ".webm", false) || r.n(lowerCase, ".m4v", false) || r.n(lowerCase, ".mpg", false) || r.n(lowerCase, ".mpeg", false) || r.n(lowerCase, ".ts", false) || r.n(lowerCase, ".m2ts", false)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TorrentFile)) {
                return false;
            }
            TorrentFile torrentFile = (TorrentFile) obj;
            return this.id == torrentFile.id && l.a(this.name, torrentFile.name) && this.size == torrentFile.size && l.a(this.s3Path, torrentFile.s3Path) && l.a(this.shortName, torrentFile.shortName) && l.a(this.mimetype, torrentFile.mimetype);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.name;
            int iE = a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.size);
            String str2 = this.s3Path;
            int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.shortName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.mimetype;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            int i = this.id;
            String str = this.name;
            long j = this.size;
            String str2 = this.s3Path;
            String str3 = this.shortName;
            String str4 = this.mimetype;
            StringBuilder sb = new StringBuilder("TorrentFile(id=");
            sb.append(i);
            sb.append(", name=");
            sb.append(str);
            sb.append(", size=");
            sb.append(j);
            sb.append(", s3Path=");
            sb.append(str2);
            b0.i(sb, ", shortName=", str3, ", mimetype=", str4);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class TorrentItem {
        public static final int $stable = 8;

        @b("download_finished")
        private final boolean downloadFinished;

        @b("download_state")
        private final String downloadState;

        @b("files")
        private final List<TorrentFile> files;

        @b("hash")
        private final String hash;

        @b("id")
        private final int id;

        @b("name")
        private final String name;

        @b("progress")
        private final double progress;

        @b("size")
        private final long size;

        public final List a() {
            return this.files;
        }

        public final String b() {
            return this.hash;
        }

        public final int c() {
            return this.id;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TorrentItem)) {
                return false;
            }
            TorrentItem torrentItem = (TorrentItem) obj;
            return this.id == torrentItem.id && l.a(this.hash, torrentItem.hash) && l.a(this.name, torrentItem.name) && l.a(this.downloadState, torrentItem.downloadState) && this.downloadFinished == torrentItem.downloadFinished && l.a(this.files, torrentItem.files) && this.size == torrentItem.size && Double.compare(this.progress, torrentItem.progress) == 0;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.hash;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.downloadState;
            int iH = a.h((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.downloadFinished);
            List<TorrentFile> list = this.files;
            return Double.hashCode(this.progress) + a.e((iH + (list != null ? list.hashCode() : 0)) * 31, 31, this.size);
        }

        public final String toString() {
            int i = this.id;
            String str = this.hash;
            String str2 = this.name;
            String str3 = this.downloadState;
            boolean z = this.downloadFinished;
            List<TorrentFile> list = this.files;
            long j = this.size;
            double d = this.progress;
            StringBuilder sb = new StringBuilder("TorrentItem(id=");
            sb.append(i);
            sb.append(", hash=");
            sb.append(str);
            sb.append(", name=");
            b0.i(sb, str2, ", downloadState=", str3, ", downloadFinished=");
            sb.append(z);
            sb.append(", files=");
            sb.append(list);
            sb.append(", size=");
            sb.append(j);
            sb.append(", progress=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }

    public final List a() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxTorrentListResponse)) {
            return false;
        }
        TorBoxTorrentListResponse torBoxTorrentListResponse = (TorBoxTorrentListResponse) obj;
        return this.success == torBoxTorrentListResponse.success && l.a(this.detail, torBoxTorrentListResponse.detail) && l.a(this.error, torBoxTorrentListResponse.error) && l.a(this.data, torBoxTorrentListResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TorrentItem> list = this.data;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxTorrentListResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
