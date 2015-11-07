class User {
  String name
  Date birthDate
  Profile profile

  String sayHi(){
    "Hola $name"
  }

  String toString(){
    "$name $birthDate -> ${sayHi()}"
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
