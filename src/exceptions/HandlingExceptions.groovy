package exceptions


try {
    def error = 12 / 0
} catch (Exception e) {
    println e.getCause()
    println e.getMessage()
    // println e.printStackTrace()
}
def shouldRunAfterError = 'Hi there!'
println shouldRunAfterError
