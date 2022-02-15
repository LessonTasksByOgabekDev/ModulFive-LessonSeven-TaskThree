package dev.ogabek.kotlin.model

import dev.ogabek.kotlin.model.Short

class Feed {
    var profilePhoto = 0
    var picture = 0
    lateinit var time: String
    lateinit var title: String
    lateinit var description: String

    var shorts: List<Short>? = null

    constructor(shorts: List<Short>) {
        this.shorts = shorts
    }

    constructor(profilePhoto: Int, picture: Int, time: String, title: String, description: String) {
        this.profilePhoto = profilePhoto
        this.picture = picture
        this.time = time
        this.title = title
        this.description = description
    }

}