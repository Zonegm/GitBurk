package com.uroboros.gitburk;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET ("/users/{username}")
    Call<Usuario> buscarUsuario (
            @Path(value = "username") String username);
}
