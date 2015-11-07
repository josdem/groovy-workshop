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
println user
