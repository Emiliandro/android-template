package android
import {{ cookiecutter.package_name }}.onnxmanager.OnnxHandler

class OnnxAppHandler {
     init {
         println(OnnxHandler.retrieveOnnxInfo())
     }
}

fun main() {
    OnnxAppHandler()
}
