package com.app.mlounge.data.remote.debrid;

import com.google.gson.j;
import kotlin.coroutines.d;
import retrofit2.http.c;
import retrofit2.http.e;
import retrofit2.http.f;
import retrofit2.http.i;
import retrofit2.http.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface AllDebridApi {
    @f("v4/user")
    Object a(@i("Authorization") String str, d<? super j> dVar);

    @f("v4.1/pin/get")
    Object b(d<? super j> dVar);

    @o("v4/link/unlock")
    @e
    Object c(@i("Authorization") String str, @c("link") String str2, d<? super j> dVar);

    @o("v4/magnet/files")
    @e
    Object d(@i("Authorization") String str, @c("id[]") int i, d<? super j> dVar);

    @o("v4/pin/check")
    @e
    Object e(@c("check") String str, @c("pin") String str2, d<? super j> dVar);

    @o("v4.1/magnet/status")
    @e
    Object f(@i("Authorization") String str, @c("id") int i, d<? super j> dVar);

    @o("v4/magnet/upload")
    @e
    Object g(@i("Authorization") String str, @c("magnets[]") String str2, d<? super j> dVar);
}
