package today.xinh.xinhtoday

/**
 * Created by tu on 29/01/2018.
 */


class ImageFeed(val count: Int, val next: String, val previous: String, val results: List<Image>)

class Image(val id: Int, val url: String, val source: String)