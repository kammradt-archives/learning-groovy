class MainClass {
    static void main(args) {
        println 'Hello rapazeada 2.0'

        def map = [:]
        map.put('key', [1 ,2, 3, [10, 20 ,30]])
        map.get('key').eachWithIndex { it, i ->
            println "Value for index ${i}: ${it}"
        }

        def size = 10
        0.upto(size) {
            print "${it} "
            if (it == size)
                print "last -> ${it}\n"
        }

        5.times { print it }
    }
}
