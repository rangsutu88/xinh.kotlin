package today.xinh.xinhtoday

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.image_row.view.*

/**
 * Created by tu on 29/01/2018.
 */
class MainAdapter(val imageFeed: ImageFeed): RecyclerView.Adapter<CustomViewHolder>() {
    override fun getItemCount(): Int {
        return imageFeed.results.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.image_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val image = imageFeed.results.get(position)
//        holder?.view?.textView?.text = image.source

        val imageView = holder?.view?.imageView
        Picasso.with(holder?.view?.context).load(image.url).into(imageView)
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}