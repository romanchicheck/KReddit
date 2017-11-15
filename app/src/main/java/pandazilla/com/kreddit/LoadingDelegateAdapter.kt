package pandazilla.com.kreddit

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = TurnsViewHolder(parent)

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}