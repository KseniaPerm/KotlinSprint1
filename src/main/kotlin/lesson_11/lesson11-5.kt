package org.example.lesson_11

class Forum(
    var userId: Int?,
    var userName: String?,
    var authorId: Int?,
    var message: String?,
) {
    class ForumBuilder(
        var userId: Int? = 0,
        var userName: String? = " ",
        var authorId: Int? = 0,
        var message: String? = " ",
    ) {
        fun setUserId(id: Int) = apply { userId = id }
        fun setUserName(name: String) = apply { userName = name }
        fun setAuthorId(author: Int) = apply { authorId = author }
        fun setMessage(mess: String) = apply { message = mess }

        fun build() = Forum(userId, userName, authorId, message)
    }
}

fun main() {

}

class MemberOfForumBuilder(
    val userId: Int,
    val userName: String,
) {}

class ForumMessages(
    val authorId: Int,
    val message: String,
) {}
