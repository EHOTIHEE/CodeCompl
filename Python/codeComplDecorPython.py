import time
from functools import wraps

def time_logger(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()
        print(f"Function {func.__name__} took {end_time - start_time:.4f} seconds to execute.")
        return result
    return wrapper

# Пример функции, которая будет логироваться
@time_logger
def process_data(data):
    time.sleep(2)  # Симуляция долгой работы
    return f"Processed {len(data)} items"

# Вызов функции
result = process_data([1, 2, 3, 4, 5])
print(result)
