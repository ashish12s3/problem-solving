fun main() {
    println("\"42\" --> ${stringToNum("42")}")
    println("\"0\" --> ${stringToNum("0")}")
    println("\"42a\" --> ${stringToNum("42a")}")
    println("\"42a35\" --> ${stringToNum("42a35")}")
    println("\"abc42\" --> ${stringToNum("abc42")}")
    println("\"-42\" --> ${stringToNum("-42")}")

}

fun stringToNum(s:String):Int{
    if(s.isEmpty()){
        return 0;
    }
    
    var res:Int = 0
    var isNegative = false;
    
    for(c in s.toCharArray()){
        if(res == 0 && c== '-'){
            isNegative = true;
        }else if(c >= '0' && c<='9'){
            res = res*10 + (c.toInt()-48)
        }else{
            break;
        }
    }
    if(isNegative){
        return res * -1;
    }else{
        return res;
    }
    
}
