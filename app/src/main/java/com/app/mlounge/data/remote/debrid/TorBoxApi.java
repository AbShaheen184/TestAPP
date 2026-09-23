package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.d;
import okhttp3.e0;
import retrofit2.http.a;
import retrofit2.http.f;
import retrofit2.http.i;
import retrofit2.http.o;
import retrofit2.http.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface TorBoxApi {

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class DefaultImpls {
    }

    @f("v1/api/user/me")
    Object a(@i("Authorization") String str, d<? super TorBoxUserInfo> dVar);

    @f("v1/api/torrents/mylist")
    Object b(@i("Authorization") String str, @t("bypass_cache") boolean z, d<? super TorBoxTorrentListResponse> dVar);

    @o("v1/api/torrents/createtorrent")
    Object c(@i("Authorization") String str, @a e0 e0Var, d<? super TorBoxCreateTorrentResponse> dVar);

    @f("v1/api/torrents/requestdl")
    Object d(@t("token") String str, @t("torrent_id") int i, @t("file_id") int i2, @t("zip_link") boolean z, d<? super TorBoxRequestDlResponse> dVar);

    @f("v1/api/torrents/mylist")
    Object e(@i("Authorization") String str, @t("id") int i, @t("bypass_cache") boolean z, d<? super TorBoxTorrentInfoResponse> dVar);
}
