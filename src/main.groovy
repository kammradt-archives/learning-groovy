def startsWithLetterK = { word -> 
    word.startsWith('k')
}

assert startsWithLetterK('ak') == false
assert startsWithLetterK.call('ka') == true

def useMyClosure(closure, word) {
    closure.call(word)
}

assert useMyClosure(startsWithLetterK, "ake") == false
assert useMyClosure(startsWithLetterK, "kkk") == true


def map = ['key111':'value1', 'key123':'value123']
def map2 = ['key222':'value222', 'keyABC':'abcdef']
def amazingList = [ map, map2 ]
amazingList.each { json ->
    println "This is the JSON: ${json}"
}

def intList = [1, 2, 32, 100, 123, 321, 1, 123]
assert intList.find { item -> item == 123 } == 123
assert intList.find { item -> item == 'abc' } == null

assert intList.findAll { item -> item >= 100 } == [100, 123, 321, 123]

assert intList.any { item -> item >= 300 } == true
assert intList.any { item -> item >= 400 } == false

assert intList.every { item -> item > 0 } == true
assert intList.every { item -> item > 55 } == false

assert intList.collect { item -> item * 10 } == [10, 20, 320, 1000, 1230, 3210, 10, 1230]
assert intList == [1, 2, 32, 100, 123, 321, 1, 123]