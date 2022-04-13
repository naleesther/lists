fun main(){
    names(listOf("Esther","Jane","Mary","Liesa","Jully","Nalenyi","Peter","Wanda","Vera","Virginia"))
    var x=getHeight(listOf(53,63,50,59,47,57))
    println(x)
    var ester = Person1("Esther",20,51,60)


    var namef= listOf(ester)
    println(namef.sortedByDescending {k->k.age })

    var namese=Person1("naima",19,120,75)
    var namesg= listOf(namese)
    println(namesg.plus(namef))

    var register1=Car("MKV",67)
    var register2=Car("KDA",31)
    var register3=Car("KDE",96)
    var register= listOf(1,2,3)
    println(register)
}


fun names(names:List<String>):List<String>{
     names.forEachIndexed { index, s ->
         if((index%2)==0){
             println(s)
     }
     }
    return names
}
fun getHeight(meters:List<Int>):String{
    var average= meters.average()
    var add= meters.sum()
    var total= "$average, $add"

    return total
}
data class Person1(var name:String,var age:Int,var height:Int,var weight:Int)


data class Car(var register:String,var mileage:Int)

fun car(text:List<Car>):Int{
    var loop=0
    text.forEach { x->x.mileage
        loop+=x.mileage
    }
    var total=loop/text.count()


    return total
}


