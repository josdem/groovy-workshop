def isPalindrome (s, closure){
  if(closure(s)){
    println "Right"
  } else {
    println "Wrong"
  }
}

def validate  = { it == it.reverse() }
def word = "anitalavalatina"
isPalindrome(word, validate)
