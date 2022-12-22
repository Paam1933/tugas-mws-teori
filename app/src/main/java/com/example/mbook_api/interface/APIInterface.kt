package com.example.mbook_api.`interface`


import com.example.mbook_api.model.BookModel
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {

    @GET("books")
    fun getBooks(): Call<ArrayList<BookModel>>

    @GET("books/{id}")
    fun getBook( @Path("id") id:Int ): Call<ArrayList<BookModel>>

    @FormUrlEncoded
    @POST("books")
    fun createBooks(
        @Field("judul") judul: String,
        @Field("isi_konten") isi_konten: String,
    ) : Call<BookModel>

    @FormUrlEncoded
    @PUT("books/{id}")
    fun updateBooks(
        @Path("id")id: Int?,
        @Field("judul")judul: String,
        @Field("isi_konten")isi_konten: String,
    ) : Call<BookModel>

    @DELETE("books/{id}")
    fun deleteBook(@Path("id") id: Int?): Call<Unit>
}