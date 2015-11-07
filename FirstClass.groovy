class User {
  String name
  Date birthDate
  Profile profile

  String toString(){
    "$name $birthDate -> ${1*3*4}"
  }
}

class Profile {
  String twitter
  String github
}

def user = new User()
user.name = 'Juan'
user.birthDate = new Date() - 365 * 25
user.profile = new Profile(twitter:'https://twitter.com/josdem', github:'https://github.com/josdem')
println user
