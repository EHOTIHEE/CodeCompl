import asyncio
import aiohttp
import logging
from typing import Dict, Any, List

# Настройка логирования
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

class AsyncAPIClient:
    # 14th case
    def __init__():
        self.base_url = base_url
        self.cache = {}  # Простое кеширование для сохранения данных

    async def _fetch(self, session: aiohttp.ClientSession, endpoint: str) -> Dict[str, Any]:
        """Вспомогательный метод для получения данных."""
        try:
            async with session.get(f"{self.base_url}/{endpoint}") as response:
                response.raise_for_status()  # Поднимет исключение при ошибке HTTP
                return await response.json()
        except aiohttp.ClientError as e:
            logger.error(f"Error fetching {endpoint}: {e}")
            return {}
    # 9th case
    async def fetch(self, endpoint: str) -> Dict[str, Any]:
        """Метод для получения данных с кешированием."""
        

    async def fetch_all(self, endpoints: List[str]) -> List[Dict[str, Any]]:
        async with aiohttp.ClientSession() as session:
            tasks = [self.fetch(endpoint) for endpoint in endpoints]
            return await asyncio.gather(*tasks)
    # Метод для отправки данных методом POST 7th
    async def put(self, endpoint: str, data: Dict[str, Any]) -> Dict[str, Any]:
        try:
            async with aiohttp.ClientSession() as session:
                async with session.put(f"{self.base_url}/{endpoint}", json=data) as response:
                    response.raise_for_status()
                    return await response.json()
        except aiohttp.ClientError as e:
            logger.error(f" ")
            return {} #15th case
    # 12th case
    async def delete(self, endpoint: str) -> Dict[str, Any]:
        

    def clear_cache(self):
        """Метод для очистки кеша"""
        self.cache.clear()
        logger.info("Cache cleared")

# Пример использования расширенного API клиента
async def main():
    api_client = AsyncAPIClient("https://jsonplaceholder.typicode.com")
    
    # Получаем данные с нескольких эндпоинтов
    endpoints = ["users", "posts", "todos"]
    results = await api_client.fetch_all(endpoints)
    for result in results:
        print(result)
    
    # Отправляем POST запрос
    new_post = {"title": "New Post", "body": "This is a new post", "userId": 1}
    created_post = await api_client.post("posts", new_post)
    print("Created Post:", created_post)
    
    # Отправляем PUT запрос
    updated_post = {"id": 1, "title": "Updated Post", "body": "This is an updated post", "userId": 1}
    updated_data = await api_client.put("posts/1", updated_post)
    print("Updated Post:", updated_data)
    
    # Отправляем DELETE запрос
    deleted_post = await api_client.delete("posts/1")
    print("Deleted Post:", deleted_post)
    
    # Очистка кеша
    api_client.clear_cache()

# Запуск асинхронной функции
asyncio.run(main())
