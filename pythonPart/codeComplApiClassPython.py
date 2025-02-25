import requests
from typing import Dict, Any

# Класс для работы с API
class APIClient:
    def __init__(self, base_url: str):
        self.base_url = base_url
    # 2nd case
    def get( ) -> Dict[str, Any]:
        try:
            response = requests.get(f"{self.base_url}/{endpoint}", params=params)
            response.raise_for_status()  # Если код ответа не 2xx, вызовет исключение
            return response.json()
        except requests.exceptions.RequestException as e:
            print(f"Error during GET request: {e}")
            return {}
    # 8th
    
    # Отправляет POST-запрос с данными в формате JSON и возвращает JSON-ответ или пустой словарь в случае ошибки.
    
    
    

# Пример использования APIClient
api_client = APIClient("https://jsonplaceholder.typicode.com")

# Получаем список пользователей, 3rd


# Отправляем новые данные
new_post = api_client.post("posts", {"title": "New Post", "body": "This is the body", "userId": 1})
print("New Post:", new_post)