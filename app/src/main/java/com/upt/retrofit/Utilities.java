package com.upt.retrofit;

public class Utilities {
    private Utilities() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIservice getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIservice.class);
    }
}
