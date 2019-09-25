class Person {
    private String name
    private int age

    def getName() {
        return this.name
    }
    
    def getAge() {
        return this.age
    }

    def setName(String name) {
        this.name = name
    }

    def setAge(int age) {
        this.age = age
    }

    static main(args) {
        def person = new Person()
        // No need to write getters and setters // Better way
        person.name = 'John'
        person.age = 22
        println person.name
        println person.age    
        
        person.setName('Mary')
        person.setAge(33) 
        println person.getName()
        println person.getAge()  
    }
}