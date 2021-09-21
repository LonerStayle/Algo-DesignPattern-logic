package design_pattern

import org.junit.Test
import kotlin.properties.Delegates

interface TextChangedListener {
    fun onTextChanged(oldText: String, newText: String)
}

class PrintingTextChangedListener : TextChangedListener {
    var text = ""
    override fun onTextChanged(oldText: String, newText: String) {
        text = "텍스트 값이 $oldText 에서 $newText 로 바뀌었다!!!"
        println(text)
    }

}

class TextView {
    private val listeners = listOf<TextChangedListener>(PrintingTextChangedListener())
    var text by Delegates.observable("없는 값") { _, old, new ->
        listeners.forEach { it.onTextChanged(old, new) }
    }
}

class ListenerPatton {
    @Test
    fun listener() {
        val textView = TextView()
        with(textView) {
            text = "013"
            text = "12321"
        }
    }
}
