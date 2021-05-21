package com.yds.composedemo.data.posts

import com.yds.composedemo.model.Post
import com.yds.composedemo.data.Result
import kotlinx.coroutines.flow.Flow

interface PostsRepository {


    suspend fun getPost(post:String?):Result<Post>

    suspend fun getPosts():Result<List<Post>>

    fun observeFavorites(): Flow<Set<String>>

    suspend fun toggleFavorite(postId:String)

}