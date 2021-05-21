package com.yds.composedemo.data.posts.impl

import com.yds.composedemo.data.Result
import com.yds.composedemo.data.posts.PostsRepository
import com.yds.composedemo.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.withContext
import java.lang.IllegalArgumentException

class FakePostsRepository:PostsRepository {

    private val favorites = MutableStateFlow<Set<String>>(setOf())

    private val mutex = Mutex()

    override suspend fun getPost(postId: String?): Result<Post> {
        return withContext(Dispatchers.IO){
            val post = posts.find{it.id == postId}
            if(post==null){
                Result.Error(IllegalArgumentException("Post not found"))
            }else{
                Result.Success(post)
            }
        }
    }

    override suspend fun getPosts(): Result<List<Post>> {
        TODO("Not yet implemented")
    }

    override fun observeFavorites(): Flow<Set<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun toggleFavorite(postId: String) {
        TODO("Not yet implemented")
    }
}