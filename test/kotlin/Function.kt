fun main(){
    val user = setUser("Sectio", "Bermain Game", 15)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby and im $age years old"