package com.yds.composedemo.data

import android.content.Context
import com.yds.composedemo.data.interests.InterestsRepository
import com.yds.composedemo.data.posts.PostsRepository
import com.yds.composedemo.data.posts.impl.FakePostsRepository

interface AppContainer{
    val postsRepository:PostsRepository
    val interestsRepository:InterestsRepository
}

class AppContainerImpl(private val applicationContext: Context):AppContainer{
    override val postsRepository: PostsRepository by lazy{
        FakePostsRepository()
    }
    override val interestsRepository: InterestsRepository
        get() = TODO("Not yet implemented")

}