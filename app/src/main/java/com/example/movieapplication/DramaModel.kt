package com.example.movieapplication

class DramaModel(title: String?, image: Int?, ) {
    private var title: String
    private var image: Int

    init {
        this.title = title!!
        this.image = image!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getImage(): Int? {
        return image
    }
    fun setImage(image: Int?) {
        this.image = image!!
    }
}