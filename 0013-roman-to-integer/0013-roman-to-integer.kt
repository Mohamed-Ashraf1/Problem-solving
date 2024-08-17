class Solution {
    fun romanToInt(s: String): Int {
        var map  =  hashMapOf( "I" to 1
                             ,"V" to 5
                             ,"X" to 10
                             ,"L" to 50
                             ,"C" to 100
                             ,"D" to 500
                             ,"M" to 1000)
        var i=0
        var result:Int=0
        while(i<s.length){
            if(i!=s.length-1){
                if(map["${s.get(i)}"]!!.compareTo(map["${s.get(i+1)}"]!!) >= 0){
                    result +=map["${s.get(i)}"]!!
                    i++
                }
                else{
                    result+= map["${s.get(i+1)}"]!!.minus(map["${s.get(i)}"]!!)
                    i+=2
                }
            }else{
                result +=map["${s.get(i)}"]!!
                i++
            }
            
        }
        return result
    }
}