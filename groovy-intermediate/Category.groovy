//How inject a method by category

class FormatUtil {
  static toFormat(number){
    if(number.size()==10){
      "${number[0..2]}-${number[3..5]}-${number[6..9]}"
    }
  }
}

use(FormatUtil){
  println "1234567890".toFormat()
}
