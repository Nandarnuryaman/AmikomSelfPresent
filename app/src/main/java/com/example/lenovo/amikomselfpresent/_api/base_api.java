package com.example.lenovo.amikomselfpresent._api;

/**
 * Created by Lenovo on 04/01/2018.
 */

public class base_api {
    public static final String BASE_URL_API = "http://laundry-in.hol.es/api/";

    public static apiservices getApiService(){
        return retrofid_client.getClient(BASE_URL_API).create(apiservices.class);
    }
}
