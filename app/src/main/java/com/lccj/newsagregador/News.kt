package com.lccj.newsagregador

/**
 * Model for the news data that will be stored in the Firebase db
 */

data class News (val title: String, val link: String,
                 val description: String, val pubDate: String, val thumbnail: String) {

    constructor() : this("","","","","")
}