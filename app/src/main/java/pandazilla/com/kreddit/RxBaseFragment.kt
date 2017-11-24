package pandazilla.com.kreddit

import android.support.v4.app.Fragment
import kotlinx.coroutines.experimental.Job
import rx.subscriptions.CompositeSubscription


open class RxBaseFragment : Fragment() {

    protected var job: Job? = null

    override fun onResume() {
        super.onResume()
        job = null
    }

    override fun onPause() {
        super.onPause()
        job?.cancel()
        job = null
    }
}