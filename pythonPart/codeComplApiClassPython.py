import requests
from typing import Dict, Any

# Class for working with API
class APIClient:
    def __init__(self, base_url: str):
        self.base_url = base_url
    # 2nd case
    def get() -> Dict[str, Any]:
        try:
            response = requests.get(f"{self.base_url}/{endpoint}", params=params)
            response.raise_for_status()  # Raises an exception if the status code is not 2xx
            return response.json()
        except requests.exceptions.RequestException as e:
            print(f"Error during GET request: {e}")
            return {}
    # 8th
    
    # Sends a POST request with data in JSON format and returns a JSON response or an empty dict in case of an error.
    
    
    

# Example usage of APIClient
api_client = APIClient("https://jsonplaceholder.typicode.com")

# Get the list of users, 3rd


# Send new data
new_post = api_client.post("posts", {"title": "New Post", "body": "This is the body", "userId": 1})
print("New Post:", new_post)
