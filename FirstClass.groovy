  //Agrega el ToString al codigo de Byte de la clase
@groovy.transform.ToString
class User {
  String name
  Date birthDate
  Profile profile
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
