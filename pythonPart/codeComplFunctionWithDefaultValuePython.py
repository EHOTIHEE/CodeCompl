default_username = "john_doe"
default_email = "john@example.com"
default_age = 30
default_is_active = True  
 

# 16th case
class UserService:
    def create_user():
        # Создает пользователя с указанными параметрами
        return {
            "username": username,
            "email": email,
            "age": age,
            "is_active": is_active
        }
        
        