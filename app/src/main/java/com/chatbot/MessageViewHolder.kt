import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.chatbot.Message
import com.chatbot.R

class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val messageTextView: TextView = itemView.findViewById(R.id.messageTextView)

    fun bind(message: Message.Message) {
        messageTextView.text = message.text
    }
}
