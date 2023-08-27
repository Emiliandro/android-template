package android
import onnxmanager.OnnxHandler

class OnnxAppHandler {
     init {
         println(OnnxHandler.retrieveOnnxInfo())
     }
}

fun main() {
    OnnxAppHandler()
}
