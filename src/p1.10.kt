fun main(){
         var c = Car("range rover")
    println(c.price)
}
class Car(var color:String){
    var price:Double=0.0
    constructor(color:String,p:Double):this(color){
        price=p
    }

}